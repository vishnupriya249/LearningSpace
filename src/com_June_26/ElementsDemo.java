package com_June_26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsDemo {

	public static void main(String[] args) {
		

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ram mohan reddy\\Desktop\\BrowserDrivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver(); // creating a driver object of type WebDriver Interface for class ChromeDriver
				
				driver.get("http://demo.guru99.com/test/newtours/");
				

			}


	}


