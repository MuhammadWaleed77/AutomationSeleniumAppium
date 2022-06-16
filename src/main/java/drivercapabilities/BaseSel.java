package drivercapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseSel {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/SelResources/data.properties");
				//"/Users/numuqa/git/AutomationSeleniumAppium/src/main/java/SelResources/data.properties");
				//System.getProperty("user.dir") + "\\src\\main\\java\\SelResources\\data.properties");
				
                 
		prop.load(fis);
		// mvn test -Dbrowser=chrome // select browser via maven/jenkins
		// Maven considers them as System Properties
		// String browserName = System.getProperty("browser"); // Uncomment this line if
		// you are sending parameter from
		// Maven
		// comment this line if you are sending parameter from Maven
		String browserName = prop.getProperty("browser");// dont use == use .equal
		//String browserName= "chrome";
		// when extracting value from a property
		System.out.println(browserName);
		// == is a refrence camparison, both obj point to same memory location
		// .equal() camparion of values in the objects(i.e browser obj is chrome)
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/numuqa/Downloads/chromedriver"); // make driver path generic as
			// project path

			// HeadLess and Head Browser
			ChromeOptions options = new ChromeOptions();
			// options.addArguments("--headless");
			/*if (browserName.contains("headless")) {
				options.addArguments("headless");
			}*/

			driver = new ChromeDriver(options);
			System.out.println("yyyyver");
			// execute in chrome driver

		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
			// firefox code
		} else if (browserName.equals("IE")) {
			// IE code
			System.setProperty("webdriver.edge.driver",
					"C:/Users/Numu/Downloads/edgedriver_win64 (1)/msedgedriver.exe");

			 EdgeOptions options = new EdgeOptions();
			 driver = new EdgeDriver(options);
		}
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // initialize in base class so it is set to all
		// tc
		return driver;

	}

	// use apachi common.io package for SS
	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile; // return path as in Listener report needs SS so function is expecting path

	}

}
