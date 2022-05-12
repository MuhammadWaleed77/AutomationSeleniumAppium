package SideMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import drivercapabilities.AppDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SetupAccount {
	
	

	public SetupAccount(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); 
		
      }

	
	@FindBy(xpath="//android.widget.TextView[@text='English']")
	public WebElement language;

	@FindBy(xpath="//android.widget.TextView[@text='Confirm / Confirmar']")
	public WebElement btn;
	
	@FindBy(xpath="//android.widget.EditText[@text='Type your username']")
	public WebElement username;
	
	//Next Button
	@FindBy(xpath="//android.widget.TextView[@text='Next']")
	public WebElement nextbtn;
	
	@FindBy(xpath="//android.widget.EditText[@text='Type your password']")
	public WebElement password;
	
	@FindBy(xpath="//android.widget.TextView[@text='Login']")
	public WebElement loginbtn;
	
	@FindBy(xpath="//*[@text='Invalid email']")
	private WebElement text;
	
	
   ///////////////// get Methods///////////////////////////////////////
	By butn = By.xpath("//android.widget.TextView[@text='English']");
	By uname = By.xpath("//android.widget.EditText[@text='Type your username']");
	public void login () {
		language.click();
		new WebDriverWait(AppDriver.getDriver(),20).until(ExpectedConditions.presenceOfElementLocated(butn));
		btn.click();
		new WebDriverWait(AppDriver.getDriver(),20).until(ExpectedConditions.presenceOfElementLocated(uname));
		
		username.sendKeys("hsh@gmail.com");
		nextbtn.click();
		password.sendKeys("123456");
		loginbtn.click();
	} 
	public WebElement getLanguage() {
		System.out.println("Language English");
		 return language;
	 }
	public WebElement getConfirmBtn() {
		System.out.println("Confirm / Confirmar");
		 return btn;
	 }
	 
	public WebElement getEmail() {
		System.out.println(" Enter Email");
		 return username;
	 }
	public WebElement getNextButton() {
		System.out.println("Next button clicked");
		return nextbtn;
	}
	public WebElement getPassword() {
		System.out.println("Password Enter Login");
		return password;
	}
	public WebElement getLoginBtn() {
		System.out.println("Login Button Clicked");
		return loginbtn;
	}
	public WebElement getText() {
		System.out.println("Text Found");
		return text;
	}
}

 