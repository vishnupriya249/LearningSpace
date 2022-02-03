package com_June_06;

public class LoopsDemo {

	public static void main(String[] args) {
		
		int x = 10;
		// For Loop
		System.out.println("For Loop...");
		for (int i =1; i<=x ; i++)
		{
			System.out.println(i);
		}
       
        // While Loop
		System.out.println("While Loop...");
        while(x<15)
        {
        	System.out.println(x);
        	x++;
        }
        
        // Do While Loop
       	System.out.println("Do While Loop...");
       	x=10;
        do
        {
        	System.out.println(x);
        	x++;
        }while(x<15);
        
        System.out.println("For each loop...");
        int n1[] = {33,5,6,1,2,9}; // can do with strings also
        
        for(int e: n1)
        {
        	System.out.println(e);
        }
        System.out.println(n1[3]);
        System.out.println("Done.....");
	}

}
