package com_June_27;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // creating a driver object of type WebDriver Interface for class ChromeDriver
		driver.get("http://demo.guru99.com/test/newtours/");
		
	    WebDriverWait w = new WebDriverWait(driver,5);
	    
	    w.until(ExpectedConditions.presenceOfElementLocated(By.name("userName")));
		
		WebElement usr = driver.findElement(By.name("userName"));
		usr.sendKeys("admin");
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("Password123")));
		
		WebElement pas = driver.findElement(By.name("Password123"));
		
		pas.sendKeys("admin");
		
		WebElement sub = driver.findElement(By.name("Submit"));
		sub.sendKeys("admin");

	}

}
