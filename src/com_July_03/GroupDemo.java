package com_July_03;

import org.testng.annotations.Test;

public class GroupDemo {
  @Test(groups = {"smoke"})
  public void A() {
	  System.out.println("A Done...");
  }
  @Test(groups = {"smoke"})
  public void B() {
	  System.out.println("B Done...");
  }
  @Test(groups = {"Func", "Reg","smoke"})
  public void C() {
	  System.out.println("C Done...");
  }
  @Test(groups = {"Func","Reg"})
  public void D() {
	  System.out.println("D Done...");
  }
  @Test(groups = {"Reg"})
  public void E() {
	  System.out.println("E Done...");
  }
}
