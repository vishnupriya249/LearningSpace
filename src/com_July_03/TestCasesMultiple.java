package com_July_03;

import org.testng.annotations.Test;

public class TestCasesMultiple {
  @Test(priority=1)
  public void Login() {
	  System.out.println("Login Done...");
  }
  @Test(priority=2)
  public void Book() {
	  System.out.println("Booking Done...");
  }
  @Test(priority=3)
  public void Logout() {
	  System.out.println("Logout Done...");
  }
  












}

