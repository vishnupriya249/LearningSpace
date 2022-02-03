package com_June_06;

import java.util.Scanner;

public class InputConsole {

	public static void main(String[] args) {
		
		int n1;
		int n2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the inputs>>>>>");
		
		n1 = s.nextInt();
		n2 = s.nextInt();
		
		System.out.println(n1+n2);
		
		s.close();
		
		

	}

}
