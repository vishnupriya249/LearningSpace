package Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		FileInputStream fis = new FileInputStream("src\\Assignment\\Login.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		
		System.out.println(sh.getLastRowNum());
		
		int cols = sh.getRow(0).getLastCellNum();
		
		ReadDetails rd = new ReadDetails();
		
		for (int r = 1; r<sh.getLastRowNum()+1; r++)
		{
			driver.get("https://www.facebook.com");
			
			int	c=0;
			
		  for ( c = 0; c<cols ; c++) 
		  {
			
			System.out.println("Email "+sh.getRow(r).getCell(c).getStringCellValue());
			WebElement Username = rd.getElementInfo("Email", driver);
			Username.sendKeys(sh.getRow(r).getCell(c).getStringCellValue());
			c++;
			
			System.out.println("Password "+sh.getRow(r).getCell(c).getStringCellValue());
			WebElement Pass = rd.getElementInfo("Password", driver);
			Pass.sendKeys(sh.getRow(r).getCell(c).getStringCellValue());
			
		
			rd.getElementInfo("Log", driver).click();
			Thread.sleep(5000);

			
		  }
			
		}
		
		

	}

}
