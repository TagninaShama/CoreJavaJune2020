package hw3Q2Abstraction01;

//create 2 methods inside the Abstract Class - one is abstract and another one is non abstract name
//-- anatomyLab and biochemistryLab. Print something inside the non abstract or implemented method

public abstract class MedicalSchool {
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("This is from the biochemistryLab, non abstract method.");
	}

}
