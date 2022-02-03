package Assignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TLogin {
  
	WebDriver driver;
	
	@BeforeMethod
	public void Launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void Login() throws IOException 
	{
		ReadDetails r = new ReadDetails();
		
		WebElement Username = r.getElementInfo("Email", driver);
		Username.sendKeys("aaa");
		
		WebElement Pass = r.getElementInfo("Password", driver);
		Pass.sendKeys("aaa");
		
		r.getElementInfo("Log", driver).click();
		
	}
	@AfterMethod
	public void Close()
	{
		driver.close();
	}
}
