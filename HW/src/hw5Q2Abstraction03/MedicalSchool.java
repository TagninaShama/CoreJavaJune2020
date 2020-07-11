package hw5Q2Abstraction03;



public abstract class MedicalSchool extends NYUniversity {
	
	/*You have 2 abstract class name --MedicalSchool, EngineeringSchool already. Create another Abstract Class NursingSchool, create 2 methods inside the Abstract Class - one is abstract and another one is the non-abstract name -- hygiene and caring. Print something inside the non-abstract or implemented method. Can you create a Constructor inside Abstract Class? If yes, create default Constructor on each Abstract Class. If no, comment out the created constructor and answer why not? Now, answer how many keywords are used for the inheritance of Abstract Class? Can an Abstract Class inherit other Abstract Class or a regular class or interface? How many inheritances is possible by an Abstract Class? Use the all of above Abstract Classes (3) to answer my questions.*/
	
	
	public MedicalSchool() {
		System.out.println("This default constructor is from Medical School");
	}
	public abstract void anatomyLab();//we must have to put abstract keyword inside abstract method in abstract class
	public void biochemistryLab() {
		System.out.println("This is from the biochemistryLab, non abstract method.");
	}//non abstract method,method implemented,abstract keyword not needed
	
	

}



