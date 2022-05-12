package webTestCases.clientPanel.promoFlow;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import drivercapabilities.BaseSel;
import webPageObjects.clientPanel.ClientP_Login;
import webPageObjects.clientPanel.PromoFlow;

public class Campaign_SaveAs_Draft extends BaseSel {

	public WebDriver driver;
	private WebDriverWait wait;

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("c_url"));
		wait = new WebDriverWait(driver,50);
	}

	@Test
	public void saveAsDraft() throws InterruptedException {
		ClientP_Login clp = new ClientP_Login(driver);
		clp.clientPortalLogin();
		Thread.sleep(5000);
		PromoFlow pf = new PromoFlow(driver);
		//pf.iframe();
		pf.initialStepsPFlow("SingleProdMoney");
		pf.selectMoneyCampaign();
		pf.addProduct();
        
		WebElement aaddBtn = driver.findElement(By.xpath("//*[text()='Add']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", aaddBtn);
		Thread.sleep(2000);
		
		pf.addProduct_ContentImages();
		pf.saveDraftBtn().click();
		String toastmsg= wait.until(ExpectedConditions.visibilityOf(pf.draftToast())).getText();
		
		 System.out.println(" RESULT ::"+toastmsg);
    	 //.getAttribute("name");
 		Assert.assertEquals("Successfully saved to draft !", toastmsg);
		
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
}
