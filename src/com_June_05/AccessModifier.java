package com_June_05;

public class AccessModifier {
	
    int x = 88;
	public int y=77;
	private String pwd="Ben";
	protected int sal;

	public void public1()
	{
		System.out.println("Public called....");
		
	}
	
	void default1()
	{
		System.out.println("default called....");
		
	}
	
	private void private1()
	{
		System.out.println("private called....");
		
	}
	
	protected void protected1()
	{
		System.out.println("protected called....");
		
	}
	
	public static void main(String[] args)
	{
		AccessModifier a = new AccessModifier();
		a.public1();
		a.private1();
		a.default1();
		a.protected1();
		
		System.out.println("Value of public y from same class is: " + a.y);
		System.out.println("Value of protected sal from same class is: " + a.sal);
		
		System.out.println("Value of private pwd from same class is: " + a.pwd);
		System.out.println("Value of default x from same class is: " + a.x);
	}
}

//OUTPUT:
/* ======
Public called....
private called....
default called....
protected called....
Value of public y from same class is: 77
Value of protected sal from same class is: 0
Value of private pwd from same class is: Ben
Value of default x from same class is: 88 */
