package com_June_06;

public class Employee {

	String Ename;
	int Sal;
	
	//Default Constructor
	public Employee()
	{
		System.out.println("Default constructor.... Reached");
		Ename ="Emma";
		Sal = 100000;
	}
	//Parameterized Constructor
	public Employee(String Ename, int sal)
	{
		System.out.println("Default constructor.... Reached");
		this.Ename =Ename;
		this.Sal = sal;
	}
	
	public void Display()
	{
		System.out.println("Employee Name: "+ Ename + " Salary is :"+ Sal);
	}
	public static void main(String[] args) {
		
     Employee e1 = new Employee();
     e1.Display();
     
     Employee e2 = new Employee("Emma",75000);
     e2.Display();
     
     Employee e3 = new Employee("Emma",75000);
     e3.Display();
	}

}
// OUTPUT:
/* ======
Default constructor.... Reached
Employee Name: Emma Salary is :100000
Default constructor.... Reached
Employee Name: Emma Salary is :75000
Default constructor.... Reached
Employee Name: Emma Salary is :75000 */
