//Demonstrate the use of Super and this keyword with a constructor,methods,variables
package mypackage;
import java.util.Scanner;
	
//Defining Superclass Employee
	class Employee
		{
		//Data members of Employee class
		int rent;
		int medical;
		int pf;
		int salary;
	
	//Defining constructor for Parent class Employee
	Employee()
		{
		rent=1000;
		medical=300;
		pf=200;
		}
	
	//Defining parameterized constructor of Parent class Employee
	Employee(int rent,int medical,int pf)
		{
		this.rent=rent;
		this.medical=medical;
		this.pf=pf;
	}
	
	//Defining method to calculate salary
	void  setSalary()
	{
		salary=rent+medical+pf;
	    	}
	// Method to return the salary
	int getSalary()
	{
		return salary;
	}
}

		//Child class inherites the data members of parent class Employee
			class Manager extends Employee
				{
					//Constructor definition for child class Manager
					Manager(int r,int m,int p)
						{
							rent=r;
							medical=m;
							pf=p;
						}
				}

			
//Child class to inherit the data members of Parent class Employee
			class Developer extends Employee
				{
					Developer(int r,int m, int p)
	{
						//To call the parameterized constructor of parent class Employee
						super(r,m,p);
		
	}
}

			
public class DemoSuper {
	//Defining Main method
	public static void main(String[] args) {
		int sal;		
		System.out.println("		Salary details of Manager");
		System.out.println();		
		Scanner sc=new Scanner(System.in);
		
		//To enter the salary details of manager
		System.out.println("Enter the House rent amount:");
		int ramt=sc.nextInt();
		System.out.println("Enter Medical allowance amount:");
		int mamt=sc.nextInt();
		System.out.println("Enter Provident fund amount:");
		int pamt=sc.nextInt();
		
		//Creating object for Manager
		Manager e1=new Manager(ramt,mamt,pamt);
		//Calling setSalary method on Manager object
		e1.setSalary();
		//Calling getSalary method on Manager object
		sal=e1.getSalary();
		//Displaying total salary of manager
		System.out.println();	
		System.out.println("Total  Salary of manager is :"+sal);
		
		System.out.println();
	
		System.out.println("		Salary details of Developer:");
		System.out.println();	
		//To enter the salary details of Developer
		System.out.println("Enter the House rent amount:");
		ramt=sc.nextInt();
		System.out.println("Enter Medical allowance amount:");
		mamt=sc.nextInt();
		System.out.println("Enter Provident fund amount:");
		pamt=sc.nextInt();
		
		//Creating object for Developer
		Developer e2=new Developer(ramt,mamt,pamt);
		
		//Calling setSalary method on developer object
		e2.setSalary();
		//Calling getSalary method on developer object
		sal=e2.getSalary();
		
		System.out.println("Total Salary of developer is :"+sal);
	}

}//End of Program
