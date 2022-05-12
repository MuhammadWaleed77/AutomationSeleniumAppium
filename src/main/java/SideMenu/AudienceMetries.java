package SideMenu;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AudienceMetries {
	
	public AudienceMetries (AndroidDriver<AndroidElement>  driver ) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); 
	}

	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='INSTAGRAM DETAILS']")
	public WebElement instagram; 
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Update metrics']")
	public WebElement metrics;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='City metrics']")
	public WebElement Citymetrics;
	
	/*@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\\\"avatar_origami_panda.png, 16.04 kB, Jan 24\\\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[2]]")
	public WebElement ImageSelect;*/
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Crop']")
	public WebElement ImageUpload;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Country metrics']")
	public WebElement Countrymetrics;
	
	@AndroidFindBy(className="android.widget.ImageView")
	public List<WebElement> ImageSelect2;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Age metrics']")
	public WebElement Agemetrics;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Gender metrics']")
	public WebElement Gendermetrics;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Upload']")
	public WebElement Upload;
	
	@AndroidFindBy(uiAutomator="text(\"Got it!\")")
	public WebElement gotit;
	
////////////////////////////Get Methods ////////////////////////////
	
	public WebElement selectInstagramDetails() {
		System.out.println(" INSTAGRAM DETAILS clicked ");
		return instagram; 
	}
	
	public WebElement selectUpdateMetrics() {
		System.out.println(" Update Metrics clicked ");
		return metrics;
	}
	public WebElement setCitymetrics() {
		System.out.println(" City metrics clicked ");
		return Citymetrics;
	}
	/*public WebElement setImageSelect() {
		System.out.println(" Image Selected ");
		return ImageSelect;*
	}*/
	public WebElement setImageUpload() {
		System.out.println(" Image Upload Selected ");
		return ImageUpload;
	}
	
	public WebElement setCountrymetrics() {
		System.out.println(" Country metrics clicked ");
		return Countrymetrics;
	}
	
	public List<WebElement> setImageSelect2() {
		System.out.println(" ImageSelect2 Selected ");
		return ImageSelect2;
	}
	
	public WebElement setAgemetrics() {
		System.out.println(" Age metrics clicked ");
		return Agemetrics;
	}
	public WebElement setGendermetrics() {
		System.out.println(" Gender metrics clicked ");
		return Gendermetrics;
	}
	
	public WebElement clickUpload() {
		System.out.println(" Upload clicked ");
		return Upload;
	}
	public WebElement clickGotit() {
		System.out.println(" Gotit clicked ");
		return gotit;
	}

	
}
