package com.xavient.chatbot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateInteractionpage {
	private WebDriver driver;

	private static WebElement element = null;

	@FindBy(xpath="//ul[@class='nav-link']//li[4]")
	public  WebElement centralRepoimage;

	@FindBy(xpath = "//a[@title='FLOW']")
	public  WebElement flowBtn;

	@FindBy(xpath="//span[@title='QA Onsite Automation']")
	public WebElement folderQAautomation;

	@FindBy(xpath="//span[contains(text(),'New Interaction')]")
	public WebElement newInteraction;

	@FindBy(xpath="//input[@placeholder='Enter template name']")
	public WebElement templateName;

	@FindBy(xpath="//button[contains(text(),'Ok')]")
	public WebElement okBtn;

	@FindBy(xpath="//div[@class='add-btn']")
	public WebElement addBtn;

	@FindBy(xpath="//input[@placeholder='Enter template title here']")
	public WebElement templateTitle;


	@FindBy(xpath="//textarea[@placeholder='Add Question here']")
	public WebElement addQuestion;

	@FindBy(xpath="//div[contains(text(),'Text')]")
	public WebElement textBtn;

	@FindBy(xpath="//div[@class='ql-editor ql-blank']//p")
	public WebElement textAnswer;

	@FindBy(xpath="//span[contains(text(),'Save')]")
	public WebElement saveBtn;

	public CreateInteractionpage(WebDriver driver)

	{

		this.driver = driver;
//Initialise Elements
		PageFactory.initElements(driver, this);

	}

	public void clickCentralbtn(){
		WebDriverWait wait = new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.elementToBeClickable(centralRepoimage)).click();

	}

	public void clickFlowbtn() {
		Actions actions = new Actions(driver);
		actions.moveToElement(flowBtn).click().perform();
	}

	public void clickFolder() {
		Actions actions = new Actions(driver);
		actions.moveToElement(folderQAautomation);

		actions.click().build().perform();


	}

	public void clickNewinteraction() {
		Actions actions = new Actions(driver);
		actions.moveToElement(newInteraction);
		actions.click().build().perform();

	}

	public void clickOkBtn()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(okBtn);
		actions.click().build().perform();

	}

	public void clickaddBtn() throws InterruptedException{
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();

	}

}
