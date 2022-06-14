package webTestCases.controlPanel.clients;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import drivercapabilities.BaseSel;
import webPageObjects.controlPanel.clients.Activity;
import webPageObjects.controlPanel.clients.CP_Login;
import webPageObjects.controlPanel.clients.Registered_Business;

public class Verify_ProfileNotes extends BaseSel {

	public WebDriver driver;
	private  WebDriverWait wait;

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();

		driver.get(prop.getProperty("url"));
		wait = new WebDriverWait(driver,50);
	}

	@Test
	public void VerifyPNotes() throws InterruptedException {
		CP_Login cp = new CP_Login(driver);
		Registered_Business rb = new Registered_Business(driver);
		Activity act = new Activity(driver);

		cp.getLogin("muhammad.waleed@numumail.com", "123456");
		// Thread.sleep(5000);
		rb.getClients().click();
		act.activity().click();
		act.campApproval().click();
		act.approve().click();
		//act.cProfNotes().isDisplayed();
		act.cProfNotes().getText();
		
		String verify = wait.until(ExpectedConditions.visibilityOf(act.cProfNotes())).getText();
		System.out.println(" RESULT ::"+verify);
		Assert.assertEquals("Testing Data", verify);
	    Assert.assertTrue(true);
		
	
		
	}

	@AfterTest
	public void teardown() {

		driver.close();

	}
}
