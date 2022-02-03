package com_July_04;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ITextContextDemo {
 
	 WebDriver driver;
	
	
	public void screenshot() throws IOException
	{
		Date d = new Date();
		DateFormat df  = new SimpleDateFormat("dd-hhmmss");
		
	  String value = df.format(d);
	  
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File f2= new File("src\\com_July_04\\img"+value+".png"); 
		
		FileUtils.copyFile(f, f2);                          
	}
	@BeforeMethod
	public void Launch(ITestContext data)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		String Username = "admin";
		String Password = "admin";
		
		data.setAttribute("Unm", Username);
		data.setAttribute("Pwd", Password);
		
		
		
	}
	@Test
	public void Facebook(ITestContext data) 
	{
//		Object u1 =data.getAttribute("Unm");
//		Object p1 =data.getAttribute("Pwd");
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys((String)data.getAttribute("Unm"));
		driver.findElement(By.id("pass")).sendKeys((String)data.getAttribute("Pwd"));
		driver.findElement(By.name("login")).click();
		
		//Assert.assertEquals(driver.getTitle(), "Logged Successfully...");
	}
	
	@Test
	  public void Login(ITestContext data) {
		
	      driver.get("http://demo.guru99.com/test/newtours/");
	      
	      
	      Assert.assertEquals(driver.getTitle(), "Welcome: Mercury Tours");
		  driver.findElement(By.name("userName")).sendKeys((String)data.getAttribute("Unm"));
		  driver.findElement(By.name("password")).sendKeys((String)data.getAttribute("Pwd"));
		  driver.findElement(By.name("submit")).click();
		  
		  Assert.assertEquals(driver.findElement(By.xpath("//tbody//tr//td//h3")).getText(), "Login Successfully");
		  
		  
		  
	  }
	@AfterMethod
	public void close(ITestResult R) throws IOException
	{
		int ActualStatus = R.getStatus();
		int ExpectedStatus = ITestResult.SUCCESS;
		
		
		
		if(ActualStatus == ExpectedStatus)
		{
			System.out.println("Tc Passed...");
			
			this.screenshot();
		}
		else
		{
			System.out.println("Tc Failed...");
		
			this.screenshot();
		}
	}
}
