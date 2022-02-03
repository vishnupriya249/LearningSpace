package com_June_05;

public class MethodDemo {
	
	int n1 = 88; // instance or global variables, non-static
	static int n2 = 11; // instance static
	
	//char n1; // - no duplicate variables
	
	void add()
	{
		int n1=100; // scope is inside method only so allowed
		// precedence is given for local variables
		int res = n1+n2; // res is local variable and have scope limited to the method
		System.out.println("Addition: " + res);
		
	}
	void sub()
	{
		int res = n1-n2; // this res is different from previous one
		System.out.println("Sub :" + res);
	}

	public static void main(String[] args) {
		
		MethodDemo m = new MethodDemo();
		m.add();
		
		int x=m.n1;
		System.out.println("n1 value :" +x);
		
		System.out.println("n2 value :" +m.n2);
		
		m.sub();
		
		System.out.println(n2); // Static variable can be accessed without class reference
		System.out.println(MethodDemo.n2); // Static variable can also be called with classname
		

	}

}

//OUTPUT:
/* ====
Addition: 111
n1 value :88
n2 value :11
Sub :77
11
11  */