package com_June_06;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int day=2;
		
		switch(day)// performance wise switch is better than ifelse
		{
		case 1:
			System.out.println("Sunday.......");
			break;
		case 2:
			System.out.println("Monday.......");
			break;
		case 3:
			System.out.println("Tuesday.......");
			break;
		case 4:
			System.out.println("Wednesday.......");
			break;
		case 5:
			System.out.println("Thursday.......");
			break;
		case 6:
			System.out.println("Friday.......");
			break;
		default:
			System.out.println("Unknown day.......");
		}

	}

}
