import java.util.*;
public class newHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Scanner keyboard = new Scanner(System.in);
  HashMap < String , Integer > grades = new HashMap <String , Integer>();
  
  System.out.print("how many students do you have? ");
  int numStudents = keyboard.nextInt();
  
  // <Name, Grade> hashmap filler
  
  for(int i = 0; i < numStudents; i++) 
  {
	  keyboard.nextLine();
	  //get student's name and grade
	  System.out.print("Student name: ");
	  String name = keyboard.nextLine();
	  System.out.print( "Student grade: ");
	  int grade = keyboard.nextInt();
	  
	  grades.put(name, grade);
	  
  }
  
  System.out.println(grades);
  
  
  
  
  
  
	}

}
