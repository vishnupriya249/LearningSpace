package com_June_06;

public class IfDemo {

	public static void main(String[] args) {
		
		int x=99;
		
		if(x>10)
		{
			System.out.println("x is greater than 10...");
			
			if(x>20) 
			{
				System.out.println("x is greater than 20...");
			}
			if(x>30) 
			{
				System.out.println("x is greater than 30...");
			}
			else
			{
				System.out.println("Error - 3");
			}
		}
		else if (x == 50)
		{
			System.out.println("X is not equal to 50");
		}
		else
		{
			System.out.println("Error - 1");
		}
	}

}
// OUTPUT:
/*
x is greater than 10...
x is greater than 20...
x is greater than 30... */