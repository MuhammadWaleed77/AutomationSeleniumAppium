package SideMenus;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

import SideMenu.AudienceMetries;
import SideMenu.MyProfilePage;
import drivercapabilities.DC;
import drivercapabilities.DC2;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class MyProfile extends DC{
	
	//public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException { // executes commands on runtime
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);

	}
	   @Test 

		public void profile () throws InterruptedException, IOException {
		   service = startServer();
		   
		   Thread.sleep(10000);
		AndroidDriver<AndroidElement>  driver = capabilities();
	//	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		//driver.runAppInBackground(Duration.ofSeconds(-1));
		//
		//https://discuss.appium.io/t/how-can-i-scroll-up-and-select-the-year-from-the-calendar/34485/3
		//
		MyProfilePage sm = new MyProfilePage(driver);
		AudienceMetries am= new AudienceMetries(driver);
		TouchAction t=new TouchAction(driver); 
		
		
		 Thread.sleep(10000);
	    sm.getSideMenu().click();
	    
	    sm.getMyProfile().click();
	    
	    sm.setDP().click();
	    Thread.sleep(1000);
        am.setImageSelect2().get(4).click();
        am.setImageUpload().click();
        Thread.sleep(300);
	    
	    sm.setFullName().sendKeys("SleepyCat312");
	    sm.setGender().click();
	    
	  // sm.getDOB().click();
	   Thread.sleep(1000);
	  
	   
	  
		/* Dimension windowSize = driver.manage().window().getSize();
		    int start_x = (int) (windowSize.width*0.5);
		    int start_y = (int) (windowSize.width*0.8);
		    int end_x = (int) (windowSize.width*0.2);
		    int end_y = (int) (windowSize.width*0.2);
		  
		    
		    t.press(PointOption.point(start_x,start_y))
		     .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		     .moveTo(PointOption.point(end_x,end_y)).release().perform();*/
		    
	  
	 /*  List<AndroidElement> lists = driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]");
	    for (AndroidElement e : lists)
	    	System.out.println(e.getAttribute("text"));
	    Thread.sleep(3000);*/
	 //  WebElement second=driver.findElementByXPath("android.widget.EditText[@text='15']");
	 
	   
	 /*   Map<String, Object> args = new HashMap<>();
	    args.put("command", "input");
	   // args.put("direction", "up");
	    args.put("args", Lists.newArrayList("swipe", windowSize.width /2,
	            windowSize.height / 2, windowSize.width / 2, windowSize.height));
	  //  args.put("duration", -9000);
	    while (driver.findElements(By.xpath("//android.widget.TextView[@text='11']")).size() == 0) {
	        driver.executeScript("mobile: shell", args);
	    }
	    driver.findElement(By.xpath("//android.widget.EditText[@text='11']")).click();
	    sm.ok.click();*/
	 /*  sm.clickDate().clear();
	   sm.clickDate().sendKeys("7");
	   
	   sm.clickMonth().clear();
	   sm.clickMonth().sendKeys("Nov");
	   
	   sm.clickYear().clear();
	   sm.clickYear().sendKeys("1991");*/
	   
	 /*  t.longPress(longPressOptions().withElement(element(sm.getOkBtn())).withDuration(ofSeconds(1))).perform();
	   sm.getOkBtn().click();
	sm.ok.click();*/
	   
	    sm.setEmail().sendKeys("hsh@gmail.com");
	    sm.setNotificationEmail().sendKeys("numu.client@gmail.com");
	    
	    
	    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Save\"));");
		sm.selectCountry().click();
		Thread.sleep(1000);
		//sm.selectSpain();
		
		t.longPress(longPressOptions().withElement(element(sm.selectSpain())).withDuration(ofSeconds(1))).release().perform();
		sm.selectCity().click();
		Thread.sleep(500);
		t.longPress(longPressOptions().withElement(element(sm.selectAlbacete())).withDuration(ofSeconds(2))).release().perform();
		Thread.sleep(500);
		sm.selectlLanguage().click();
		Thread.sleep(500);
		t.longPress(longPressOptions().withElement(element(sm.selectEnglish())).withDuration(ofSeconds(2))).release().perform();
		sm.selectSave().click();
		
		service.stop();
	    
	}
	
	
	
}
