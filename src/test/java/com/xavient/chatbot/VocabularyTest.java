package com.xavient.chatbot;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VocabularyTest extends BaseE2ETest {
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
	public void vocabulary() {
		try {

			Vocabularypage vocabulary = new Vocabularypage(driver);
			ExcelDataConfig excel = new ExcelDataConfig((testProperties.get("excelPath")));
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			vocabulary.clickVocabularyimage();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			vocabulary.isVocabulartyTitledisplayed();
			vocabulary.clickBotname();
		    vocabulary.additemDisplayed();
			System.out.println(excel.getdata(1, 1, 2));
			System.out.println(excel.getdata(1, 1, 3));
			vocabulary.addItem().sendKeys(excel.getdata(1, 1, 2));
			vocabulary.addSynonym().sendKeys(excel.getdata(1, 1, 3));
			vocabulary.addSynonym().click();
			vocabulary.addSynonym().sendKeys(Keys.ENTER);
			vocabulary.clickSaveSynonym();
			
			
			// checkitemname already exists
			List<WebElement> itemname = driver.findElements(By.className("fields"));
			for (WebElement itemnames : itemname) {
				System.out.println(itemnames.getText());
			}
			
			// Delete the item name from vocabulary
			vocabulary.delete();
			driver.quit();
		} catch (Exception e) {
			System.out.println("exception is" + e);
		}
	}

	
}
