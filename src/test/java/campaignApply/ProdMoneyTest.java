package campaignApply;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import campaignApplyObjects.Prod_Money_Campaign;
import drivercapabilities.DC2;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ProdMoneyTest extends DC2 {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement>  driver = capabilities();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	   
	   Prod_Money_Campaign pmc= new Prod_Money_Campaign(driver);
	   
	   Thread.sleep(1000);
	   pmc.Search().click();
	   Thread.sleep(1000);
	   
	   
	   
	   
	}
}
