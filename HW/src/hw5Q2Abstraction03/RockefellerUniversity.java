package hw5Q2Abstraction03;

public class RockefellerUniversity {
	
	//public area();//Its not possible to create an abstract 
	
	public RockefellerUniversity() {
		System.out.println("This is from default constructor");
	}//this is a default constructor, which have to have the same name as class
	
	public void statistics() {
		System.out.println("This is from Rockefeller University class");
	}

}

// The keyword "extends" is used to inherit regular class
//A regular class can only inherit one regular class
//A regular class can not inherit more than one regular class
//A regular class can not  inherit interface or abstract  class
//method or declared method in a regular class 