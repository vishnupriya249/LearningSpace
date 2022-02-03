package com_June_27;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;


public class DragDropDemo  {

	public static void main(String[] args) throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable");
		
	
		Thread.sleep(3000);
		
		Actions a = new Actions(driver);
		
		
		WebElement frameele = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frameele);
		
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		System.out.println(drag.getLocation().getX());
		System.out.println(drag.getLocation().getY());
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		System.out.println(drop.getLocation().getX());
		System.out.println(drop.getLocation().getY());
		
		
		Thread.sleep(3000);
		
		a.dragAndDropBy(drag, 146, 18).perform();	 
		
		if (drop.getText().equalsIgnoreCase("Dropped!"))
		{
			System.out.println("Dropped Successfully...");
		}
		else
			System.out.println("Invalid Drop...");
		

	}

}
