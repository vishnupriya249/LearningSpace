package com_June_27;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		
		driver.get("https://www.facebook.com");
		
		
		Actions a = new Actions(driver);
		
		WebElement Username = driver.findElement(By.id("email"));
		Username.sendKeys("aaaa");
		
		a.click(Username)
		.keyDown(Keys.CONTROL).sendKeys("a")
		.sendKeys("c")
		.keyUp(Keys.CONTROL)
		.click(driver.findElement(By.id("pass")))
		.keyDown(Keys.CONTROL).sendKeys("v")
		.keyUp(Keys.CONTROL)
		.build().perform();
		

	}

}
