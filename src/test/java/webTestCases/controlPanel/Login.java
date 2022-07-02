package webTestCases.controlPanel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import drivercapabilities.BaseSel;
import webPageObjects.controlPanel.clients.CP_Login;

public class Login extends BaseSel {
   public WebDriver driver;
  
   
   @BeforeMethod
	public void initialize() throws IOException {
		
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
	}
   //(dependsOnMethods= {""})
   
   @Test (priority=1)
   public void correctCred()  {
	   CP_Login cp = new CP_Login(driver);
	   System.out.println("1");
	   cp.getLogin("....." , ".....");
	   
   }
  
   @Test(priority=2, dependsOnMethods={"correctCred"})
  public void invalidCred()  {
	   CP_Login cp = new CP_Login(driver);
	   System.out.println("2");
	   cp.getLogin("...@.com" , "....");
	   WebDriverWait wait = new WebDriverWait(driver,30);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'employee_not_found')]")));
	   
	   cp.getEmailToast();
   }
   
  @Test (priority=3, dependsOnMethods= {"invalidCred"})
  public void invalidPass() {
	  CP_Login cp = new CP_Login(driver);
	  System.out.println("3");
	  cp.getLogin("...." , "....");
	  WebDriverWait wait = new WebDriverWait(driver,30);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[.='invalid password']")));
	  
	  cp.getPasswordToast();
  } 
  
   @AfterMethod
   public void teardown() {
	   driver.close();
   }

}
