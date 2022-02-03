package com_June_27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Actions a = new Actions(driver);
		
		WebElement img = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		int x = img.getLocation().getX();
		int y = img.getLocation().getY();
		
		System.out.println(x+ " "+y);
		
//		a.moveByOffset(x,y).contextClick()
//		.build().perform();
//		
		a.moveToElement(img, 20, 154).contextClick().build().perform();
		
		
		

	}

}
