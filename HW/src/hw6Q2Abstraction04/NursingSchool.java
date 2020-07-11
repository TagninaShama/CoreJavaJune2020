package hw6Q2Abstraction04;

public abstract class NursingSchool extends RockefellerUniversity {
	 
	public NursingSchool() {
		System.out.println("This is a default constractor from Nursing School.");
	}
	public abstract void hygine();//abstract method from abstract class must have abstract keyword
	
	public void caring() {
		System.out.println("This is from Nursing School.");
	}
}

//The keyword "extends" is used in abstract class to inherit regular class or Abstract class
//An abstract class can only inherit one regular class
//An abstract class can not inherit one abstract class
//An abstract class can not  inherit interface