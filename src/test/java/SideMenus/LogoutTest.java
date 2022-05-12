package SideMenus;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import SideMenu.MyProfilePage;
import drivercapabilities.DC2;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LogoutTest extends DC2 {

	//	public static void main(String[] args) throws MalformedURLException, InterruptedException {
			// TODO Auto-generated method stub

	    @Test
		public void logout() throws MalformedURLException, InterruptedException {
	    	Thread.sleep(10000);
			AndroidDriver<AndroidElement>  driver = capabilities();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(10000);
			
			MyProfilePage sm = new MyProfilePage(driver);
			
		    sm.getSideMenu().click();
		    
		    driver.findElementByAndroidUIAutomator("text(\"Logout\")").click();
		    driver.findElementByAndroidUIAutomator("text(\"Proceed\")").click();
		    System.out.println("Logout Sucessull");


		
	}

}

