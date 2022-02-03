package com_June_27;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ksrtc.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='txtJourneyDate']")).click();
		//driver.findElement(By.xpath("//tbody/tr[5]/td[3]//a[contains(text(),'29')]")).click();
		Thread.sleep(3000);
		List<WebElement>  allele = driver.findElements(By.xpath("//table[1]/tbody[1]/tr[1]/td/a"));
		
		System.out.println("Available data:"+ allele.size());
		
		for (WebElement e:allele)
		{
			
			Date d = new Date();
			DateFormat df = new SimpleDateFormat("d");
			String value = df.format(d);
			
			System.out.println(e.getText());
			System.out.println(value);
			//System.out.println(e.getTagName());
			
			if(e.getText().equalsIgnoreCase(value))
			{
			e.click();
			break;
			}
				
		
			
		}
		
	}

}
