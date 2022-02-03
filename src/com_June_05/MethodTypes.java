package com_June_05;

public class MethodTypes {
	
	int n1=88;
	int n2 = 11;
	private int b=45;
	protected int c=50;
	public int d=100;
	
	void add() // No input , No output
	{
		int res = n1+n2;
		System.out.println("Addition: " + res);

	}
	
	int sub()  // No input , With output
	{
		int res = n1-n2;
		//System.out.println("Sub : "+ res);
		return res;
	}
	
	void mul(int a, int b)  // With input , No output
	{
		n1=a;
		n2=b;
		int res = n1*n2;
		System.out.println("Mul : "+ res);
		
	}
	
	float div(int a, float b)  // With input , With output
	{
		n1=a;
		float n2=b;
		float res = n1/n2;
		//System.out.println("Div : "+ res);
		return res;
		
		
	}

}
