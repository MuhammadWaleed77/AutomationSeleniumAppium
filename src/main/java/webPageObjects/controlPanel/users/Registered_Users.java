package webPageObjects.controlPanel.users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registered_Users {

	WebDriver driver;

	public Registered_Users(WebDriver driver) {
		this.driver = driver;
	}
   
	private By users = By.xpath("//span[text()='USERS']");
	private By registeredusers= By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[1]/div/div/ul/ul[2]/li[1]/a");
	
	private By addNew = By.xpath("//button[contains(.,'Add New')]");
	private By enterInstaname = By.cssSelector("input[name='instagramUsername']");
	private By generate= By.xpath("//button[text()=\"Generate and Open\"]");
	private By enterNameToGenerate= By.xpath("//input[@placeholder='Enter instagram username...']");
	private By scrapedData= By.cssSelector("html[class='js-focus-visible']");
	private By scrapetextField= By.xpath("//div[@class='ig-scrape-user-div']//textarea");
	private By clickScrape= By.xpath("//button[text()='Scrape']");
	private By sameNameCheckBox= By.xpath("//*[text()='Same as Instagram Username']");
	private By contactNumber = By.xpath("//input[@name='contact']");
	private By fullName= By.xpath("//input[@name='fullName']");
	private By email= By.xpath("//input[@name='email']");
	private By sameEmailCheckBox= By.xpath("//*[text()='Same as Email']");
	private By gender= By.xpath("(//div[@class='css-1wy0on6'])[1]");
	private By male = By.xpath("//*[text()=\"Male\"]");
	private By age= By.xpath("(//div[@class='css-1wy0on6'])[2]");
	private By ageOther= By.xpath("(//*[text()=\"Other\"])[2]");
	private By country= By.xpath("(//div[@class='css-1wy0on6'])[3]");
	private By spain = By.xpath("//div[text()=\"Spain\"]");
	private By city= By.xpath("(//div[@class='css-1wy0on6'])[4]");
	private By albacete = By.xpath("//div[text()=\"Albacete\"]");
	private By addUserClick= By.cssSelector("button[type='submit']");
	private By toast_user = By.xpath("//*[text()='Member has been created successfully.']");
	
	public WebElement getUsers() {
		return driver.findElement(users);
	}
	public WebElement getRegisteredusers() {
		return driver.findElement(registeredusers);
	}
	public WebElement getAddNew() {
		return driver.findElement(addNew);
	}
	public WebElement getGenerateAndOpen() {
		return driver.findElement(generate);
	}
	public WebElement getEnterInstaname() {
		return driver.findElement(enterInstaname);
	}
	public WebElement getEnterNameToGenerate() {
		return driver.findElement(enterNameToGenerate);
	}
	public WebElement getScrapedData() {
		return driver.findElement(scrapedData);
	}
	public WebElement getScrapetextField() {
		return driver.findElement(scrapetextField);
	}
	public WebElement getClickScrape() {
		return driver.findElement(clickScrape);
	}
	
	public WebElement getSameNameCheckBox() {
		return driver.findElement(sameNameCheckBox);
	}
	public WebElement getContactNumber() {
		return driver.findElement(contactNumber);
	}
	public WebElement getFullName() {
		return driver.findElement(fullName);
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getSameEmailCheckBox() {
		return driver.findElement(sameEmailCheckBox);
	}
	public WebElement getGender() {
		return driver.findElement(gender);
	}
	public WebElement getAge() {
		return driver.findElement(age);
	}
	public WebElement getCountry() {
		return driver.findElement(country);
	}
	public WebElement getCity() {
		return driver.findElement(city);
	}
	public WebElement getMale() {
		return driver.findElement(male);
	}
	public WebElement getAgeOther() {
		return driver.findElement(ageOther);
	}
	public WebElement getSpain() {
		return driver.findElement(spain);
	}
	public WebElement getAlbacete() {
		return driver.findElement(albacete);
	}
	public WebElement getAddUserClick() {
		return driver.findElement(addUserClick);
	}
    public WebElement getToast() {
    	return driver.findElement(toast_user);
    }
	
}
