package hw5Q2Abstraction03;

public class NYUniversity extends RockefellerUniversity  implements College,Hospital {
	
	public NYUniversity() {
		System.out.println("This is from default constructor");
	}//this is a default constructor, which have to have the same name as class
	
	public void physics() {
		System.out.println("This is from NYUniversity class");
	}
	//public void anthropology();//Its not possible to create an abstract 
	@Override
	public void classSize() {
		
	}

	@Override
	public void field() {		
	}

	@Override
	public void teacher() {

	}

	@Override
	public void emergencyRoom() {
	
	}

	@Override
	public void surgeryRoom() {
		
	}

	@Override
	public void cafeteria() {
		
	}

	@Override
	public void commonRoom() {
		
	}

	@Override
	public void laboratory() {
		
	}

	@Override
	public void languageClub() {
		
	}
}

    //The keyword "extends" is used to inherit regular class
	//A regular class can only inherit one regular class, multiple inheritance is not possible
	//A regular class can not inherit more than one regular class
	//A regular class can not  inherit interface or abstract  class
	
	
	//method or declared method in a regular class 