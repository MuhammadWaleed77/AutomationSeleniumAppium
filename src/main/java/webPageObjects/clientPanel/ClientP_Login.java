package webPageObjects.clientPanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClientP_Login {
	public WebDriver driver;
	
    public ClientP_Login(WebDriver driver) {
    	this.driver = driver;
    }
    
    private By email = By.cssSelector("input[name='email']");
    private By password = By.cssSelector("input[name='password']");
    private By loginBtn = By.cssSelector("button[type='submit']");
    
    public void clientPortalLogin() {
    	driver.findElement(email).sendKeys("AutomationTestingByWaleed");
    	driver.findElement(password).sendKeys("123456");
    	driver.findElement(loginBtn).click();
    }
}
