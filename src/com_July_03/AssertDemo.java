package com_July_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AssertDemo {
	
	@BeforeSuite
	public void start()
	{
		System.out.println("Suite Started...");
	}
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		
		driver.get("https://www.facebook.com");
	 
		
		Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
		
		driver.findElement(By.id("email")).sendKeys("user1");
		WebElement pass = driver.findElement(By.id("pass"));
		
		Assert.assertTrue(pass.isDisplayed(), "element is available");
		pass.sendKeys("test");
		
  }
  @AfterSuite
	public void stop()
	{
		System.out.println("Suite Stopped...");
	}
}
