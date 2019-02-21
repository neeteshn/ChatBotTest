package com.xavient.chatbot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChatBotModuleTest extends BaseE2ETest {

    public WebDriver driver;

    @Before

    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        final String endPoint = testProperties.get("endPoint");
        driver.get(testProperties.get("endPoint"));
        driver.manage().window().maximize();
        ExcelDataConfig excel = new ExcelDataConfig((testProperties.get("excelPath")));
        Loginpage login = new Loginpage();

        System.out.println(excel.getdata(1, 1, 0));
        System.out.println(excel.getdata(1, 1, 1));

        login.txtbx_UserName(driver).sendKeys(excel.getdata(1, 1, 0));

        Loginpage.txtbx_Password(driver).sendKeys(excel.getdata(1, 1, 1));

        Loginpage.btn_LogIn(driver).click();

    }

    @Test
  public void ChatBot() {
        try {
            ChatbotModule chat = new ChatbotModule(driver);
            ExcelDataConfig excel = new ExcelDataConfig((testProperties.get("excelPath")));
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            Thread.sleep(2000);
            chat.clickChatBotbtn();
            Thread.sleep(2000);
            chat.clickQABotbtn();
            Thread.sleep(2000);
            chat.clickImport();
            Thread.sleep(2000);
            chat.selectFolder();
            Thread.sleep(2000);
            chat.clickFeedback();
            Thread.sleep(2000);
            chat.clickImport();
            chat.verifyMsg();



        } catch (Exception e) {
            System.out.println("exception is" + e);
        }
    }
}
