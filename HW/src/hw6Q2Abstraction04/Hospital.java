package hw6Q2Abstraction04;

//Declare some methods inside the interface - emergencyRoom, surgeryRoom, cafeteria.

/*public Hospital() {
	System.out.println("This constructor is from default constructor");
	}
	Interface cant have constructor */

public interface Hospital{
	public void emergencyRoom();
	public void surgeryRoom();
	public void cafeteria();

public default void morgue () {
	System.out.println("This is a default method, morgue.");
	
}
public static void pharmacy () {
	System.out.println("This is a static method, pharmacy.");
}
}
//An interface can inherit more than one interface
//An interface can not inherit regular class or abstract class
//An interface can inherit more than one interface
	