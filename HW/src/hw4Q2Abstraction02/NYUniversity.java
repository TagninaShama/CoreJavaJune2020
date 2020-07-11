package hw4Q2Abstraction02;

public class NYUniversity extends RockefellerUniversity {
	
	public NYUniversity() {
		System.out.println("This is from default constructor");
	}//this is a default constructor, which have to have the same name as class
	
	public void physics() {
		System.out.println("This is from NYUniversity class");
	}
	//public void anthropology();//Its not possible to create an abstract 

}

    //The keyword "extends" is used to inherit regular class
	//A regular class can only inherit one regular class, multiple inheritance is not possible
	//A regular class can not inherit more than one regular class
	//A regular class can not  inherit interface or abstract  class
	
	
	//method or declared method in a regular class 