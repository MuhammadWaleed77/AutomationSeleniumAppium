package webTestCases.clientPanel.promoFlow;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import drivercapabilities.BaseSel;
import webPageObjects.clientPanel.ClientP_Login;
import webPageObjects.clientPanel.GenericMethods;
import webPageObjects.clientPanel.PromoFlow;

public class Check extends BaseSel {

	public WebDriver driver;

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("c_url"));
	}

	@Test
	public void single_ProdMoney_Camp() throws InterruptedException {
		ClientP_Login clp = new ClientP_Login(driver);
		clp.clientPortalLogin();
		Thread.sleep(5000);
		PromoFlow pf = new PromoFlow(driver);
		GenericMethods g = new GenericMethods(driver);
		g.btn().click();
		g.wbtn().click();
		Thread.sleep(4000);
        g.getABC("Waleed");
        Thread.sleep(4000);
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
}
