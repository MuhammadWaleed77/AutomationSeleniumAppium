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

public class Verify_ProfileNotes extends BaseSel {

	public WebDriver driver;

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();

		driver.get(prop.getProperty("url"));
	}

	@Test
	public void VerifyPNotes() throws InterruptedException {
		CP_Login cp = new CP_Login(driver);
		Registered_Business rb = new Registered_Business(driver);

		cp.getLogin();
		// Thread.sleep(5000);
		rb.getClients().click();
		
		
		
	}

	@AfterTest
	public void teardown() {

		driver.close();

	}
}
