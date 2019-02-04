package com.xavient.chatbot;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangepasswordTest extends BaseE2ETest {
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
public  void changepassword() throws IOException, Exception {
	try {
	ChangePassword change = new ChangePassword(driver);
	change.isElementPresent(change.btnUsername);
	}
	 catch (Exception e) {
			System.out.println("exception is" + e);
		}
	
	
 
}
 
 
 
}