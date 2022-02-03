package com_July_03;                                        

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Project1 {
 
	public WebDriver driver;       
	
	
	@Test(priority=1)
  public void facebookTC() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
	}
	@Test(priority=2)
	 public void GoogleTC() 
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		 driver = new ChromeDriver();
			driver.get("https://www.Google.com");
			Assert.assertEquals(driver.getTitle(),"Google");
		}

}
