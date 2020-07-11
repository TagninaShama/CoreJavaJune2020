package hw3Q4variableAndMethod01;

public class Employee {
	public String Name; 
	public int age;
	public char sex;
	public boolean usaCitizen;
	
	public void empInfo() {
		System.out.println("My name: "+ Name + "\nAge: " + age + "\nSex: " + sex + "\nUSA Citizen status: " + usaCitizen);
	}
	

}

/*Declare non static variable -- Name, age, sex and usaCitizen 
 * as String, int, char and boolean type. 
 * Implement a non static method inside the class 
 * -- empInfo and use only one System.out.println(). 
 * Use the variables inside sysout.
 * */
