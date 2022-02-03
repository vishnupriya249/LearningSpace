package com_July_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewToursDataProvider {
  
	WebDriver driver;
	
	@BeforeMethod
	public void Launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}
	
	@Test(dataProvider = "data")
	  public void Login(String Username, String Password) {
		
	      driver.get("http://demo.guru99.com/test/newtours/");
	      
	      
	      Assert.assertEquals(driver.getTitle(), "Welcome: Mercury Tours");
		  driver.findElement(By.name("userName")).sendKeys(Username);
		  driver.findElement(By.name("password")).sendKeys(Password);
		  driver.findElement(By.name("submit")).click();
		  
		  
		  
	  }

	  @DataProvider
	  public Object[][] data() 
	  {
	  
		  return new Object[][] {
	      { "admin" ,"admin"},
	      { "badmin" ,"admin"},
	      { "cadmin" ,"cadmin"},
	  
	      
	    };
	  }
	  @AfterMethod
	  public void close()
	  {
		  driver.close();
		  driver.quit();
	  }
	
	
}
