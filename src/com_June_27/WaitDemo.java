package com_June_27;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // creating a driver object of type WebDriver Interface for class ChromeDriver
		driver.get("http://demo.guru99.com/test/newtours/");
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement usr = driver.findElement(By.name("userName"));
		usr.sendKeys("admin");
		
		WebElement pas = driver.findElement(By.name("Password123"));
		pas.sendKeys("admin");
		
		WebElement sub = driver.findElement(By.name("Submit"));
		sub.sendKeys("admin");
		
		

	}

}
