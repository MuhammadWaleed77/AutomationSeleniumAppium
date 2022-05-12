package SideMenu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyProfilePage {
	public MyProfilePage(AndroidDriver<AndroidElement> driver) {
      
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); 
}
	
	/*@AndroidFindBy(className="android.widget.ImageView")
	public List<WebElement> profile;*/
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@checked='false'])[2]")
	public WebElement prof;
	
	/////////////My Profile /////////////////////////////////////
	@AndroidFindBy(xpath="//android.widget.TextView[@text='My Profile']")
	public WebElement myProfile;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")
	public WebElement dp;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.EditText")
	public WebElement fullName;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement gender;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.EditText")
	public WebElement click_dob;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.EditText")
	public WebElement clickMonth;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.EditText")
	public WebElement clickDate;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.EditText")
	public WebElement clickYear;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
	@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
	@AndroidFindBy(id="android:id/button1")
	public WebElement ok ;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.EditText")
	public WebElement email;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.EditText")
	public WebElement notificationEmail;
	
	//driver.findElementByAndroidUIAutomator(("attribute(\"value\")"))
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.EditText")
	public WebElement country;
	
	
	@AndroidFindBy(className="android.widget.EditText")
	public WebElement search;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Spain']")
	public WebElement spain;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.widget.EditText")
	public WebElement city;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Albacete']")
	public WebElement Albacete;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[8]/android.view.ViewGroup/android.widget.EditText")
	public WebElement language;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='English']")
	public WebElement English ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Save']")
	public WebElement Save ;

	
	
	
	
	
	////////////////////////////Get Methods ////////////////////////////
	
	public WebElement getSideMenu() {
		System.out.println("Side Menu clicked ");
		return prof;
	}
	public WebElement getMyProfile() {
		System.out.println("My Profile clicked ");
		return myProfile;
	}
	public WebElement setDP() {
		System.out.println("Profile Picture clicked ");
		return dp;
	}
	
	public WebElement setFullName() {
		System.out.println("Full Name Entered ");
		return fullName;
    }
	public WebElement setGender() {
		System.out.println("Gender Clicked ");
		return gender;
	}
	public WebElement getDOB() {
		System.out.println("DOB Entered ");
		return click_dob;
	}
	public WebElement clickMonth() {
		System.out.println("Month clicked ");
		return clickMonth;
	}public WebElement clickDate() {
		System.out.println("Date clicked ");
		return clickDate;
	}
	public WebElement clickYear() {
		System.out.println("Year clicked ");
		return clickYear;
	}
	
	
	public WebElement getOkBtn() {
		System.out.println("OK Clicked ");
		return ok;
	}
	public WebElement setEmail() {
		System.out.println("Email Entered ");
		return email;
	}
	public WebElement setNotificationEmail() {
		System.out.println("notificationEmail Entered ");
		return notificationEmail;
	}
	public WebElement selectCountry() {
		System.out.println("Country clicked ");
		return country;
	}
	public WebElement selectSearch() {
		System.out.println("Search clicked ");
		return search;
	}
	public WebElement selectSpain() {
		System.out.println("Spain clicked ");
		return spain;
	}
	public WebElement selectCity() {
		System.out.println(" City clicked ");
		return city ;
	}
	public WebElement selectAlbacete() {
		System.out.println("Albacete clicked ");
		return Albacete ;
	}
	public WebElement selectlLanguage() {
		System.out.println("language clicked ");
		return language ;
	}
	public WebElement selectEnglish() {
		System.out.println(" English clicked ");
		return English ;
	}
	public WebElement selectSave() {
		System.out.println(" Save clicked ");
		return Save ;
	}
	
	
	
}
