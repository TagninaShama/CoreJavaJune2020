package javaBasicsShama;

public class Employee02 {
	public static String empName = "Shama"; 
	public static int empId = 6250; 
	
	

	public static void main(String[] args) {
		public static void empInfo() {
			System.out.println(empName);
			System.out.println(empId);
		}
		empInfo();
	}
	
}

//you can't put a static method inside the method. It will give you the illegal modifier error. The method have to be either before or after the main method.


/*
 * 06) Create a Class "Employee02" by copying class "Employee01". Change the variables to static. 
 * Can you put static method "empInfo" under main method? If yes, paste the code below with the answer "Yes" 
 * in comments.If no, also paste the code below with an explanation in comments.
 */
