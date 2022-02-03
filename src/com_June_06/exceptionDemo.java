package com_June_06;

public class exceptionDemo {

	public static void main(String[] args) {
		
		
		int n1=99;
		int n2=0;
		
		try
		{
		int res=n1/n2;
		System.out.println(res);
		}
		catch(ArithmeticException e)
		{
		  e.printStackTrace();
		  
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
		String nm=null;
		System.out.println(nm.length());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Done.........");

	}

}
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "nm" is nul