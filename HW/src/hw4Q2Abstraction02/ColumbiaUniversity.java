package hw4Q2Abstraction02;

public class ColumbiaUniversity extends NYUniversity{
	
	// The keyword "extends" is used to inherit regular class
	//A regular class can only inherit one regular class
	//A regular class can not inherit more than one regular class
	//A regular class can not  inherit interface or abstract  class
	//public void Chemistry(); its not possible to create abstract class in regular class
	
	
	public ColumbiaUniversity() {
		System.out.println("This is a default constructor");
	}//this is a default constructor, which have to have the same name as class
	
	public void biology() {
		System.out.println("This is from ColumbiaUniversity class");
		
		
	}// non abstract method created

}