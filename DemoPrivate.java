package mypackage;

	class Student
		{
		//Declaration of private data members
			private String sname;
			private long sphone;
			private int srollno;
			private char sclass;
		
		//Setter method to set the student name	
		void setName(String name)
			{
			sname=name;
			}
		//Getter method to return student name
		String getName()
			{
				return sname;
			}
		//Setter method to set the student phone number
		void setPhone(long phone)
			{
			sphone=phone;
			}
		//Getter method to get the student phone number
		long getPhone()
			{
			return sphone;
			}
		//Setter method to set the student roll number
		void setRollno(int rollno)
			{
			srollno=rollno;
			}
		int getRollno()
			{
			return srollno;
			}
		void setClass(char clas)
			{
			sclass=clas;
			}
		char getClas()
			{
			return sclass;
			}
		
		}
		
		
//Main program to access the private student data and display
public class DemoPrivate {
	
	//Declaration of main method
	public static void main(String[] args) {
		
		//Creating object for student class
		Student s=new Student();
		
		//Setting the student data
		s.setName("Srinivas");
		s.setPhone(99999999);
		s.setRollno(21);
		s.setClass('A');
		
		System.out.println("	Student Information");
		//Getting the Student data and displaying it.
		System.out.println();
		System.out.println("	Student Name:	 	"+s.getName());
		System.out.println("	Student Phone:	 	"+s.getPhone());
		System.out.println("	Student RollNumber:	"+s.getRollno());
		System.out.println("	Student class:	 	"+s.getClas());
	}

}//End of the program
