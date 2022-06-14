package webTestCases.controlPanel.users;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import drivercapabilities.BaseSel;
import webPageObjects.controlPanel.clients.CP_Login;
import webPageObjects.controlPanel.clients.Registered_Business;
import webPageObjects.controlPanel.users.Registered_Users;



public class UserRegister extends BaseSel {
	public WebDriver driver;

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();

		driver.get(prop.getProperty("url"));
	}

	@Test
	public void registerUser() throws InterruptedException, IOException, ParseException {
		Registered_Users ru = new Registered_Users(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		CP_Login cp = new CP_Login(driver);
		

		cp.getLogin("muhammad.waleed@numumail.com" , "123456");

		ru.getUsers().click();
		ru.getRegisteredusers().click();
		Thread.sleep(1000);
		ru.getAddNew().click();

		ru.getEnterInstaname().click();
		// Thread.sleep(2000);
		ru.getEnterNameToGenerate().sendKeys("sleepy_cat312");
		ru.getScrapetextField().click();
		//Thread.sleep(3000);
		/*JSONParser jsonParser = new JSONParser();
		
		FileReader reader = new FileReader("C:/Users/Numu/Downloads/sleepy.json");
		//Read JSON file
		Object obj = jsonParser.parse(reader);*/
		
		ru.getScrapetextField().sendKeys(ScrapedData.userScrapedData);
		//ru.getScrapetextField().sendKeys(obj);
		ru.getClickScrape().click();
		// Thread.sleep(2000);
		/*ru.getGenerateAndOpen().click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		// Switch to Parent to CHild Window as driver is only invoked for parent window
		driver.switchTo().window(childId);
		ru.getScrapedData().sendKeys(Keys.chord(Keys.CONTROL,"a"));
		ru.getScrapedData().sendKeys(Keys.chord(Keys.CONTROL,"c"));
		driver.switchTo().window(parentId);
		//ru.getScrapetextField().sendKeys(null);*/
		
		// Thread.sleep(2000);

		ru.getSameNameCheckBox().click();
		ru.getContactNumber().sendKeys("639712342");
		ru.getFullName().sendKeys("sleepy_cat3112");
		ru.getEmail().sendKeys("hsh@gmail.com");
		ru.getGender().click();
		ru.getMale().click();
		ru.getAge().click();
		ru.getAgeOther().click();
		js.executeScript("window.scrollBy(0,660)");
		ru.getSameEmailCheckBox().click();
		ru.getAskPricePost().sendKeys("1");
		ru.getAskPriceReel().sendKeys("1");
		ru.getAskPriceStory().sendKeys("1");
		ru.getCountry().click();
		ru.getSpain().click();
		ru.getCity().click();
		ru.getAlbacete().click();
		ru.getType().click();
		ru.getSelectPaypal().click();
		ru.getPaypal().click();
		ru.getShippingAdress().sendKeys(" NuMU center 1");
		ru.getShippingUnit().sendKeys("12");
		ru.getPostalCode().sendKeys("123ABC");
		ru.getOccupation().click();
		ru.getSelectIndividual().click();
		ru.getSameFullName().click();
		ru.getIdPassport().sendKeys("1A2B3C");
		ru.getHealth().click();
		js.executeScript("window.scrollBy(0,400)");
		ru.getAddUserClick().click();
		Thread.sleep(5000);
		ru.getToast().isDisplayed();
		System.out.println(ru.getToast().getText());
		//*[text()='Member has been updated successfully.']
		//*[text()='Member has been added successfully.']
	}

	@AfterTest
	public void teardown() {

		driver.close();

	}
}
