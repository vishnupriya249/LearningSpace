package com_July_04;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	
	
  @Test(dataProvider = "data")
  public void f(Integer n, String s,String s1) {
	  
	  System.out.println(+n +" "+s+" "+s1);
  }

  @DataProvider
  public Object[][] data() 
  {
  
	  return new Object[][] {
      { 1, "a" ,"aaa"},
      { 2, "b" ,"bbb"},
      { 3, "c" ,"ccc"},
  
      
    };
  }
    @Test(dataProvider = "data1")
    public void Test1(Integer n, String s)
    {
    	 System.out.println(+n +" "+s);
    }
    @DataProvider
    public Object[][] data1() 
    {
    
  	  return new Object[][] {
        { 1, "a" },
        { 2, "b" },

    
        
      };
  }
}
