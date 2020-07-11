package hw6Q2Abstraction04;

public class NYUniversity {
	
	public NYUniversity() {
		System.out.println("This is a default constructor from NYUniversity.");
	}//this is a default constructor, which have to have the same name as class
	
	public void physics() {
		System.out.println("This is from NYUniversity.");
	}
	//public void anthropology();//Its not possible to create an abstract 
}

    //The keyword "extends" is used to inherit regular class
	//A regular class can only inherit one regular class, multiple inheritance is not possible
	//A regular class can not inherit more than one regular class
	//A regular class can not  inherit interface or abstract  class
	
	
	//method or declared method in a regular class 