package com.xavient.chatbot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardpage {
	private WebDriver driver;

	@FindBy(xpath = "//h4[contains(@class, 'mt-2') and text() = 'Conversation Reports']")
	public  WebElement conversationReports;
	
	@FindBy(xpath = "//p[@class='live-conversation-title font-weight-bold']")
	public  WebElement activeConversation;
	
	// This is a constructor, as every page need a base driver to find web elements
	 
	 public DashBoardpage(WebDriver driver)
	 
	 {
	 
	 this.driver = driver;
	//Initialise Elements
     PageFactory.initElements(driver, this);
	 
	 }
	 
	 public void isconversationReportsDisplayed() {
		 //return conversationReports.getText().toString().contains("Conversation Reports");
		 conversationReports.isDisplayed();
	 }
	 
	 public  void clickonactiveConversation() {
		  activeConversation.click();
		
		 
	 }
}
