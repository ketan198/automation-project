package com.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Test {
	
	public static WebDriver driver;
	public static  Properties prop;
	
	
	public Base_Test() {
		try {
			prop  = new Properties();
			FileInputStream fis = new FileInputStream("src/main/java/com/qa/config/cofig.properties");
			prop.load(fis);
			
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	
public static void initialization() {
		
		
		
		String browsername = prop.getProperty("browser");
		
		System.out.println(browsername);
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if (browsername.equals("FF")) {
//			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//			driver = new ChromeDriver();
			System.out.println("FF noot installed");
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get(prop.getProperty("url"));

} 

} 
