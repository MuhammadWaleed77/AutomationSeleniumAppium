package SideMenu;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyInterests {
	
	public MyInterests( AndroidDriver<AndroidElement>  driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); 
	}

	@AndroidFindBy(xpath="//android.widget.TextView[@text='My Interests']")
	public WebElement MyInterest;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Fashion']")
	public WebElement Fashion ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Family']")
	public WebElement Family ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Gaming & Tech']")
	public WebElement Gaming;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Update']")
	public WebElement Update;
	
	
	
	
////////////////////////////Get Methods ////////////////////////////
	
	public WebElement getMyInterest() {
		System.out.println(" MyInterest clicked ");
		return MyInterest;
	}
	public WebElement setFashion() {
		System.out.println(" Fashion clicked ");
		return Fashion;
	}
	public WebElement setFamily() {
		System.out.println(" Family clicked ");
		return Family;
	}
	public WebElement setGaming() {
		System.out.println(" Gaming & Tech clicked ");
		return Gaming;
	}
	public WebElement setUpdate() {
		System.out.println(" Update clicked ");
		return Update;
	}
}
