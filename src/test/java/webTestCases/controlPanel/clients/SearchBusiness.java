package webTestCases.controlPanel.clients;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import drivercapabilities.BaseSel;
import webPageObjects.controlPanel.clients.CP_Login;
import webPageObjects.controlPanel.clients.Clients;
import webPageObjects.controlPanel.clients.Registered_Business;

public class SearchBusiness extends BaseSel {
	public WebDriver driver;
	public BufferedImage img;
	

	@BeforeTest
	public void initialize() throws IOException, ClassNotFoundException, SQLException {
		driver = initializeDriver();
       
			// TODO Auto-generated method stub
			//
			String host = "numuworld-api-staging-database.cip1bixrtalr.eu-west-1.rds.amazonaws.com";
			String port = "3306";
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/stage-v3", "numuTestDB", "poisonContlearnDB21?");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("select secret_key from partnerships where title like  '%FWTest%'");
			while(rs.next()) {
				String secretKey = rs.getString(1);
				System.out.println(secretKey);
				driver.get("https://test.share.numuworld.com/c/"+secretKey);
			}
			con.close();
		
		

		//driver.get(prop.getProperty("url"+u));
		//driver.get("https://test.share.numuworld.com/c/"+secretKey);
	}
	
	@Test 
	public void testing() throws InterruptedException {
		CP_Login cp = new CP_Login(driver);
		Clients client = new Clients(driver);
		Registered_Business rb = new Registered_Business(driver);

		cp.getLogin("muhammad.waleed@numumail.com","123456");
		client.getClients().click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[.='Clients | Registered'])[1]")));
		client.getSearch().sendKeys("AutomationTestingOnly");
		client.getEditBusiness().click();
		Thread.sleep(5000);
		
		String imagePath = System.getProperty("user.dir") +"\\src\\test\\java\\resources\\lambo.png";
		//rb.getUpdateImg().click();
		//rb.getUpdateImg().sendKeys(imagePath);
		////Thread.sleep(2000);
		//rb.getCrop().click();
		//Thread.sleep(2000);
		
		rb.getBusinessName().sendKeys(Keys.chord(Keys.CONTROL, "a"));
		rb.getBusinessName().sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		rb.getBusinessName().sendKeys("AutomationTestingOnlyUpdated");

		rb.getUserName().sendKeys(Keys.chord(Keys.CONTROL, "a"));
		rb.getUserName().sendKeys(Keys.DELETE);
		rb.getUserName().sendKeys("AutomationTestingByWaleedUpdated");
		
		rb.getCompanyPass().sendKeys(Keys.chord(Keys.CONTROL, "a"));
		rb.getCompanyPass().sendKeys(Keys.DELETE);
		rb.getCompanyPass().sendKeys("123456");
		rb.getIndustry().click();
		rb.getBeauty().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,660)");
		//rb.getCountry().click();
		//rb.getSpain().click();
		//rb.getCity().click();
		//rb.getAlbacete().click();
		//rb.getLanguage().click();
		//rb.getEnglish().click();
		//rb.getCompanyUrl().clear();
		rb.getCompanyUrl().sendKeys(Keys.chord(Keys.CONTROL, "a"));
		rb.getCompanyUrl().sendKeys(Keys.DELETE);
		//Thread.sleep(1000);
		rb.getCompanyUrl().sendKeys("https://automationbyWaleed.com");
		//rb.getFirstName().clear();
		rb.getFirstName().sendKeys(Keys.chord(Keys.CONTROL, "a"));
		rb.getFirstName().sendKeys(Keys.DELETE);
		rb.getFirstName().sendKeys("Muhammad Waleed");
		rb.getLastName().sendKeys(Keys.chord(Keys.CONTROL,"a"));
		rb.getLastName().sendKeys(Keys.DELETE);
		rb.getLastName().sendKeys("SQA");
		
		rb.getPersonal_contact().sendKeys(Keys.chord(Keys.CONTROL,"a"));
		rb.getPersonal_contact().sendKeys(Keys.DELETE);
		rb.getPersonal_contact().sendKeys("34639712342");
		
		rb.getCompanyPhoneNumber().sendKeys(Keys.chord(Keys.CONTROL,"a"));
		rb.getCompanyPhoneNumber().sendKeys(Keys.DELETE);
		rb.getCompanyPhoneNumber().sendKeys("34639712342");
		Thread.sleep(1000);
		rb.getbusinessEmail().sendKeys(Keys.chord(Keys.CONTROL,"a"));
		rb.getbusinessEmail().sendKeys(Keys.DELETE);
		rb.getbusinessEmail().sendKeys("numu.client@gmail.com");
		//rb.getSameBusinessCheckbox().click();
		//rb.getInstagram().sendKeys("Automator's");
		//rb.getHashTag().sendKeys("AutomationTestingByWaleed");
		js.executeScript("window.scrollBy(0,660)");
		rb.getSameBusinessCheckbox().click();
		//rb.getSameNotificationsCheckbox().click();
		//Thread.sleep(2000);
		rb.getTFN().sendKeys(Keys.chord(Keys.CONTROL,"a"));
		rb.getTFN().sendKeys(Keys.DELETE);
		rb.getTFN().sendKeys("77");
		
		rb.getVAT().sendKeys(Keys.chord(Keys.CONTROL,"a"));
		rb.getVAT().sendKeys(Keys.DELETE);
		rb.getVAT().sendKeys("77");
		
		rb.getBillingAddress().sendKeys(Keys.chord(Keys.CONTROL,"a"));
		rb.getBillingAddress().sendKeys(Keys.DELETE);
		rb.getBillingAddress().sendKeys("NUMU G8 Markaz");
		js.executeScript("window.scrollBy(0,660)");
		
		rb.getBusinessDescription().sendKeys(Keys.chord(Keys.CONTROL,"a"));
		rb.getBusinessDescription().sendKeys(Keys.DELETE);
		rb.getBusinessDescription().sendKeys(
				"This company will be used for Automated testing only please don't use this for other purposes.");
		Thread.sleep(2000);
		
	
		//((JavascriptExecutor) driver).executeScript("document.getElementByClassName('sc-hFrEEg fdyYRa').style.display='block'';");
		//rb.getBannerBackground().sendKeys(imagePath);
		//Thread.sleep(3000);
		//rb.getBannerCrop().click();
		rb.getUpdateCompany().click();
		WebElement toast = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Company has been updated successfully.']")));
		rb.getUpdateToast().isDisplayed();
	}
	
	
	@AfterTest
	public void teardown() {

		driver.close();

	}
}
