package webTestCases.controlPanel.clients;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import drivercapabilities.BaseSel;
import webPageObjects.controlPanel.clients.CP_Login;
import webPageObjects.controlPanel.clients.Clients;
import webPageObjects.controlPanel.clients.Registered_Business;

public class BusinessRegister extends BaseSel {

	public WebDriver driver;
	public BufferedImage img;

	@BeforeMethod
	public void initialize() throws IOException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	/*@Test
	public void registerBusiness() throws InterruptedException {
		CP_Login cp = new CP_Login(driver);
		Registered_Business rb = new Registered_Business(driver);

		cp.getLogin("muhammad.waleed@numumail.com","123456");
		 Thread.sleep(5000);
		//rb.getClients().click();
		rb.getRegistered().click();
		rb.getAddNew().click();
		//JavascriptExecutor jst = (JavascriptExecutor) driver;
		
		// Thread.sleep(5000);
		//rb.getUploadbtn().sendKeys("C:\\Users\\Numu\\Downloads\\Pictures\\Automation.png");
		String imagePath = "/Users/numuqa/git/AutomationSeleniumAppium/src/test/java/resources/Automation.png";
				//System.getProperty("user.dir") +"\\src\\test\\java\\resources\\Automation.png";
		rb.getUploadbtn().sendKeys(imagePath);
		Thread.sleep(2000);
		rb.getCrop().click();
		Thread.sleep(2000);
		rb.getBusinessName().sendKeys("AutomationTestingOnly");
		rb.getUserName().sendKeys("AutomationTestingByWaleed");
		rb.getCompanyPass().sendKeys("123456");
		//Select dropdown = new Select(staticDropDOwn);
		//dropdown.selectByIndex(3);
		rb.getIndustry().click();
		rb.getFashion().click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		 
		rb.getCountry().click();
		rb.getSpain().click();
		Thread.sleep(2000);
		rb.getCity().click();
		rb.getAlbacete().click();
		rb.getLanguage().click();
		rb.getEnglish().click();
		rb.getCompanyUrl().sendKeys("https://abc.com");
		rb.getFirstName().sendKeys("Muhammad");
		rb.getLastName().sendKeys("Waleed");
		rb.getPersonal_contact().sendKeys("639712342");
		rb.getCompanyPhoneNumber().sendKeys("639712342");
		Thread.sleep(1000);
		rb.getbusinessEmail().sendKeys("nuu.cient@gmail.com");
		rb.getSameBusinessCheckbox().click();
		rb.getInstagram().sendKeys("Automator's");
		rb.getHashTag().sendKeys("AutomationTestingByWaleed");
		js.executeScript("window.scrollBy(0,660)");
		rb.getSameBusinessCheckbox().click();
		rb.getSameNotificationsCheckbox().click();
		//Thread.sleep(2000);
		rb.getTFN().sendKeys("7");
		rb.getVAT().clear();
		rb.getVAT().sendKeys("7");
		
		rb.getBillingAddress().sendKeys("G8 Markaz");
		js.executeScript("window.scrollBy(0,660)");
		rb.getBusinessDescription().sendKeys(
				"This company is being used for Automated testing only please don't use this for other purposes.");
		Thread.sleep(2000);
	     WebElement bckGround = driver.findElement(By.xpath("(//div[@class='sc-hKdnnL bwxQGS'])[1]"));
		 js.executeScript("arguments[0].scrollIntoView(true);",bckGround);
		 Thread.sleep(2000);
		 
		//js.executeScript("window.scrollBy(0,660)");
		//((JavascriptExecutor) driver).executeScript("document.getElementByClassName('sc-hFrEEg fdyYRa').style.display='block'';");
		//rb.getBannerBackground().sendKeys(imagePath);
		File file = new File(imagePath);
		//rb.getBannerBackground().click();
		rb.getBannerBackground().sendKeys(imagePath);
		System.out.println("zzzzzzzzzzz");
		Thread.sleep(3000);
		rb.getBannerCrop().click();
		rb.getRegisterCompany().click();
		Thread.sleep(6000);
		rb.getToast().isDisplayed();
		
		
		
	}*/
      @Test //(dependsOnMethods= {"registerBusiness"})
	public void modifyBusiness() throws InterruptedException {
		CP_Login cp = new CP_Login(driver);
		Clients client = new Clients(driver);
		Registered_Business rb = new Registered_Business(driver);

		cp.getLogin("muhammad.waleed@numumail.com","123456");
		//client.getClients().click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[.='Clients | Registered'])[1]")));
		client.getSearch().sendKeys("AutomationTestingOnly");
		Thread.sleep(2000);
		client.getEditBusiness().click();
		Thread.sleep(5000);
		
		String imagePath = System.getProperty("user.dir") +"\\src\\test\\java\\resources\\lambo.png";
		//rb.getUpdateImg().click();
		//rb.getUpdateImg().sendKeys(imagePath);
		////Thread.sleep(2000);
		//rb.getCrop().click();
		Thread.sleep(2000);
		
		//rb.getBusinessName().sendKeys(Keys.chord(Keys.CONTROL, "a"));
		
		Actions a = new Actions(driver);
		WebElement buisnessName = driver.findElement(By.xpath("//input[@name='businessName']"));
		a.moveToElement(buisnessName).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		rb.getBusinessName().sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		rb.getBusinessName().clear();
		Thread.sleep(2000);
		rb.getBusinessName().sendKeys("AutomationTestingOnlyUpdated");

		WebElement userName = driver.findElement(By.xpath("//input[@name='userName']"));
		a.moveToElement(userName).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		rb.getUserName().sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		rb.getUserName().clear();
		Thread.sleep(1000);
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
		
		WebElement CompanyUrl = driver.findElement(By.xpath("//input[@name='website']"));
		a.moveToElement(CompanyUrl).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		rb.getCompanyUrl().sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		rb.getCompanyUrl().clear();
		Thread.sleep(1000);
		rb.getCompanyUrl().sendKeys("https://automationbyWaleed.com");
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstName']"));
		a.moveToElement(FirstName).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		rb.getFirstName().sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		rb.getFirstName().clear();
		Thread.sleep(1000);
		rb.getFirstName().sendKeys("Muhammad Waleed");
		
		/*System.getProperty("os.name");
		System.out.println(System.getProperty("os.name"));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");*/
		
		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastName']"));
		a.moveToElement(LastName).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		rb.getLastName().sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		rb.getLastName().clear();
		Thread.sleep(1000);
		rb.getLastName().sendKeys("SQA");
		
		WebElement Personal_contact = driver.findElement(By.xpath("//input[@name='personal_contact']"));
		a.moveToElement(Personal_contact).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		rb.getPersonal_contact().sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		rb.getPersonal_contact().clear();
		Thread.sleep(1000);
		rb.getPersonal_contact().sendKeys("34639712342");
		
		WebElement CompanyPhoneNumber = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		a.moveToElement(CompanyPhoneNumber).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		rb.getCompanyPhoneNumber().sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		rb.getCompanyPhoneNumber().clear();
		Thread.sleep(1000);
		rb.getCompanyPhoneNumber().sendKeys("34639712342");
		
		Thread.sleep(1000);
		WebElement businessEmail = driver.findElement(By.xpath("//input[@name='email']"));
		a.moveToElement(businessEmail).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		rb.getbusinessEmail().sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		rb.getbusinessEmail().clear();
		Thread.sleep(1000);
		rb.getbusinessEmail().sendKeys("nuu.client@gail.com");
		//rb.getSameBusinessCheckbox().click();
		//rb.getInstagram().sendKeys("Automator's");
		//rb.getHashTag().sendKeys("AutomationTestingByWaleed");
		js.executeScript("window.scrollBy(0,660)");
		rb.getSameBusinessCheckbox().click();
		//rb.getSameNotificationsCheckbox().click();
		//Thread.sleep(2000);
		
		WebElement TFN = driver.findElement(By.xpath("//input[@name='TFN']"));
		a.moveToElement(TFN).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		rb.getTFN().sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		rb.getTFN().clear();
		Thread.sleep(1000);
		rb.getTFN().sendKeys("77");
		
		WebElement VAT = driver.findElement(By.xpath("//input[@name='VAT']"));
		a.moveToElement(VAT).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		rb.getVAT().sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		rb.getVAT().clear();
		Thread.sleep(1000);
		rb.getVAT().sendKeys("77");
		
		WebElement BillingAddress = driver.findElement(By.xpath("//input[contains(@name,'billing_address')]"));
		a.moveToElement(BillingAddress).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		rb.getBillingAddress().sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		rb.getBillingAddress().clear();
		Thread.sleep(1000);
		rb.getBillingAddress().sendKeys("NUMU G8 Markaz");
		
		js.executeScript("window.scrollBy(0,660)");
		
		WebElement BusinessDescription = driver.findElement(By.xpath("//textArea[contains(@name,'description')]"));
		a.moveToElement(BusinessDescription).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		rb.getBusinessDescription().sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		rb.getBusinessDescription().clear();
		Thread.sleep(1000);
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
	
	
	@AfterMethod
	public void teardown() {

		driver.close();

	}
}
