package com_June_27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("corover-close-btn")).click();
		
		driver.findElement(By.xpath("//button[contains(text(), 'Search for Bus')]")).click();
		
		String txt = driver.switchTo().alert().getText();
		
		System.out.println(txt);
		
		if(txt.matches("Please select start place."))
		{
			System.out.println("Valid Alert...");
			driver.switchTo().alert().accept();
		}
		else
		{
			System.out.println("Invalid Alert...");
			driver.switchTo().alert().dismiss();
		}
				

	}

}
