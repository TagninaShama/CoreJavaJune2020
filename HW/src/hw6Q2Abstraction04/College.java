package hw6Q2Abstraction04;

//Declare some methods inside the interface - commonRoom, laboratory, languageClub 

public interface College {
	public void commonRoom();
	public void laboratory();
	public void languageClub();
	
public  default void dorm () {
	System.out.println("This is a dorm method from College");
	 }
public static void  studyroom () {
	System.out.println("This is static method study room from College");
	}
	 
}
