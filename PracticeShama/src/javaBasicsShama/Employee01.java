package javaBasicsShama;

public class Employee01 {
	public String empName = "Shama"; 
	public int empId = 6250; 
	
	public void empInfo() {
		System.out.println(empName);
		System.out.println(empId);
	}

	

	//public static void main(String[] args) {
		//empInfo();
	//}
}
//#1 you can't print them. the variable have to be static and the method have to be static as well. You also need main method and object inside to print
//The main() method is the entry point into the application….The signature of the method is always: public static void main(String[] args) { }……Command-line arguments are passed through the args parameter, which is an array of Strings
//You cannot print it without creating an object. Everything needs to static as well. you need to add this version to print it:

/*public class Employee01 {
	public static String empName = "Shama"; 
	public static int empId = 6250; 
	
	public static void empInfo() {
		System.out.println(empName);
		System.out.println(empId);
	}

	public static void main(String[] args) {
		empInfo();
	}

}
 */

//04) Create a class "Employee01". Assume you initialize 2 variable, empName = (your name), 
//empId = (any id) which are non-static. Create a non-static void method "empInfo" and call 
//those variables to print inside the method by System.out.println. Can you print your id and name? 
//Why do you need to call every method or variable to print under the main method? 
//Without creating an object, can you print non-static empInfo method in the console by System.out.println? //
//If yes, paste your code here. If no, explain by Java comments in one line what change you have to bring 
//print your name and id from main method. Paste your code below.