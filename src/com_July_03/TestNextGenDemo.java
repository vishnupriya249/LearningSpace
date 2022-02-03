package com_July_03;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNextGenDemo {
  
	
	@Test
  public void Display() 
	{
		System.out.println("My First TestNG Script....");
		
		String s1 = "Java";
		String s2 = "java";
		
		Assert.assertEquals(s1,s2,"Please check the values");
		
		System.out.println("Test Case is completed...");
    }
}
