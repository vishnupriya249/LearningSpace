package com_June_12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // creating a driver object of type WebDriver Interface for class ChromeDriver
		driver.get("https://sw-reporting-test.azurewebsites.net");
	
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver(); // creating a driver object
//		driver.get("https://www.google.com");
	}
	
}
