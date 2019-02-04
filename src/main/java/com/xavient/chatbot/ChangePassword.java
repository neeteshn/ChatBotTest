package com.xavient.chatbot;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ChangePassword {
	private static WebElement element = null;
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@class='dropdown-menu logout-btn']")
	//@FindBy(xpath = "//button[contains(text(),'abalasubramania')]")
	//@FindBy(xpath = "//div[@class='dropdown-menu logout-btn d-block']")
	//@FindBy(xpath="//a[@class='dropdown-item']")
	public  By btnUsername;
	
	@FindBy(xpath = "//input[@placeholder='Old Password']")
	public  WebElement oldPassword;
	
	@FindBy(xpath = "//input[@placeholder='New Password']")
	public  WebElement newPassword;
	
	@FindBy(xpath = "input[@placeholder='Confirm Password']")
	public  WebElement confirmPassword;
	
	@FindBy(xpath = "//button[@type='submit']input[@placeholder='Confirm Password']")
	public  WebElement btnSubmit;
	
	@FindBy(xpath = "//button[@type='reset']")
	public  WebElement btnReset;

	public ChangePassword(WebDriver driver)

	{

	this.driver = driver;
	//Initialise Elements
	PageFactory.initElements(driver, this);

	}
	 
public void btn_ClickUserName(){

	  try {   
	WebDriverWait wait = new WebDriverWait(driver, 50);
	WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated((btnUsername)));
	//el.isDisplayed();
el.isDisplayed();
	  }
	  
  
    	catch (Exception e) {
			System.out.println("exception is" + e);
    }
}
	    
	  public boolean isElementPresent(By btnUsername) {
		  boolean isPresent = true;
		  try {
		  driver.findElement(btnUsername);
		  } catch (NoSuchElementException e) {
		   isPresent = false;
		  }
		 return isPresent;
		 }
	     }
	 


	 
	

	


