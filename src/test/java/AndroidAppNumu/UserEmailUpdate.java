package AndroidAppNumu;


import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;


public class UserEmailUpdate {
	LoginTest l= new LoginTest();
      @Test//(dependsOnGroups={"Pre"})
      public void UserEmailUpdate() throws InterruptedException    {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Numu/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://test.control.numuworld.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(11000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("muhammad.waleed@numumail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123456");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(10000);
		System.out.println("abc");
		driver.findElement(By.xpath("//span[text()='USERS']")).click();
		Thread.sleep(10000);
		System.out.println("*************");
		System.out.println(l.ab);
		// driver.findElement(By.xpath("//ul[@class='nested-link collapse
		// in']//a[contains(@class,'')][normalize-space()='Registered']")).click();
		// driver.findElement(By.cssSelector("ul[class='nested-link.collapse.in']")).click();
		String a = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[1]/div/div/ul/ul[2]/li[1]/a"))
				.getText();
		System.out.println(a);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[1]/div/div/ul/ul[2]/li[1]/a"))
				.click();

		// driver.findElement(By.xpath("//button[text()='Add New']")).click();
		// Thread.sleep(10000);
		driver.findElement(By.id("clear-btn-search")).sendKeys("sleepy_cat");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Edit']")).click();
		Thread.sleep(3000);
		WebElement email= driver.findElement(By.cssSelector("input[name='email']"));
		email.sendKeys(Keys.CONTROL + "a");
		email.sendKeys(Keys.DELETE);
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("hsh@gmail.com");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Update Member']")).click();
		Thread.sleep(3000);
		
		////div[text()="Member has been updated successfully."]
		driver.close();
	} 
}


