package webPageObjects.clientPanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import drivercapabilities.BaseSel;

public class GenericMethods extends BaseSel {
	
	public WebDriver driver;

	public GenericMethods(WebDriver driver) {
		this.driver = driver;
	}

	private By newCamBtn = By.xpath("//span[text()='NEW CAMPAIGN']");
	private By cstmCamp = By.xpath("//p[text()='Custom campaign']");
	private By campTitle = By.id("title");
	
	 public WebElement btn() {
		   return driver.findElement(newCamBtn);
		 
	   }
	   public WebElement wbtn() {
		   return driver.findElement(cstmCamp);
		 
	   }
	
	public void  getABC( String user ) {
	sendKeys(campTitle, user);
}
	public void sendKeys(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
}
