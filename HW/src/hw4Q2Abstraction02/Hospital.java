package hw4Q2Abstraction02;

//Declare some methods inside the interface - emergencyRoom, surgeryRoom, cafeteria.

/*public Hospital() {
	System.out.println("This constructor is from default constructor");
	}
	Interface cant have constructor */

public interface Hospital {
	public void emergencyRoom();
	public void surgeryRoom();
	public void cafeteria();

}
//An interface can inherit more than one interface
//An interface can not inherit regular class or abstract class
//An interface can inherit more than one interface
	