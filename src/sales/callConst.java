package sales;

public class callConst {
	
	String nm;
	int sal;
	
	
	
	public callConst()
	{
		System.out.println("Default constructor called...");
		nm = "unknown";
		sal=100000;
	}
	
	public callConst(String nm, int sal)
	{
		System.out.println("Parameterized constructor called...");
		this.nm = nm;
		this.sal=sal; // this is class variable
	}
	
	public void display()
	{
		System.out.println(nm + " " + sal);
	}

	public static void main(String[] args) {
	
		callConst c = new callConst();
		c.display();
		
		callConst c1 = new callConst("john", 75000);
		c1.display();

	}

}

// OUTPUT:
/* ======
Default constructor called...
unknown 100000
Parameterized constructor called...
john 75000 */
