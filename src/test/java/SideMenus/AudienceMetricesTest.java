package SideMenus;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import SideMenu.AudienceMetries;
import SideMenu.MyProfilePage;
import drivercapabilities.DC2;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AudienceMetricesTest extends DC2 {
//	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		@Test
		public void AudienceMeirces() throws MalformedURLException, InterruptedException {
			Thread.sleep(10000);
		    AndroidDriver<AndroidElement>  driver = capabilities();
		    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		    
	     	MyProfilePage sm = new MyProfilePage(driver);
	     	Thread.sleep(3000);
	        sm.getSideMenu().click();
	        Thread.sleep(1000);
	        sm.getMyProfile().click();
	        Thread.sleep(1000);
	        AudienceMetries am= new AudienceMetries(driver);
	        Thread.sleep(1000);
	        am.selectInstagramDetails().click();
	        Thread.sleep(1000);
	        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Update metrics\"));");
	        am.selectUpdateMetrics().click();
	        Thread.sleep(1000);
	        
	        am.setCitymetrics().click();
	        Thread.sleep(3000);
	      //  am.setImageSelect().click();
	        am.setImageSelect2().get(4).click();
	        Thread.sleep(3000);
	        am.setImageUpload().click();
	        Thread.sleep(3000);
	        
	        am.setCountrymetrics().click();
	        Thread.sleep(2000);
	        am.setImageSelect2().get(4).click();
	        am.setImageUpload().click();
	        Thread.sleep(2000);
	        
	        am.setAgemetrics().click();
	        Thread.sleep(3000);
	        am.setImageSelect2().get(4).click();
	        am.setImageUpload().click();
	        Thread.sleep(3000);
	        
	        am.setGendermetrics().click();
	        Thread.sleep(3000);
	        am.setImageSelect2().get(4).click();
	        am.setImageUpload().click();
	        Thread.sleep(3000);
	        
	        am.clickUpload().click();
	        Thread.sleep(5000);
	        am.clickGotit().click();
	       
	        
   }
}
