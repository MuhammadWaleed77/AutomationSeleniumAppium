package SideMenus;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import SideMenu.MyInterests;
import SideMenu.MyProfilePage;
import drivercapabilities.DC2;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MyInterestTest extends DC2{
	//public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
       
	    
	 @Test
		public void Interest() throws MalformedURLException, InterruptedException {
	    	Thread.sleep(10000);
			AndroidDriver<AndroidElement>  driver = capabilities();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(10000);
		
		MyInterests mt = new MyInterests(driver);
		MyProfilePage sm = new MyProfilePage(driver);
		Thread.sleep(10000);
		sm.getSideMenu().click();
		mt.getMyInterest().click();
		mt.setFashion().click();
		mt.setFamily().click();
		mt.setGaming().click();
		mt.setUpdate().click();
		
		
		
	}
}
