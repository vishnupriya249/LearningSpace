package Assignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		ReadDetails r = new ReadDetails();
		
		WebElement Username = r.getElementInfo("Email", driver);
		Username.sendKeys("aaa");
		
		WebElement Pass = r.getElementInfo("Password", driver);
		Pass.sendKeys("aaa");
		
		r.getElementInfo("Log", driver).click();
		
		
		
		

	}

}
