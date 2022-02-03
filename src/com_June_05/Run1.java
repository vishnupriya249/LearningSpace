package com_June_05;

public class Run1 extends MethodTypes{

	public static void main(String[] args) {


		Run1 r = new Run1();
//		System.out.println(r.b); // Private variable can't be called even its child for MethodTypes class
		System.out.println("value of d-public variable from child class - same package is " + r.d);
		System.out.println("value of c-protected variable from child class - same package is " + r.c);
		System.out.println("value of n1-default variable from child class - same package is " + r.n1);

	}

}

// OUTPUT:
/* ======
value of d-public variable from child class - same package is 100
value of c-protected variable from child class - same package is 50
value of n1-default variable from child class - same package is 88 */
