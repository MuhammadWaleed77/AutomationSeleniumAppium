package webPageObjects.controlPanel.clients;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CP_Login {
	public WebDriver driver;

	public CP_Login(WebDriver driver) {
		this.driver = driver;
	}

	private By name = By.cssSelector("input[name='username']");
	private By password = By.cssSelector("input[name='password']");
	private By submitBtn = By.cssSelector("button[type='submit']");
	private By invalidEmail = By.xpath("//div[contains(text(),'employee_not_found')]");
	private By invalidPass = By.xpath("//div[.='invalid password']");
	

	
	public void getLogin(String ename, String pasword) {
		driver.findElement(name).sendKeys(ename);
		driver.findElement(password).sendKeys(pasword);
		driver.findElement(submitBtn).click();

	}
	
	public WebElement getEmailToast() {
		return driver.findElement(invalidEmail);
	}
	public WebElement getPasswordToast() {
		return driver.findElement(invalidPass);
	}
}
