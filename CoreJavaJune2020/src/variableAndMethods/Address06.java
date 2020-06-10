package variableAndMethods;


public class Address06 { //Opening of Class body 

	//no variable = declare
	//initialize = with variable 
		
		public static String Name = "Shama"; 
		public static int houseNumber = 625; 
		public static char houseDirection = 'W'; 
		public static int stNumber = 57; 
		public static String state = "NY";
		public static int zipCode = 10019;
		
		//this is a void type method, not a return type method
		//method contains (), class doesn't contain ()
		//method name can be similar as class name but not mandatory
		//method was implemented here. When you see curly brace, it means method was implemented
		public static void myInfo() {
			System.out.println(Name+houseNumber+houseDirection+stNumber+state+zipCode);
		}
		
		
		public static void main(String[] args) {
			myInfo(); //a non static method can not be a static method, so we change the method to static 
			//then a non static variable can't be 
		
	}//closing of class body 
 //i am just adding this comment out
} 
