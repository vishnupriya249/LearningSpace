package sales;

import com_June_05.AccessModifier;

public class child1 extends AccessModifier {

	public static void main(String[] args) {
	
		child1 c = new child1();
		c.public1();
		c.protected1();
		
		
		// c.default1();  // default method can't be called from child class since its different package
		// c.private1();  // private method can't be called from child class since its different package
		
		System.out.println(c.y);
		System.out.println(c.sal);
		
	//	System.out.println(c.pwd); // private variable can't be called from child class since its different package
    //	System.out.println(c.x);   // default variable can't be called from child class since its different package

	}

}

// OUTPUT:
/* ======
Public called....
protected called....
77
0  */
