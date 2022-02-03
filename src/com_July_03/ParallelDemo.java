package com_July_03;

import org.testng.annotations.Test;

public class ParallelDemo {
 
	@Test
  public void A() {
		Long Tid = Thread.currentThread().getId();
		System.out.println("Parallel Exection of A..."+Tid);
  }
	@Test
	  public void B() {
		Long Tid= Thread.currentThread().getId();
			System.out.println("Parallel Exection of B..."+Tid);
	  }
	@Test
	  public void C() {
		Long Tid = Thread.currentThread().getId();
			System.out.println("Parallel Exection of C..."+Tid);
	  }
	@Test
	  public void D() {
		Long Tid = Thread.currentThread().getId();
			System.out.println("Parallel Exection of D..."+Tid);
	  }
	@Test
	  public void E() {
		Long Tid = Thread.currentThread().getId();
			System.out.println("Parallel Exection of E..."+Tid);
	  }
	
}
