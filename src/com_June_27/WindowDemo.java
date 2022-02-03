package com_June_27;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		String mainID = driver.getWindowHandle();
		System.out.println(mainID);
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		driver.switchTo().window(mainID);
		driver.findElement(By.xpath("//a[@id='terms-link']")).click();
		
		Set<String> allwin = driver.getWindowHandles();
		System.out.println("Count  "+allwin.size());
		
		for(String x : allwin)
		{
			driver.switchTo().window(x);
			System.out.println(driver.getTitle());
		}
		
		
		
		

	}

}
