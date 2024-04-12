package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.Base_Test;

public class loginPage extends Base_Test{
	
	@FindBy(name = "user-name")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath =  "//input[@name='login-button']")
	WebElement loginbtn;
	
	@FindBy(xpath = "//div//a[@class= 'shopping_cart_link']")
	WebElement cartlink;
	
	public loginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public String loginpagetitle() {
		return driver.getTitle();
		
	}
	
	public void login(String un , String pw) {
		
		username.sendKeys(un);
		password.sendKeys(pw);
		
		JavascriptExecutor js = (JavascriptExecutor) driver ; 
		js.executeScript("arguments[0].click()",loginbtn);
		
		
		
	}
	
	public void sleeper() {
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.quit();
		System.err.println("test new");
	}
	
	

}
