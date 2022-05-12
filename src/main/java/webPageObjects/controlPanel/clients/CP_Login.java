package webPageObjects.controlPanel.clients;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CP_Login {
	public WebDriver driver;

	public CP_Login(WebDriver driver) {
		this.driver = driver;
	}

	private By name = By.cssSelector("input[name='username']");
	private By password = By.cssSelector("input[name='password']");
	private By submitBtn = By.cssSelector("button[type='submit']");

	public void getLogin() {
		driver.findElement(name).sendKeys("muhammad.waleed@numumail.com");
		driver.findElement(password).sendKeys("123456");
		driver.findElement(submitBtn).click();

	}
}
