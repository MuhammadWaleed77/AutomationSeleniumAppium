package webPageObjects.controlPanel.clients;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Clients {
	public WebDriver driver;
	
	public Clients(WebDriver driver) {
		this.driver=driver;
	}
	
	private By client = By.xpath("//span[text()='CLIENTS']");
	private By registered = By.xpath("(//a[contains(text(),'Registered')])[1]");
	private By addNew = By.xpath("//button[contains(.,'Add New')]");
	private By search = By.id("clear-btn-search");
	private By editCompany = By.xpath("(//tr[@class=\"table-row\"]//a[.='AutomationTestingOnly']/parent::td/parent::tr//td)[3]//div//button//a[.='Edit']");
    private By capturePage = By.xpath("(//*[.='Clients | Registered'])[1]");
	
	public WebElement getClients() {
		return driver.findElement(client);
	}

	public WebElement getRegistered() {
		return driver.findElement(registered);
	}

	public WebElement getAddNew() {
		return driver.findElement(addNew);
	}
	public WebElement getSearch() {
		return driver.findElement(search);
	}
	public WebElement getEditBusiness() {
		return driver.findElement(editCompany);
	}
	public WebElement getCapturePage() {
		return driver.findElement(capturePage);
	}
	

}
