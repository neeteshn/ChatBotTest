package com.xavient.chatbot;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EntityTest  extends BaseE2ETest{
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
	
	//This is to create new entity. as of now commenting this out as entity is not deletable on the app
	/*@Test
	public void Addnewentity() {
		try {
			Entitypage entity = new Entitypage(driver);
			ExcelDataConfig excel = new ExcelDataConfig((testProperties.get("excelPath")));
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            entity.clickEntityimage();
            entity.isEntityTitledisplayed();
            entity.addentityDisplayed();
            entity.iscreateNewentityDisplayed();
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            entity.addEntity().click();
            entity.addEntity().sendKeys(excel.getdata(0, 1, 4));
           entity.enterItemname.sendKeys(excel.getdata(0, 1, 5));
          entity.enterSynonym.sendKeys(excel.getdata(0, 1, 6));
         entity.enterSynonym.sendKeys(Keys.ENTER);
         entity.clickSavesynonym();
          entity.clickSaveEntity();

		} catch (Exception e) {
			System.out.println("exception is" + e);
		}
	}*/
	
	//This is to add new item to an already existing entity and deleting it.
	//Here for this test case we have used the entity named Employee.
	public void AddNewItem() {
		try {
			Entitypage entity = new Entitypage(driver);
			ExcelDataConfig excel = new ExcelDataConfig((testProperties.get("excelPath")));
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			entity.clickEntityimage();
			 entity.isEntityTitledisplayed();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			String getentityname1=excel.getdata(0, 1, 4);
			System.out.println("the value is:"+getentityname1);
			List<WebElement> getentityname2=entity.clickEntity();
			System.out.println("the value is:"+getentityname2);
			entity.clickEntity();
			entity.clickaddNewitem();
			entity.enterItemname.sendKeys(excel.getdata(0, 1, 5));
			 entity.enterSynonym.sendKeys(excel.getdata(0, 1, 6));
			 entity.enterSynonym.sendKeys(Keys.ENTER);
			 entity.clickSavesynonym();
			 entity.clickdeleteItem();
			
			
	} catch (Exception e) {
		
		System.out.println("exception is" + e);
	}
	
}
}
