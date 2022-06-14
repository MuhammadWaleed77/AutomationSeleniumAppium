package webPageObjects.controlPanel.clients;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registered_Business {

	WebDriver driver;

	public Registered_Business(WebDriver driver) {
		this.driver = driver;
	}

	private By client = By.xpath("//span[text()='CLIENTS']");
	private By registered = By.xpath("(//a[contains(text(),'Registered')])[1]");
	
	
	
	private By addNew = By.xpath("//button[contains(.,'Add New')]");
	private By uploadbtn = By.xpath("//input[@name='logo']");
	private By crop = By.xpath("//button[contains(.,'CROP')]");
	private By businessName = By.xpath("//input[@name='businessName']");
	private By userName = By.xpath("//input[@name='userName']");
	private By companyPass = By.xpath("//input[@name='companyPass']");
	private By industry = By.xpath("(//div[@class='css-1hwfws3'])[1]");
	private By fashion = By.xpath("//div[text()=\"Fashion\"]");
	private By country = By.xpath("(//div[@class='css-1hwfws3'])[2]");
	private By spain = By.xpath("//div[text()=\"Spain\"]");
	private By city = By.xpath("(//div[@class='css-1hwfws3'])[3]");
	private By albacete = By.xpath("//div[text()=\"Albacete\"]");
	private By language = By.xpath("(//div[@class='css-1hwfws3'])[4]");
	private By english = By.xpath("//div[text()=\"English\"]");
	private By companyUrl = By.xpath("//input[@name='website']");
	private By firstName = By.xpath("//input[@name='firstName']");
	private By lastName = By.xpath("//input[@name='lastName']");
	private By instagram = By.xpath("//input[@name='instagram']");
	private By hashtag = By.xpath("//input[@name='hashtag']");
	private By personal_contact = By.xpath("//input[@name='personal_contact']");
	private By companyPhoneNumber = By.xpath("//input[@name='phoneNumber']");
	private By businessEmail = By.xpath("//input[@name='email']");
	private By checkbox = By.xpath("(//input[@type='checkbox'])[1]");
	private By sameBusinessCheckbox = By.xpath("//*[text()='Same as business name']");
	private By sameNotificationsCheckbox = By.xpath("//*[text()='Same as notifications email']");
	private By tfn = By.xpath("//input[@name='TFN']");
	private By vat = By.xpath("//input[@name='VAT']");
	private By billingAddress = By.xpath("//input[contains(@name,'billing_address')]"); // R.E
	private By businessDescription = By.xpath("//textArea[contains(@name,'description')]");
	//private By bannerbackground = By.xpath("//div[@class='sc-hGnimi fpbQNH']//input[@type='file']");
	private By bannerbackground = By.xpath("//div[@class='sc-hFrEEg fdyYRa']//input[@type='file']");
	private By crop2 = By.xpath("(//span[contains(.,'Crop')])[2]");
	private By register = By.xpath("//button[.='Register Company']");
	private By toast = By.xpath("//*[text()='Company has been created successfully.']");
	
	//Update 
	private By updateImg= By.xpath("//div[@class='fileUpload btn blue-btn']");
	private By updateCompany = By.xpath("//button[.='Update Company']");
	private By beauty = By.xpath("//div[text()=\"Beauty\"]");
	private By updateToast = By.xpath("//*[text()='Company has been updated successfully.']");

	public WebElement getUpdateToast() {
		return driver.findElement(updateToast);
	}
	public WebElement getClients() {
		return driver.findElement(client);
	}

	public WebElement getRegistered() {
		return driver.findElement(registered);
	}

	public WebElement getAddNew() {
		return driver.findElement(addNew);
	}

	public WebElement getBusinessName() {
		return driver.findElement(businessName);
	}

	public WebElement getUserName() {
		return driver.findElement(userName);
	}

	public WebElement getCompanyPass() {
		return driver.findElement(companyPass);
	}

	public WebElement getIndustry() {
		return driver.findElement(industry);
	}

	public WebElement getFashion() {
		return driver.findElement(fashion);
	}

	public WebElement getCompanyUrl() {
		return driver.findElement(companyUrl);
	}

	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}

	public WebElement getLastName() {
		return driver.findElement(lastName);
	}

	public WebElement getInstagram() {
		return driver.findElement(instagram);
	}

	public WebElement getPersonal_contact() {
		return driver.findElement(personal_contact);
	}

	public WebElement getCompanyPhoneNumber() {
		return driver.findElement(companyPhoneNumber);
	}

	public WebElement getbusinessEmail() {
		return driver.findElement(businessEmail);
	}

	public WebElement getCheckbox() {
		return driver.findElement(checkbox);
	}

	public WebElement getSameBusinessCheckbox() {
		return driver.findElement(sameBusinessCheckbox);
	}

	public WebElement getTFN() {
		return driver.findElement(tfn);
	}

	public WebElement getVAT() {
		return driver.findElement(vat);
	}

	public WebElement getBillingAddress() {
		return driver.findElement(billingAddress);
	}

	public WebElement getSameNotificationsCheckbox() {
		return driver.findElement(sameNotificationsCheckbox);
	}

	public WebElement getHashTag() {
		return driver.findElement(hashtag);
	}

	public WebElement getBusinessDescription() {
		return driver.findElement(businessDescription);
	}

	public WebElement getCountry() {
		return driver.findElement(country);
	}

	public WebElement getCity() {
		return driver.findElement(city);
	}

	public WebElement getLanguage() {
		return driver.findElement(language);
	}

	public WebElement getSpain() {
		return driver.findElement(spain);
	}

	public WebElement getAlbacete() {
		return driver.findElement(albacete);
	}

	public WebElement getEnglish() {
		return driver.findElement(english);
	}

	public WebElement getUploadbtn() {
		return driver.findElement(uploadbtn);
	}

	public WebElement getCrop() {
		return driver.findElement(crop);
	}

	public WebElement getBannerBackground() {
		return driver.findElement(bannerbackground);
	}

	public WebElement getRegisterCompany() {
		return driver.findElement(register);
	}

	public WebElement getBannerCrop() {
		return driver.findElement(crop2);
	}
	
	public WebElement getToast() {
		return driver.findElement(toast);
	}
	public WebElement getUpdateImg() {
		return driver.findElement(updateImg);
	}
	public WebElement getUpdateCompany() {
		return driver.findElement(updateCompany);
	}
	public WebElement getBeauty() {
		return driver.findElement(beauty);
	}

}
