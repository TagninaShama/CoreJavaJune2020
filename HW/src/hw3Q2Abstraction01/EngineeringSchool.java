package hw3Q2Abstraction01;

/*create 2 methods inside the Abstract Class - one is abstract and another one is non abstract name 
 * -- mechanicalLab and computerLab. Print something inside the non abstract or implemented method . 
 * You don't need to execute anything as main method is absent. */

public abstract class EngineeringSchool {
	public abstract void mechanicalLab();
	public void computerLab() {
		System.out.println("This is from the computerLab, non abstract method.");
	}
}
