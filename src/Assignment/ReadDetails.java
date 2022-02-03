package Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadDetails {
	
	public String getPropertiesInfo(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("src\\Assignment\\locators.properties");
		
		Properties p = new Properties();
		p.load(fis);
		String elementDetails = p.getProperty(key); 
		return elementDetails;
	}
	public WebElement getElementInfo(String key1, WebDriver driver) throws IOException
	{
		WebElement ele = null;
		ReadDetails r = new ReadDetails();
		String value = r.getPropertiesInfo(key1);
		
		String[] data = value.split(":"); //data[0] = id , data[1] = email
		
		switch(data[0])
		{
		case"id":
			 ele = driver.findElement(By.id(data[1]));
			break;
		case "name":
			 ele = driver.findElement(By.name(data[1]));
			break;
		case "xpath":
			 ele = driver.findElement(By.xpath(data[1]));
			break;
		case "class":
			 ele = driver.findElement(By.className(data[1]));
			break;
		case "tagname":
			 ele = driver.findElement(By.tagName(data[1]));
			break;
		case "linktext":
			 ele = driver.findElement(By.linkText(data[1]));
			break;
			
		default:
			System.out.println("Invalid Input...");
		}
		return ele;	
		
		
	}
}
