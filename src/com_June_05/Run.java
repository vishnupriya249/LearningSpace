package com_June_05;

public class Run  {

	public static void main(String[] args) {
		MethodTypes m = new MethodTypes();
		
	
		
		m.add(); // toString is not appended here so called as a method.
		// System.out.println("Add: " + m.add()); // void functions cannot be printed directly with +, since '+' appends toString while running,+ is used only for variable printing.
		
		m.sub(); // value is not printed since return value is not assigned to any variable to print.

		System.out.println("Sub: " +m.sub());
		
		m.mul(2, 3);
		// System.out.println("mul: " +m.mul(2, 3)); // same as add in line 11
		
		System.out.println("value of local variables n1 and n2: "+ m.n1 + " "+ m.n2); // default, public and protected can be called since its same package
		
		m.div(3, 4.3f);
		System.out.println("Div: "+m.div(3,2.3f));
		System.out.println("value of protected c is : " + m.c);
		System.out.println("value of public d is : " + m.d);
		
   //    System.out.println(m.b);  // since it private variable can't be called.
		
		
		

	}

}

//OUTPUT:
/* ====
Addition: 99
Sub: 77
Mul : 6
value of local variables n1 and n2: 2 3
Div: 1.3043479
value of protected c is : 50
value of public d is : 100  */
