package com_June_26;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenshotDemo {

	public static WebDriver  driver;
	
	public void screen1() throws IOException
	{
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File f2= new File("Sample\\src\\com_June_26\\img.png");
		
		FileUtils.copyFile(f, f2);
	}
	
	public void screen2() throws IOException
	{
		Date d = new Date();
		DateFormat df  = new SimpleDateFormat("dd hh-mm-ss");
		
	  String value = df.format(d);
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File f2= new File("src\\com_June_26\\img"+value+".png"); 
		
		FileUtils.copyFile(f, f2);
	}
	
	
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		ScreenshotDemo s = new ScreenshotDemo();
		//s.screen1();
		s.screen2();
		
		
		driver.close();

	}

}
