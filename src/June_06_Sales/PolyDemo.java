package June_06_Sales;

public class PolyDemo {

	public void Login()
	{
		System.out.println("User.....");
	}
	public void Login(String u, int p)
	{
		System.out.println("Admin.....");
	}
	public void Login( int p, String u)
	{
		System.out.println("Admin.....");
	}
	public void Login(String u, String i, String p)
	{
		System.out.println("Employee.....");
	}
	public static void main(String[] args)
	{
		
       PolyDemo p = new PolyDemo();
       p.Login();
       
	}

}
