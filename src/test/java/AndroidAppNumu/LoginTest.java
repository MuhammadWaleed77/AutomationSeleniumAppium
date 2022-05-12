package AndroidAppNumu;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import SideMenu.SetupAccount;
import drivercapabilities.DC;

import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginTest extends DC {
	public static String ab="abc";
	
	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException { // executes commands on runtime
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);

	}
	
	@Test  //(groups ="Pre")
	public void IncorrectEmail() throws IOException, InterruptedException {
		service = startServer();

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		
		Thread.sleep(1000);
		
		SetupAccount sa = new SetupAccount(driver);
		System.out.println("Driver Setup Sucessfull");

		sa.getLanguage().click();

		Thread.sleep(2000);
		sa.getConfirmBtn().click();
		Thread.sleep(2000);
		sa.getEmail().sendKeys("hsh@gmailcom");
		sa.getNextButton().click();
		Thread.sleep(2000);
		Assert.assertEquals(sa.getText().getText(), "Invalid email");
		Assert.assertTrue(true);
		System.out.println("PASSSSSSSSSSSD");
		
		service.stop();
		
	}

	@Test (dependsOnMethods={"IncorrectEmail"})
	public void login() throws InterruptedException, IOException {

		service = startServer();

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		
		Thread.sleep(1000);
		
		SetupAccount sa = new SetupAccount(driver);
		System.out.println("Driver Setup Sucessfull");

		sa.getLanguage().click();

		Thread.sleep(2000);
		sa.getConfirmBtn().click();
		Thread.sleep(2000);
		sa.getEmail().sendKeys("hsh@gmail.com");
		sa.getNextButton().click();
		sa.getPassword().sendKeys("123456");
		sa.getLoginBtn().click();

		service.stop();

	}

}
