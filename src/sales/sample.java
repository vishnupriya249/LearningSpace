package sales;

import com_June_05.AccessModifier;

public class sample {

	public static void main(String[] args) {
		

		AccessModifier a1 = new AccessModifier();
		a1.public1();
	 // a1.default1();  // default method can't be called since its different package
	 // a1.private1();  // private method can't be called since its different package
	 // a1.protected1(); // private method can't be called since its different package
				
		System.out.println(a1.y);
				
	//	System.out.println(a1.sal);				
	//	System.out.println(a1.pwd); // private variable can't be called since its different package
	//  System.out.println(a1.x);   // default variable can't be called since its different package

		
		
	
		
	}

}

// OUTPUT:
/*========
 Public called....
 77 */
