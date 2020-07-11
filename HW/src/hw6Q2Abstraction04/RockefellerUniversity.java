package hw6Q2Abstraction04;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {
	
	//public area();//Its not possible to create an abstract 
	
	public RockefellerUniversity() {
		System.out.println("This is default constructor from Rockefeller University.");
	}//this is a default constructor, which have to have the same name as class
	
	public void statistics() {
		System.out.println("This is from Rockefeller University.");
	}
	
	@Override
	public void aeronauticalInfo() {
		System.out.println("This aeronauticalInfo method  is from Aeronautical School.");
	}

	@Override
	public void computerLab() {
		System.out.println("This computerLab method  is from Engineering School");
	}
}

// The keyword "extends" is used to inherit regular class
//A regular class can only inherit one regular class
//A regular class can not inherit more than one regular class
//A regular class can not  inherit interface or abstract  class
//method or declared method in a regular class 