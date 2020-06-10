package variableAndMethods;

public class Address05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class body 
		//CLASS BODY CONTAINS
		
		// variables - declared/initialize
		//constructor - declared/initialize 
		//method - implemented/initialize 
		//
		String Name = "Shama"; //Static variable can't stay under static method
		int age = 44; 
		char sex = 'F';  
		double grade = 3.876; 
		
		System.out.println(Name+" " +age+" " +sex+" "+grade); //a non static variable can not initialize under a static method
		System.out.println("My name is " + Name +". My age is " +age+". My sex is " +sex+". My grade is "+grade);

	}//closing of class body 

} 
