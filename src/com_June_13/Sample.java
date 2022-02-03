package com_June_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // creating a driver object of type WebDriver Interface for class ChromeDriver
		
		driver.get("https://facebook.com");
		
		String title = driver.getTitle();
		System.out.println("Title is : " + title);
		
		System.out.println("The URL is: "+ driver.getCurrentUrl());
		
		WebElement Unm = driver.findElement(By.id("email")); // creating object of WebElement
		Unm.sendKeys("aaaa"); // sending the data for the WebElement since its text field
	
		
		WebElement Pass = driver.findElement(By.id("pass")); // creating object of WebElement
		Pass.sendKeys("bbb"); // sending the data for the WebElement since its text field
		                      // when you hover on sendKeys we get void method hence no more methods in it.
		Thread.sleep(1000);
		
		Pass.clear();  // its good to use a variable to assign to WebElement if we are doing multiple actions
		Thread.sleep(1000);
		
		Pass.sendKeys("Welcome");
	
	//	driver.findElement(By.id("u_0_d_qd")); // this id is dynamically changing value so its not preferred.
		WebElement Log = driver.findElement(By.name("login"));
		Log.click();
		
	//	driver.close();

	}

}
