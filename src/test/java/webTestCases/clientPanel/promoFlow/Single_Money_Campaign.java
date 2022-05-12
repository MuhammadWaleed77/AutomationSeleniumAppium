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
import webPageObjects.clientPanel.PromoFlow;

public class Single_Money_Campaign extends BaseSel {

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
		//pf.iframe();
		pf.initialStepsPFlow("SingleProdMoney");
		
		pf.requestAndContentTab();
		pf.increaseBalance();
        
		
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
}
