package hw5Q2Abstraction03;

/*
You have 2 abstract class name --MedicalSchool, EngineeringSchool already. Create another Abstract Class NursingSchool, create 2 methods inside the Abstract Class - one is abstract and another one is the non-abstract name -- hygiene and caring. Print something inside the non-abstract or implemented method. Can you create a Constructor inside Abstract Class? If yes, create default Constructor on each Abstract Class. If no, comment out the created constructor and answer why not? Now, answer how many keywords are used for the inheritance of Abstract Class? Can an Abstract Class inherit other Abstract Class or a regular class or interface? How many inheritances is possible by an Abstract Class? Use the all of above Abstract Classes (3) to answer my questions.
* */
	// The keyword "extends" is used in abstract class to inherit regular class or Abstract class
	//An abstract class can only inherit one regular class
	//An abstract class can not inherit one abstract class
	//An abstract class can not  inherit interface
    //Implements keyword is used to inherit Interface in abstract class 
	// an abstract class can inherit more than one Interface
	// an abstract class cannot inherit a regular class or abstract class by implements keyword
public abstract class EngineeringSchool extends RockefellerUniversity implements College,University {
	
	
	public EngineeringSchool() {
		System.out.println("This is a default constructor from EngineeringSchool class");
	}
	public void mechanicalLab() {
		System.out.println("This is Mechanical lab");
	}//non abstraction method.....method implemented ....CANNOT be declared
	public abstract void computerLab();//abstract method.....method declared....abstract method CANNOT be implemented
}
