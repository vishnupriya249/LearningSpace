package June_06_Sales;

public class Child1 extends Parent{
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("Child code......");
	}	

   public Child1()
   {
	   super(); // its not needed to call from here automatically parent constructor is being called.
	   System.out.println("Child Constructor");
   }
	public static void main(String[] args) {
		
		Child1 c = new Child1();
		c.display();
	}

}
