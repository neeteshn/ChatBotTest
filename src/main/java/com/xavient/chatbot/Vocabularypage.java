package com.xavient.chatbot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vocabularypage {
	private WebDriver driver;
	
	private static WebElement element = null;

	@FindBy(xpath = "//a[@title='Vocabulary']")
	//@FindBy(xpath="//img[@src='/static/media/vocabulary.4de4afe8.svg']")
	//@FindBy(xpath = "//a[contains(@href,'/vocabulary')]")
	public  WebElement vocabularyimage;
	
	@FindBy(xpath = "//h4[@title='Vocabulary']")
	public  WebElement vocabularyTitle;
	
	@FindBy(xpath = "//span[contains(text(),'Add New Item')]")
	public  WebElement addNewitem;
	
	@FindBy(xpath = "//div[@title='Mobility Dev Bot - Do not rename or DEL']")
	public  WebElement botName;
	
	@FindBy(xpath="//img[@title='Save']")
	public WebElement saveSynonym;
	
	@FindBy(xpath="//div[contains(@class, 'Toastify__toast-body') and text() = 'Item added successfully']")
	public WebElement itemAdded;
	
	@FindBy(xpath="//div[@class='force-overflow']//div[1]//div[2]//div[1]//div[1]//img[1]")
	public WebElement deleteIcon;
	
	@FindBy(xpath="//button[contains(text(),'Delete')]")
	public WebElement deleteConfirm;

public Vocabularypage(WebDriver driver)

{

this.driver = driver;
//Initialise Elements
PageFactory.initElements(driver, this);

}

public void clickVocabularyimage() {
	
		Actions actions = new Actions(driver);
		//WebDriverWait wait = new WebDriverWait(driver, 100);
		//wait.until(ExpectedConditions.elementToBeClickable(vocabularyimage));
        actions.moveToElement(vocabularyimage).click().perform();
        
	
}

public  void isVocabulartyTitledisplayed() {
	vocabularyTitle.isDisplayed();
	
	 
}

public void additemDisplayed() {
	addNewitem.isEnabled();
	addNewitem.isDisplayed();
}

public void clickBotname() {
	
	//Actions actions = new Actions(driver);
   // actions.moveToElement(botName).click().perform();
  JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", botName);
   //botName.click();
	System.out.println("clicked");
	}


public WebElement addItem() {
	Actions actions = new Actions(driver);
	actions.moveToElement(addNewitem).click().perform();
	 element = driver.findElement(By.xpath("//input[@placeholder='Enter item name']"));
	 return element;
}

public WebElement addSynonym() {
	
	 element = driver.findElement(By.xpath("//input[@placeholder='Synonym (press Enter to add)']"));
	return element;
	
}

public void clickSaveSynonym() {
	saveSynonym.click();
	
}
public void checkItemAdded() {
	itemAdded.isDisplayed();
}

public void delete() {
	if(deleteIcon.isDisplayed())
	deleteIcon.click();
	if(deleteConfirm.isDisplayed())
	deleteConfirm.click();
}
}