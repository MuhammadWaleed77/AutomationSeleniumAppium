package drivercapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.ServerSocket;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;



public class DC {

	public static AppiumDriverLocalService service;
	public static AndroidDriver<AndroidElement> driver;
	public static WebDriver augmentedDriver;
	

	public AppiumDriverLocalService startServer() {

		boolean flag = checkIfServerIsRunnning(4723);
		if (!flag) // if server is stopped/ not running
		{
			// builtin function to start server
			service = AppiumDriverLocalService.buildDefaultService();
			service.start();
		}
		return service;

	}
	

	public static boolean checkIfServerIsRunnning(int port) {

		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);

			serverSocket.close();
		} catch (IOException e) {
			// If control comes here, then it means that the port is in use
			isServerRunning = true;
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}

	public static void startEmulator() throws IOException, InterruptedException {
		// Emulator Path
		// C:\Users\Numu\eclipse-workspace\NUMU\src\main\java\Reources.startEmulator
		// Command to run emulator via cmd
		// C:\Users\Numu\AppData\Local\Android\Sdk\emulator
		// emulator -avd AndroidEmulator2
		Runtime.getRuntime().exec(System.getProperty("user.dir") + "\\src\\main\\java\\Reources\\startEmulator.bat");
		Thread.sleep(6000);
	}
	

	public static AndroidDriver<AndroidElement> capabilities() throws IOException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Reources\\global.properties");
		Properties prop = new Properties();
		prop.load(file);
		String device = (String) prop.get("device");
		if (device.contains("AndroidEmulator3")) {

			startEmulator();
		}

		//File appDir = new File("src");
		//	File app = new File(appDir, appName);
		//	File app = new File(appDir, "Numu.apk");
			
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator3");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
	//	dc.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		// dc.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		dc.setCapability("appPackage", "com.numu.app");
		dc.setCapability("appActivity", "com.numu.app.MainActivity");
		dc.setCapability("autoGrantPermissions", true);
		
		
	  
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		System.out.println("App is starting");

		return driver;

	}

	

	// use apachi common.io package for SS
		public static String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
			FileUtils.copyFile(source, new File(destinationFile));
			return destinationFile; // return path as in Listener report needs SS so function is expecting path

		}

}
