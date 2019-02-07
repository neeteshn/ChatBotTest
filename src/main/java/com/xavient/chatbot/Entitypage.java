package com.xavient.chatbot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Entitypage   {
private WebDriver driver;
	
	private static WebElement element = null;


	@FindBy(xpath = "//a[@title='Entities']")
	//@FindBy(xpath="//img[@src='/static/media/ic_entities.4be110a4.svg']")
	public  WebElement entityimage;
	
	@FindBy(xpath = "//h4[@title='Entities']")
	public  WebElement entityTitle;
	
	@FindBy(xpath="//span[contains(text(),'Add New Item')]")
	public WebElement addNewitem;
	
	@FindBy(xpath = "//span[contains(text(),'Add New Entity')]")
	public  WebElement addNewentity;
	
	@FindBy(xpath = "//h4[@title='Create New Entity']")
	public  WebElement createNewentityTitle;
	
	@FindBy(xpath="//input[@placeholder='Enter entity title']")
	public WebElement enterEntity;
	
	@FindBy(xpath="//input[@placeholder='Enter item name']")
	public WebElement enterItemname;
	
	@FindBy(xpath="//input[@placeholder='Synonym (press Enter to add)']")
	public WebElement enterSynonym;
	
	@FindBy(xpath="//img[@title='Save']")
	public WebElement saveSynonym;
	
	@FindBy(xpath="//span[contains(text(),'Save Entity')]")
	public WebElement saveEntity;
	
	@FindBy(xpath="//img[@title='Delete']")
	public WebElement deleteItem;
	public Entitypage(WebDriver driver)

	{

	this.driver = driver;
	//Initialise Elements
	PageFactory.initElements(driver, this);

	}
	
	public void clickEntityimage() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(entityimage).click().perform();
        
	
}

public  void isEntityTitledisplayed() {
	entityTitle.isDisplayed();
	
	 
}

public void addentityDisplayed() {
	addNewentity.isEnabled();
	addNewentity.isDisplayed();
	Actions actions = new Actions(driver);
	actions.moveToElement(addNewentity).click().perform();
	addNewentity.click();
}

public void iscreateNewentityDisplayed() {
	createNewentityTitle.isDisplayed();
}


public WebElement addEntity() {
	WebElement addentity =(WebElement)new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter entity title']")));
	addentity.click();
	//element = driver.findElement(By.xpath("//input[@placeholder='Enter entity title']"));
	//return element;
	return addentity;
}
public void clickSavesynonym() {
	saveSynonym.click();
}

public void clickSaveEntity() {
	saveEntity.click();
}

public void clickdeleteItem() {
	deleteItem.click();
}

public List<WebElement> clickEntity() {
	
	List<WebElement> findEntity = driver.findElements(By.className("show-ellipsis"));
	for (WebElement entities : findEntity) {
		System.out.println(entities.getText());
		if(entities.getText().equals("Employee")) 
	       entities.click();
	}
	return findEntity;
	}

public void clickaddNewitem() {
	Actions actions = new Actions(driver);
	actions.moveToElement(addNewitem).click().perform();
}
}
