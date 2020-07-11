package hw5Q2Abstraction03;

//Declare some methods inside the interface - emergencyRoom, surgeryRoom, cafeteria.

/*public Hospital() {
	System.out.println("This constructor is from default constructor");
	}
	Interface cant have constructor */

public interface Hospital extends University,College{
	public void emergencyRoom();
	public void surgeryRoom();
	public void cafeteria();

public default void morgue () {
	
}
public static void pharmacy () {
	
}
}
//An interface can inherit more than one interface
//An interface can not inherit regular class or abstract class
//An interface can inherit more than one interface
	