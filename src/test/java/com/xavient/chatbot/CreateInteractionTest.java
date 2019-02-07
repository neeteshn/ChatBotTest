package com.xavient.chatbot;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateInteractionTest  extends BaseE2ETest{

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
	
	//This is to create a new interaction flow
	@Test
	public void createinteraction() {
		try {
			CreateInteractionpage interact = new CreateInteractionpage(driver);
			ExcelDataConfig excel = new ExcelDataConfig((testProperties.get("excelPath")));
			//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			interact.clickCentralbtn();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			interact.clickFlowbtn();
			
			//Clicking on the folder QA Automation onsite.(As of now its not happening properly)
			interact.clickFolder();
			//As of now its clicking the New interaction from the root folder and not under the created folder QA Automation Onsite.
		    interact.clickNewinteraction();
			interact.templateName.sendKeys(excel.getdata(1, 1, 7));
			interact.clickOkBtn();
			interact.ClickaddBtn();
		    
			interact.addQuestion.sendKeys(excel.getdata(1, 1, 9));
			interact.textAnswer.sendKeys(excel.getdata(1, 1, 10));
			interact.templateTitle.sendKeys(excel.getdata(1, 1, 8));
}
		catch (Exception e) {
			System.out.println("exception is" + e);
		}
	}
}
