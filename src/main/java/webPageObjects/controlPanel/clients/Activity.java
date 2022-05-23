package webPageObjects.controlPanel.clients;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity {
	public WebDriver driver;

	public Activity(WebDriver driver) {
		this.driver = driver;
	}

	private By activity = By.xpath("(//a[contains(text(),'Activity')])[1]");

	// Campaign Approval
	private By campApproval = By.xpath("//div//p[text()='Campaign Approval']");
	private By approve = By.xpath(
			"(//table[@class='table']//tbody//tr//td[2]//span[.='AutomationTestingOnly']/parent::td/parent::tr//td[3]//div//button[text()='Approve'])[1]");
	private By cProfNotes = By.xpath("//div//span[contains(.,'Testing Data')]");
	private By selectLabels = By.xpath("//*[text()='Blue']");
	private By selectLabelBad = By.xpath("//*[text()='Bad']");
	private By confirnBtn = By.xpath("//button//span[text()='Confirm']");
	private By acceptToast = By.xpath("//*[text()[normalize-space()='Campaign updated successfully']]");

	// Credit Requests
	private By creditRequests = By.xpath("//div//p[text()='Credit Requests']");
	private By creditApprove = By.xpath(
			"//div[@class='react-bs-table']//div[2]//table//tbody//tr[1][contains(.,'AutomationTestingOnly')]//div//button//a[text()='Approve']");

	public WebElement activity() {
		return driver.findElement(activity);
	}

	public WebElement campApproval() {
		return driver.findElement(campApproval);
	}

	public WebElement approve() {
		return driver.findElement(approve);
	}

	public WebElement cProfNotes() {
		return driver.findElement(cProfNotes);
	}

	public WebElement selectLabels() {
		return driver.findElement(selectLabels);
	}

	public WebElement selectLabelBad() {
		return driver.findElement(selectLabelBad);
	}

	public WebElement confirnBtn() {
		return driver.findElement(confirnBtn);
	}

	public WebElement acceptToast() {
		return driver.findElement(acceptToast);

	}

	public WebElement creditReq() {
		return driver.findElement(creditRequests);
	}

	public WebElement creditApprove() {
		return driver.findElement(creditApprove);
	}
}
