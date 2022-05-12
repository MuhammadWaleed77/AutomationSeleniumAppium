package campaignApplyObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Prod_Money_Campaign {
	
	public Prod_Money_Campaign (AndroidDriver<AndroidElement> driver ) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.Button[4]/android.widget.ImageView")
	public WebElement search;
	
	/*@AndroidFindBy(xpath="")
	public WebElement ;
	
	@AndroidFindBy(xpath="")
	public WebElement ;
	
	@AndroidFindBy(xpath="")
	public WebElement ;
	
	@AndroidFindBy(xpath="")
	public WebElement ;*/
	
	
////////////////////////////Get Methods //////////////////////////////////////////////
	
	public WebElement Search () {
		System.out.println(" Search Clicked ");
		return search ;
	}
	
	/*public WebElement  () {
		System.out.println("");
		return ;
	}
	public WebElement  () {
		System.out.println("");
		return ;
	}
	
	public WebElement  () {
		System.out.println("");
		return ;
	}
	
	public WebElement  () {
		System.out.println("");
		return ;
	}*/
	
}
