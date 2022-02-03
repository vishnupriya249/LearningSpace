package com_June_27;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		Actions a = new Actions(driver);
		
		WebElement test = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		WebElement test1 = driver.findElement(By.xpath("//span[contains(text(),'Your Wish List')]"));
		
		a.moveToElement(test).moveToElement(test1).click().build().perform(); 	
		

	}

}
