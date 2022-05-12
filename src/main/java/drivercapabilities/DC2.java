package drivercapabilities;

import java.io.File;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;



public class DC2 {
	public static AndroidDriver<AndroidElement> capabilities  () throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
	//	File appDir = new File("src");
	//	File app = new File(appDir, "Numu.apk");

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		//dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	//	dc.setCapability("appActivity", ".ui.activity.IntroSlideShowActivity");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator3");
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,14);
			dc.setCapability(MobileCapabilityType.NO_RESET,true);
	//	dc.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	
		dc.setCapability("appPackage","com.numu.app"); 
		
	    dc.setCapability("appActivity","com.numu.app.MainActivity"); 
	    dc.setCapability("autoGrantPermissions", true);
	    dc.setCapability("noReset", true);
	    dc.setCapability("fullReset", false);
	//      dc.setCapability("appActivity","com.numu.app.SplashActivity"); 
	
	
			
		
	//	dc.setCapability("browserName","Chrome");
	//	dc.setCapability("chromedriverExecutable", "C:\\Users\\Numu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//	try {
			AndroidDriver<AndroidElement>  driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		/*} catch (MalformedURLException e) {
		    System.out.println(e.getMessage());
		}*/
			System.out.println("App is starting");
			
		return driver;
		
		
		
	}

}
