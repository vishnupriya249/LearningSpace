package com_July_03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizationDemo {
  
	WebDriver driver;
	
	@Parameters({"browser","App"})
	@Test
	public void Launch(String browser,String App) 
	{
		
		switch(browser)
		{
		case "chrome":
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			 break;
		case "firefox":
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 break;
		case "ie":
			 System.setProperty("webdriver.ie.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			 break;
		default:
			System.out.println("No Browser is selected...");		
			
		}
		
		driver.get(App);
	}
}
