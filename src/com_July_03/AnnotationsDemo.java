package com_July_03;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsDemo {
 

	 @BeforeSuite
	  public void beforeSuite() 
	 {
		  
		  System.out.println("Before Suite is run...");
	 }
	 @BeforeClass
	  public void beforeClass() 
	 {
		  
		  System.out.println("Before Class is run...");
	  }

	@BeforeMethod
		public void beforeMethod() 
	{
		System.out.println("Before Method is run...");
	}

	  @BeforeTest
	  public void beforeTest() 
	  {
		  
		  System.out.println("Before Test is run...");
	  }
	  @Test
	  public void TC()
	  {
		  System.out.println("TestCase executed Successfully...");
	  }

	@AfterClass
		public void afterClass() 
	{
	  
	  System.out.println("After Class is run...");
	}

	@AfterMethod
		public void afterMethod() 
	{
	  
	  System.out.println("After Method is run...");
	}
	
	@AfterTest
  		public void afterTest() 
	{
	  
	  System.out.println("After Test is run...");
    }

   @AfterSuite
   		public void afterSuite() 
   {
	  
	  System.out.println("After Suite is run...");
   }

}
