package SelResources;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.IReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import drivercapabilities.BaseSel;


public class SelListeners extends BaseSel implements ITestListener  {
	ExtentTest test;
	
	ExtentReports extent = ExtentReporterNG.getReportObject();
	
	// for parallel tc execution maintains threads save for each class, as when 5 tc are executing parallel
	//their name would get override in OnTestMethod and incase one fails it would give wrong name, this class
	//maintains threads for each class and does'nt allow to override data 
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();// give name of which u want to maintian thread(report)

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = extent.createTest(result.getMethod().getMethodName()); //once test starts grap its name for report
		extentTest.set(test); //set test obj to this pool 

	}

	public void onTestSuccess(ITestResult result) {
		// get name of tc and set status as PASS
		extentTest.get().log(Status.PASS, "Test Passed");
	}

	public void onTestFailure(ITestResult result) {
		
		//get name of test,report fail and pass the logs of failure in report
		extentTest.get().fail(result.getThrowable());
		WebDriver driver = null; // as we are getting driver so return type as Webdriver
		String testMethodName = result.getMethod().getMethodName();

		try { //access to field of testclass,getRealClass gets instance(obj) of class, get access to declared fields driver
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} catch (Exception e) {

		}   
		try { //attach SS in Report againt Testcase Name, addScreenCaptureFromPath() takes path where SS is presnt(reports folder)
			extentTest.get().addScreenCaptureFromPath(getScreenShotPath(testMethodName, driver),
					result.getMethod().getMethodName());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}

}
