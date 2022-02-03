package com_July_03;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnDemo {
 
	@Test(priority=1)
  public void Login() {
	  System.out.println("Login Done...");
	  Assert.assertEquals("A", "A");
  }
 
	@Test(priority=2, dependsOnMethods= {"Login"})
  public void Book() {
	  System.out.println("Booking Done...");
	  Assert.assertEquals("B", "Bbb");
  }

	//@Test(priority=3, dependsOnMethods= {"Login"})
	//@Test(priority=3, dependsOnMethods= {"Login","Book"})
	@Test(priority=3, dependsOnMethods= {"Login","Book"}, alwaysRun=true)
  public void Logout() {
	  System.out.println("Logout Done...");
	  Assert.assertEquals("C", "C");
  }
  












}

