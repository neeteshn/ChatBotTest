package com.xavient.chatbot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
public class Loginpage {
	
private static WebElement element = null;

public static WebElement txtbx_UserName(WebDriver driver){

     element = driver.findElement(By.xpath("//input[@placeholder='Email']"));

     return element;

     }

 public static WebElement txtbx_Password(WebDriver driver){

     element = driver.findElement(By.xpath("//input[@placeholder='Password']"));

     return element;

     }

 public static WebElement btn_LogIn(WebDriver driver){

     element = driver.findElement(By.xpath("//button[@type='submit']"));

     return element;

     }

}



