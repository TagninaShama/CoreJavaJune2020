package hw5Q2Abstraction03;

//Declare some methods inside the interface - commonRoom, laboratory, languageClub 

public interface College {
	public void commonRoom();
	public void laboratory();
	public void languageClub();
	
public  default void dorm () {
		 
	 }
public static void  studyroom () {
		
	}
	 
}
