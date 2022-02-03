package June_06_Sales;

import com_June_06.AbstractDemo;

public class AbsChild extends AbstractDemo{

	public static void main(String[] args) {
		
		AbsChild c = new AbsChild();
		c.display();
		c.interest();
		

	}
	
	@Override
	public void interest()
	{
		System.out.println("Child Interest %");
	}

}
