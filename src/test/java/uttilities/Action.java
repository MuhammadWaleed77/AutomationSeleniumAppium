package uttilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import drivercapabilities.BaseSel;

public class Action extends BaseSel {


	public WebDriver driver;
	
	public void ActionPerform(WebElement enterInput) throws InterruptedException {
		
		
			Actions a = new Actions(driver);
			a.moveToElement(enterInput).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			Thread.sleep(2000);
	}
	
   public void Scroll (WebElement enterInput) throws InterruptedException {
	     JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",enterInput);
		 Thread.sleep(2000);
   }
   

}
