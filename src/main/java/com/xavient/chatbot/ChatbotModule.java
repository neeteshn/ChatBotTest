package com.xavient.chatbot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChatbotModule {

    private WebDriver driver;

    private static WebElement element = null;

    @FindBy(xpath = "//a[@title='Chatbots']//img")
    public WebElement chatBot;

   @FindBy(xpath = "//a[@title='QA Bot ']")
    public WebElement qaBotBtn;

   @FindBy(xpath = "//span[text()='Import']//parent::button")
    public WebElement importBtn;

    @FindBy(xpath = "//span[@title='Zynga']")
    public WebElement QAFolder;

    @FindBy(xpath = "//li[@title='Feedback']")
    public WebElement feedback;

    @FindBy(xpath = "//div[text()='Templates imported successfully in bot category.']")
    public WebElement importSuccessMsg;

    @FindBy(xpath = "//span[text()='Train Bot']//parent::button")
    public WebElement trainBot;

    @FindBy(xpath = "//div[text()='Train job has been scheduled.']")
    public WebElement trainBotSuccessMsg;

    public ChatbotModule(WebDriver driver)
    {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void clickChatBotbtn() {
        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.elementToBeClickable(chatBot)).click();

    }

    public void clickQABotbtn() {
        Actions actions = new Actions(driver);
        actions.moveToElement(qaBotBtn).click().perform();
    }
    public void clickImport(){
        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.elementToBeClickable(importBtn)).click();

    }
    public void selectFolder(){
       QAFolder.click();
    }
    public void verifyMsg(){
        importSuccessMsg.isDisplayed();
        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.elementToBeClickable(trainBot)).click();
        trainBotSuccessMsg.isDisplayed();
    }

    public void clickFeedback(){
        feedback.click();
    }

}
