package webTestCases.controlPanel.clients;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import drivercapabilities.BaseSel;
import webPageObjects.controlPanel.clients.CP_Login;
import webPageObjects.controlPanel.clients.Registered_Business;

public class BusinessRegister extends BaseSel {

	public WebDriver driver;

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();

		driver.get(prop.getProperty("url"));
	}

	@Test
	public void registerBusiness() throws InterruptedException {
		CP_Login cp = new CP_Login(driver);
		Registered_Business rb = new Registered_Business(driver);

		cp.getLogin();
		// Thread.sleep(5000);
		rb.getClients().click();
		rb.getRegistered().click();
		rb.getAddNew().click();
		// Thread.sleep(5000);
		rb.getUploadbtn().sendKeys("C:\\Users\\Numu\\Downloads\\Pictures\\Automation.png");
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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,660)");
		rb.getCountry().click();
		rb.getSpain().click();
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
		rb.getbusinessEmail().sendKeys("numu.client@gmail.com");
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
		
	
		//((JavascriptExecutor) driver).executeScript("document.getElementByClassName('sc-hFrEEg fdyYRa').style.display='block'';");
		rb.getBannerBackground().sendKeys("C:\\Users\\Numu\\Downloads\\Pictures\\Automation.png");
		Thread.sleep(3000);
		rb.getBannerCrop().click();
		rb.getRegisterCompany().click();
		Thread.sleep(6000);
		rb.getToast().isDisplayed();
		
		/*String s = rb.getToast().getText();
		System.out.println(s);*/
		/*Thread.sleep(2000);
		 if (s=="Company has been created successfully.")
		 {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}*/
		
		
	}

	@AfterTest
	public void teardown() {

		driver.close();

	}
}
