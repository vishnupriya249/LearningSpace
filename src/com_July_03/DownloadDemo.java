package com_July_03;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class DownloadDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // creating a driver object of type WebDriver Interface for class ChromeDriver
		
	
		driver.get("https://www.selenium.dev/downloads/");
		
		String mainID = driver.getWindowHandle();
		System.out.println(mainID);
		
		Robot r = new Robot();
		
		
		driver.findElement(By.xpath("//tbody/tr[2]/td[6]/a[contains(text(),'Download')][1]")).click();
		r.delay(3000);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		driver.get("chrome://settings/?search=downloads");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//*[contains(text(),'Ask where to save each file before downloading')]")).click();
		
		
	}

}
