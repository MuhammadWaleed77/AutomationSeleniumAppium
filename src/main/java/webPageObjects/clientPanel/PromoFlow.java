package webPageObjects.clientPanel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class PromoFlow {

	public WebDriver driver;
	WebDriverWait wait;

	public PromoFlow(WebDriver driver) {
		this.driver = driver;
		// wait = new WebDriverWait(driver,100);
	}

	String insight = System.getProperty("user.dir") + "\\src\\test\\java\\resources\\Insight.jpg";
	String lambo = System.getProperty("user.dir") + "\\src\\test\\java\\resources\\lambo.jpg";
	String lykenhypersport = System.getProperty("user.dir") + "\\src\\test\\java\\resources\\lykenhypersport.jpg";
	String pdfFile = System.getProperty("user.dir") + "\\src\\test\\java\\resources\\pdf.pdf";

	private By newCamBtn = By.xpath("//span[text()='NEW CAMPAIGN']");
	private By cstmCamp = By.xpath("//p[text()='Custom']");
	private By campTitle = By.id("title");
	private By selectBrand = By.xpath("(//div[text()='Select brand'])[2]");
	private By byDefaultBrand = By.xpath("(//div[text()='AutomationTestingOnly'])[2]");

	/*
	 * public void getABC( String user ) { sendKeys(campTitle, user); }
	 */

	private By budget = By.name("budget");
	private By nxtBtn = By.xpath("(//button//span[text()='Next'])[2]");

	private By cityDropDown = By.xpath("(//div[@class='css-1hwfws3'])[2]");
	private By allCity = By.xpath("//div[text()=\"All\"]");

	private By gender = By.xpath("//span[contains(.,'Both')]");
	private By ageDropDown = By.xpath("(//div[@class='css-1hwfws3'])[3]");
	private By ageOther = By.xpath("(//div[text()='All'])[2]");

	private By minFollowers = By.id("minFollowers");
	private By maxFollowers = By.id("maxFollowers");
	private By minEngagement = By.id("minEngagement");
	private By maxEngagement = By.id("maxEngagement");
	private By checkBoxNotMaxReqAge = By
			.xpath("(//span[@class='check-box']//span[contains(text(),'Not maximum required')])[1]");
	private By checkBoxNotMaxReqEng = By
			.xpath("(//span[@class='check-box']//span[contains(text(),'Not maximum required')])[2]");
	private By specificProfile = By.xpath("//span[contains(text(),'Not required')]");
	private By profNotes = By.cssSelector("textarea[name='profileNotes']");
	// private By iframe= By.xpath("//div[@aria-label='Abrir Intercom Messenger']");
	private By nxtBtn2 = By.xpath("//span[contains(text(),'Next')]");

	private By i = By.xpath("div[@class='intercom-launcher  intercom-h98do0 e4nbtsn0']");
	// div[@class='intercom-lightweight-app-launcher-icon
	// intercom-lightweight-app-launcher-icon-open']
	// div[@class='intercom-namespace']
	// div[@class='intercom-launcher intercom-h98do0 e4nbtsn0']
	// private By clickIntercom = By.xpath("//div[@class='intercom-1ior5cu
	// e1a94o2o0']");
	private By cancelIntercom = By.xpath("//*[text()='Borrar']");

	public WebElement getcancelIntercom() {
		return driver.findElement(cancelIntercom);
	}

	///// *******************EDIT******************///////////////

	private By crossAllCity = By.xpath("(//div[text()=\\\"All\\\"]/parent::div//div[2])[1]");
	private By crossAllAge = By.xpath("(//div[text()=\\\"All\\\"]/parent::div//div[2])[2]");
	private By Fgender = By.xpath("//span[contains(.,'Female')]");
	private By EditPicTxt = By.cssSelector("textarea[name$='interestExpressionMedia.mediaDescription']");
	private By EditQuestText = By.cssSelector("textarea[name$='interestExpressionQuestion.0.questionText']");
	private By EditProd = By.xpath("//span[contains(text(),'Edit')]");
	private By removePImg1 = By.xpath("(//div[@class='sc-jvLaUc dhQqwF media-cross-icon'])[1]");
	private By removePImg2 = By.xpath("(//div[@class='sc-jvLaUc dhQqwF media-cross-icon'])[2]");
	private By removePImg3 = By.xpath("(//div[@class='sc-jvLaUc dhQqwF media-cross-icon'])[3]");
	private By removePImg4 = By.xpath("(//div[@class='sc-jvLaUc dhQqwF media-cross-icon'])[4]");
	private By removePImg5 = By.xpath("(//div[@class='sc-jvLaUc dhQqwF media-cross-icon'])[5]");
	private By removePImg6 = By.xpath("(//div[@class='sc-jvLaUc dhQqwF media-cross-icon'])[6]");
	
	private By removePost = By.xpath("(//div[@class='product-card']/child::i)[1]");
	private By multiAssetsEditModal = By.xpath("//span[text()='Yes, update']");
	

	// **********************Request TAB

	private By question = By.xpath("//div//*[text()='Question']");
	private By checkboxDefaultQ = By.xpath("//*[text()='Default question']");

	private By photoSample = By.xpath("//div//*[text()='Photo sample']");
	private By checkBoxDefaultReq = By.xpath("//div//*[text()='Default request']");

	private By selectProduct = By.xpath("//div//*[text()='Product']");
	private By addProduct = By.xpath("//*[text()='Add product']");
	// Money
	private By selectMoney = By.xpath("//div//*[text()='Money']");
	private By contentMaxPrice = By.id("contentMaximumPrice");

	// **************Product Details*****
	private By addName = By.id("name");
	private By description = By.name("productDescription");
	private By productUrl = By.name("productUrl");
	private By retailValue = By.name("retailValue");
	private By noOfGifts = By.name("noOfGifts");
	// private By productPhotos1 = By.xpath("(//div[@class='contentExample
	// product'])[1]");
	private By productPhotos1 = By.xpath("(//div[@class='contentExample product']//input[@type='file'])[1]");
	// (//div[@class='contentExample product']//input[@type='file'])[1]
	private By productPhotos2 = By.xpath("(//div[@class='contentExample product']//input[@type='file'])[2]");
	private By productPhotos3 = By.xpath("(//div[@class='contentExample product']//input[@type='file'])[3]");
	private By crop = By.xpath("//span[contains(.,'CROP')]");
	private By addBtn = By.xpath("//*[text()='Add']");

	private By saveDraftBtn = By.xpath("//*[.='Save draft']");
	private By previewBtn = By.xpath("//button[text()='Preview']");
	private By verifyPreview = By.xpath("//*[.='Campaign Preview']");

	private By draftToast = By.xpath("//*[text()[normalize-space()='Successfully saved to draft !']]");

	// **Content Tab**///////

	private By campDes = By.name("sections.0");
	// private By addSection = By.xpath("//p//text()='Add section'");
	private By sectionAdd = By.xpath("//span[.='Add section']");
	private By campHeading = By.xpath("(//i[@class='fa fa-pencil'])[2]");
	private By sampleHeadingDes = By.xpath("//input[@value='Sample']");
	private By campDes2 = By.name("sections.1");
	private By clickDo = By.xpath("(//span[text()='Add more'])[1]");
	private By addDo = By.xpath("(//p[@class='radio-error']/parent::div/parent::div/div/div/div/div/textarea)[last()]");
	private By dont = By.xpath("(//span[text()='Add more'])[2]");

	private By addDont = By.xpath("(//textarea[@class='form-control'])[last()]");
	// (//p[@class='radio-error']/parent::div/parent::div/div/div/div/div/textarea)[last()]
	private By otherLink = By.xpath("(//span[text()='Add more'])[3]");
	private By addOtherLinkTitle = By.cssSelector("input[placeholder='Title']");
	private By addLink = By.cssSelector("input[placeholder='Add link']");

	// Multiple Assets*//
	private By muliContRadioBtn = By.xpath("//span[text()='Multiple content']");
	private By AddContentClick = By.xpath("//span[text()='Add content']");
	private By clickAddBtn = By.xpath("//button[@type='button']//span[text()='Add']");
	private By selectContentType = By.xpath("//span[text()='Post']");
	private By selectCarousel = By.xpath("//span[text()='Carousel']");
	private By selectSetofStories = By.xpath("//span[normalize-space()='Set of stories']");
	private By selectReels = By.xpath("//span[text()='Reels']");

	// private By contentEg =
	// By.xpath("(//div[@class='sortable-container']//div//div)[1]");
	private By contentEg = By.xpath("//div[@class='sortable-container']//div[1]//div[1]//input[1]");
	private By contentEg2 = By.xpath("//div[@class='sortable-container']//div[2]//div[1]//input[1]");
	private By contentEg3 = By.xpath("//div[@class='sortable-container']//div[3]//div[1]//input[1]");
	private By contentEg4 = By.xpath("//div[@class='sortable-container']//div[4]//div[1]//input[1]");
	private By contentEg5 = By.xpath("//div[@class='sortable-container']//div[5]//div[1]//input[1]");
	private By contentEg6 = By.xpath("//div[@class='sortable-container']//div[6]//div[1]//input[1]");

	private By startDate = By.xpath("//input[@name='startDate']");
	private By endDate = By.xpath("//input[@name='endDate']");
	private By maxDate = By.xpath("//span[contains(text(),'Maximum duration')]");
	private By publishBtn = By.xpath("//button[@type='submit']//span[.='PUBLISH']");
	private By gotItBtn = By.xpath("//span[contains(text(),'Got it')]");

	private By purchaseOdNum = By.cssSelector("input[name='purchaseOrderNumber']");
	private By pdfUpload = By.cssSelector("input[accept*='.pdf']");
	private By reqBtn = By.xpath("//button[@type='submit']//span[text()='Request']");

	public void iframe() throws InterruptedException {
		// int size = driver.findElements(By.tagName("iframe")).size();
		// driver.switchTo().frame("iframe[class*='intercom-launcher-frame']");
		Thread.sleep(2000);
		driver.switchTo().frame("intercom-notifications-frame");

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='intercom-1ior5cu e1a94o2o0']"))).build()
				.perform();
		driver.findElement(cancelIntercom).click();
		driver.switchTo().defaultContent();
		
	}

	public void initialStepsPFlow(String name) throws InterruptedException {

		driver.findElement(newCamBtn).click();
		driver.findElement(cstmCamp).click();
		Thread.sleep(1000);
		driver.findElement(selectBrand).click();
		Thread.sleep(2000);
		// driver.findElement(selectBrand).sendKeys("AutomationTestingOnly");

		driver.findElement(byDefaultBrand).click();

		driver.findElement(campTitle).sendKeys(name);
		driver.findElement(budget).sendKeys("1000");
		driver.findElement(nxtBtn).click();
		// Thread.sleep(5000);
		driver.findElement(cityDropDown).click();
		// Thread.sleep(1000);
		// driver.findElement(cityDropDown).sendKeys("All");
		// Thread.sleep(5000);
		// WebDriverWait w = new WebDriverWait(driver,
		// 5);w.until(ExpectedConditions.elementToBeClickable(allCity));

		driver.findElement(allCity).click();
		driver.findElement(gender).click();
		driver.findElement(ageDropDown).click();
		Thread.sleep(1000);
		driver.findElement(ageOther).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(minFollowers).clear();
		driver.findElement(minFollowers).sendKeys("76");
		driver.findElement(checkBoxNotMaxReqAge).click();
		driver.findElement(maxFollowers).clear();
		driver.findElement(maxFollowers).sendKeys("1000000");
		driver.findElement(minEngagement).clear();
		driver.findElement(minEngagement).sendKeys("0.01");
		driver.findElement(checkBoxNotMaxReqEng).click();
		driver.findElement(maxEngagement).sendKeys("77");

		driver.findElement(specificProfile).click();
		driver.findElement(profNotes).sendKeys("Testing Data ");

		/*
		 * int size = driver.findElements(By.tagName("iframe")).size(); //
		 * driver.switchTo().frame("iframe[class*='intercom-launcher-frame']");
		 * Thread.sleep(1000); driver.switchTo().frame("intercom-notifications-frame");
		 * 
		 * Actions action = new Actions (driver);
		 * action.moveToElement(driver.findElement(By.
		 * xpath("//div[@class='intercom-1ior5cu e1a94o2o0']"))).build().perform();
		 * driver.findElement(cancelIntercom).click();
		 * driver.switchTo().defaultContent();
		 */

		// driver.switchTo().frame(4);
		// System.out.println(size);
		// System.out.println("inside iframe");
		// driver.findElement(i).click();

		driver.findElement(nxtBtn2).click();
		Thread.sleep(3000);
		driver.findElement(question).click();
		driver.findElement(checkboxDefaultQ).click();
		driver.findElement(photoSample).click();
		driver.findElement(checkBoxDefaultReq).click();

	}

	public void selectMoneyCampaign() throws InterruptedException {
		driver.findElement(selectMoney).click();
		Thread.sleep(2000);
		driver.findElement(contentMaxPrice).sendKeys("25");
		scroll();
	}

	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	}

	public void addProduct() throws InterruptedException {
		// js.executeScript("arguments[0].scrollIntoView(true);", aaddBtn);
		// Thread.sleep(2000);
		// **AddProduct
		// driver.findElement(selectProduct).click();
		// Thread.sleep(2000);
		driver.findElement(addProduct).click();
		Thread.sleep(3000);
		driver.findElement(addName).sendKeys("Honda Insight ");
		driver.findElement(description).sendKeys(" Honda Insight Hybrid 2019 3 star");
		driver.findElement(productUrl).sendKeys("https://google.com");
		driver.findElement(retailValue).sendKeys("77777");
		driver.findElement(noOfGifts).sendKeys("7");
		Thread.sleep(2000);

	}

	public void addProduct_ContentImages() throws InterruptedException {

		driver.findElement(productPhotos1).sendKeys(insight);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		driver.findElement(productPhotos2).sendKeys(lambo);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		driver.findElement(productPhotos3).sendKeys(lykenhypersport);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		Thread.sleep(3000);
		driver.findElement(addBtn).click();
		Thread.sleep(2000);

		driver.findElement(nxtBtn2).click();
		Thread.sleep(2000);
	}

	public void multipleAssets() throws InterruptedException {
		driver.findElement(muliContRadioBtn).click();
		Thread.sleep(2000);
		driver.findElement(AddContentClick).click();
		Thread.sleep(2000);
		driver.findElement(clickAddBtn).click();
		Thread.sleep(2000);
		driver.findElement(AddContentClick).click();
		Thread.sleep(2000);
		driver.findElement(selectContentType).click();
		Thread.sleep(2000);
		driver.findElement(selectCarousel).click();
		Thread.sleep(2000);
		driver.findElement(clickAddBtn).click();
		Thread.sleep(2000);
		driver.findElement(AddContentClick).click();
		Thread.sleep(2000);
		driver.findElement(selectContentType).click();
		Thread.sleep(2000);
		driver.findElement(selectSetofStories).click();
		Thread.sleep(2000);
		driver.findElement(clickAddBtn).click();
		Thread.sleep(2000);
		driver.findElement(AddContentClick).click();
		Thread.sleep(2000);
		driver.findElement(selectContentType).click();
		Thread.sleep(2000);
		driver.findElement(selectReels).click();
		Thread.sleep(2000);
		driver.findElement(clickAddBtn).click();
		Thread.sleep(2000);
	}

	public WebElement saveDraftBtn() {
		return driver.findElement(saveDraftBtn);
	}

	public WebElement draftToast() {
		return driver.findElement(draftToast);
	}

	public WebElement previewBtn() {
		return driver.findElement(previewBtn);
	}

	public WebElement verifyPreview() {
		return driver.findElement(verifyPreview);
	}

	/*
	 * public void saveAsDraft() throws InterruptedException {
	 * driver.findElement(saveDraftBtn).click();
	 * 
	 * // wait.until(ExpectedConditions.presenceOfElementLocated(draftToast));
	 * String toastmsg= wait.until(ExpectedConditions.visibilityOf((WebElement)
	 * draftToast)).getText(); //String toastmsg =
	 * driver.findElement(draftToast).getText();
	 * 
	 * System.out.println(" RESULT ::"+toastmsg); //.getAttribute("name");
	 * Assert.assertEquals("Successfully saved to draft !", toastmsg);
	 * Thread.sleep(2000);
	 * 
	 * }
	 */
	public void requestAndContentTab() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// ****REQUEST TAB**///////
		driver.findElement(campDes).sendKeys(
				"This is automated testing campaign please donot apply to this. You may use other campaigns...");
		Thread.sleep(2000);
		driver.findElement(sectionAdd).click();
		Thread.sleep(2000);
		driver.findElement(campHeading).click();
		Thread.sleep(2000);
		// driver.findElement(sampleHeadingDes).clear();
		driver.findElement(sampleHeadingDes).sendKeys(" Heading for New Section Added");
		driver.findElement(campDes2).sendKeys(" New section Description is added ...");
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		driver.findElement(clickDo).click();
		Thread.sleep(2000);
		driver.findElement(addDo).sendKeys(" Please remember to do this ...");
		Thread.sleep(2000);

		// js.executeScript("window.scrollBy(0,600)");
		// Thread.sleep(2000);

		driver.findElement(contentEg).sendKeys(insight);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		Thread.sleep(2000);
		driver.findElement(contentEg2).sendKeys(lambo);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		Thread.sleep(2000);
		driver.findElement(contentEg3).sendKeys(lykenhypersport);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		Thread.sleep(2000);
		driver.findElement(contentEg4).sendKeys(insight);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		Thread.sleep(2000);
		driver.findElement(contentEg5).sendKeys(lambo);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		Thread.sleep(2000);
		driver.findElement(contentEg6).sendKeys(lykenhypersport);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		Thread.sleep(1000);

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		System.out.println(date1);

		driver.findElement(startDate).sendKeys(date1);
		Thread.sleep(2000);
		driver.findElement(startDate).click();
		Thread.sleep(1000);

		/*
		 * Calendar cal = Calendar.getInstance(); cal.setTime(new Date());
		 * cal.add(Calendar.DATE, 2); String newDate = dateFormat.format(cal.getTime());
		 * driver.findElement(endDate).sendKeys(newDate);
		 */
		driver.findElement(maxDate).click();
		Thread.sleep(2000);

		driver.findElement(dont).click();
		Thread.sleep(2000);
		driver.findElement(addDont).sendKeys(" Please dont do this ...");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(otherLink).click();
		Thread.sleep(2000);
		driver.findElement(addOtherLinkTitle).sendKeys("Google");
		driver.findElement(addLink).sendKeys("https://google.com");
		Thread.sleep(2000);
		driver.findElement(publishBtn).click();
		Thread.sleep(3000);
		driver.findElement(gotItBtn).click();

	}

	public void increaseBalance() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(purchaseOdNum).sendKeys("123456789");
		driver.findElement(pdfUpload).sendKeys(pdfFile);
		Thread.sleep(2000);
		driver.findElement(reqBtn).click();
		Thread.sleep(3000);

	}

	//////////////// EDIT///////////////////////////////////////////////////////////////////////////////////////////

	public void editInitial(String name) throws InterruptedException {

		driver.findElement(campTitle).clear();
		driver.findElement(campTitle).sendKeys(name);

		driver.findElement(budget).clear();
		driver.findElement(budget).sendKeys("7777");
		driver.findElement(nxtBtn).click();
		// Thread.sleep(5000);

		driver.findElement(crossAllCity).click();
		Thread.sleep(1000);
		driver.findElement(cityDropDown).click();
		Thread.sleep(1000);
		driver.findElement(allCity).click();
		// Thread.sleep(1000);
		// driver.findElement(cityDropDown).sendKeys("All");
		// Thread.sleep(5000);
		// WebDriverWait w = new WebDriverWait(driver,
		// 5);w.until(ExpectedConditions.elementToBeClickable(allCity));

		driver.findElement(Fgender).click();
		driver.findElement(gender).click();

		driver.findElement(crossAllAge).click();
		Thread.sleep(1000);
		driver.findElement(ageDropDown).click();
		Thread.sleep(1000);
		driver.findElement(ageOther).click();

		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(minFollowers).clear();
		driver.findElement(minFollowers).sendKeys("1");
		driver.findElement(checkBoxNotMaxReqAge).click();
		driver.findElement(maxFollowers).clear();
		driver.findElement(maxFollowers).sendKeys("1000000");
		driver.findElement(minEngagement).clear();
		driver.findElement(minEngagement).sendKeys("0.01");
		driver.findElement(checkBoxNotMaxReqEng).click();
		driver.findElement(maxEngagement).sendKeys("77");

		driver.findElement(profNotes).clear();
		driver.findElement(profNotes).sendKeys("Testing Data Edit ");

		driver.findElement(nxtBtn2).click();
		Thread.sleep(3000);
		driver.findElement(EditQuestText).clear();
		driver.findElement(EditQuestText).sendKeys(" How are you");

		driver.findElement(EditPicTxt).clear();
		driver.findElement(EditPicTxt).sendKeys(" Provide a photo");

	}

	public void editMoneyCampaign() throws InterruptedException {

		driver.findElement(contentMaxPrice).clear();
		driver.findElement(contentMaxPrice).sendKeys("27");
		scroll();
	}

	public void editAddProduct() throws InterruptedException {

		driver.findElement(EditProd).click();
		Thread.sleep(3000);

		driver.findElement(addName).clear();
		driver.findElement(addName).sendKeys("Toyota Honda");

		driver.findElement(description).clear();
		driver.findElement(description).sendKeys("How is honda insight");

		driver.findElement(productUrl).clear();
		driver.findElement(productUrl).sendKeys("https://github.com");

		driver.findElement(retailValue).clear();
		driver.findElement(retailValue).sendKeys("11111");

		driver.findElement(noOfGifts).clear();
		driver.findElement(noOfGifts).sendKeys("9");
		Thread.sleep(2000);

	}

	public void editProd_ContentImages() throws InterruptedException {

		driver.findElement(removePImg1).click();
		driver.findElement(productPhotos1).sendKeys(insight);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		
		driver.findElement(removePImg2).click();
		driver.findElement(productPhotos2).sendKeys(lambo);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		
		driver.findElement(removePImg3).click();
		driver.findElement(productPhotos3).sendKeys(lykenhypersport);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		Thread.sleep(3000);
		driver.findElement(addBtn).click();
		Thread.sleep(2000);

		driver.findElement(nxtBtn2).click();
		Thread.sleep(2000);
	}

	public void editMultipleAssets() throws InterruptedException {
		
		driver.findElement(removePost).click();
		Thread.sleep(1000);
		driver.findElement(multiAssetsEditModal).click();
		Thread.sleep(2000);
		
		driver.findElement(AddContentClick).click();
		Thread.sleep(2000);
		driver.findElement(multiAssetsEditModal).click();
		Thread.sleep(2000);
		
		driver.findElement(clickAddBtn).click();
		Thread.sleep(2000);
		
	}

	public void editReqContTab() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// ****REQUEST TAB**///////
		driver.findElement(campDes).clear();
		driver.findElement(campDes).sendKeys(
				"Automation campaign edited ");
		Thread.sleep(2000);
		
		
		driver.findElement(campHeading).click();
		Thread.sleep(2000);
		// driver.findElement(sampleHeadingDes).clear();
		driver.findElement(sampleHeadingDes).clear();
		driver.findElement(sampleHeadingDes).sendKeys(" Heading Edited");

		driver.findElement(campDes2).clear();
		driver.findElement(campDes2).sendKeys(" Description edited");
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		driver.findElement(clickDo).click();
		Thread.sleep(2000);
		driver.findElement(addDo).sendKeys(" New do added ");
		Thread.sleep(2000);

		// js.executeScript("window.scrollBy(0,600)");
		// Thread.sleep(2000);
        
		driver.findElement(removePImg1).click();
		Thread.sleep(1000);
		driver.findElement(contentEg).sendKeys(insight);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		Thread.sleep(2000);
		driver.findElement(removePImg2).click();
		Thread.sleep(1000);
		driver.findElement(contentEg2).sendKeys(lambo);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		Thread.sleep(2000);
		driver.findElement(removePImg3).click();
		Thread.sleep(1000);
		driver.findElement(contentEg3).sendKeys(lykenhypersport);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		Thread.sleep(2000);
		driver.findElement(removePImg4).click();
		Thread.sleep(1000);
		driver.findElement(contentEg4).sendKeys(insight);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		Thread.sleep(2000);
		driver.findElement(removePImg5).click();
		Thread.sleep(1000);
		driver.findElement(contentEg5).sendKeys(lambo);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		Thread.sleep(2000);
		driver.findElement(removePImg6).click();
		Thread.sleep(1000);
		driver.findElement(contentEg6).sendKeys(lykenhypersport);
		Thread.sleep(2000);
		driver.findElement(crop).click();
		Thread.sleep(1000);

		/*DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		System.out.println(date1);

		driver.findElement(startDate).sendKeys(date1);
		Thread.sleep(2000);
		driver.findElement(startDate).click();
		Thread.sleep(1000);
		
		driver.findElement(maxDate).click();
		Thread.sleep(2000);*/

		driver.findElement(dont).click();
		Thread.sleep(2000);
		driver.findElement(addDont).sendKeys(" New dont added.");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(otherLink).click();
		Thread.sleep(2000);
		driver.findElement(addOtherLinkTitle).sendKeys("Github");
		driver.findElement(addLink).sendKeys("https://github.com");
		Thread.sleep(2000);
		driver.findElement(publishBtn).click();
		Thread.sleep(3000);
		driver.findElement(gotItBtn).click();

	}

	public void editIncBalance() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(purchaseOdNum).clear();
		driver.findElement(purchaseOdNum).sendKeys("987654321");
		driver.findElement(pdfUpload).sendKeys(pdfFile);
		Thread.sleep(2000);
		driver.findElement(reqBtn).click();
		Thread.sleep(3000);

	}
 
	/////////////////////// Validate ////////////////////////////////////////////////////
	public void ValidateInitial(String name) throws InterruptedException {

		SoftAssert softAssert = new SoftAssert();
		
		driver.findElement(campTitle).getText();
		softAssert.assertEquals("Testing Data", verify);
		softAssert.assertTrue(true);
		softAssert.assertAll();

		driver.findElement(budget).clear();
		driver.findElement(budget).sendKeys("7777");
		driver.findElement(nxtBtn).click();
		// Thread.sleep(5000);

		driver.findElement(crossAllCity).click();
		Thread.sleep(1000);
		driver.findElement(cityDropDown).click();
		Thread.sleep(1000);
		driver.findElement(allCity).click();
		// Thread.sleep(1000);
		// driver.findElement(cityDropDown).sendKeys("All");
		// Thread.sleep(5000);
		// WebDriverWait w = new WebDriverWait(driver,
		// 5);w.until(ExpectedConditions.elementToBeClickable(allCity));

		driver.findElement(Fgender).click();
		driver.findElement(gender).click();

		driver.findElement(crossAllAge).click();
		Thread.sleep(1000);
		driver.findElement(ageDropDown).click();
		Thread.sleep(1000);
		driver.findElement(ageOther).click();

		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(minFollowers).clear();
		driver.findElement(minFollowers).sendKeys("1");
		driver.findElement(checkBoxNotMaxReqAge).click();
		driver.findElement(maxFollowers).clear();
		driver.findElement(maxFollowers).sendKeys("1000000");
		driver.findElement(minEngagement).clear();
		driver.findElement(minEngagement).sendKeys("0.01");
		driver.findElement(checkBoxNotMaxReqEng).click();
		driver.findElement(maxEngagement).sendKeys("77");

		driver.findElement(profNotes).clear();
		driver.findElement(profNotes).sendKeys("Testing Data Edit ");

		driver.findElement(nxtBtn2).click();
		Thread.sleep(3000);
		driver.findElement(EditQuestText).clear();
		driver.findElement(EditQuestText).sendKeys(" How are you");

		driver.findElement(EditPicTxt).clear();
		driver.findElement(EditPicTxt).sendKeys(" Provide a photo");

	}

	
}

