import java.util.*;
public class Company {
	
	// instance fields
	private HashMap <Integer, Employee> employeeDatabase = new HashMap <Integer, Employee> ();
	
	public HashMap <Integer, Employee> getEmployeeDatabase()
	{
		return employeeDatabase;
	}
	
	private void populateEmployeeDatabase(Scanner keyboard) {
		System.out.println("How many employees do you have?");
		int numEmployees = keyboard.nextInt();
		//System.out.println("Enter the name and salary for each employee");
		String employeeName;
		double employeeSalary;
		keyboard.nextLine();
		for (int i = 0; i < numEmployees; ++i) 
		{
			String line = keyboard.nextLine();
			employeeName = line.substring(0, line.indexOf(","));
			employeeSalary = Double.parseDouble(line.substring(line.indexOf(",")+1));
			//addEmployee(employeeName, employeeSalary);
			employeeDatabase.put(i,new Employee(employeeName, employeeSalary));
			
			
			
		}
		
	}
	
	public Company()
	{ 
		Scanner keyboard = new Scanner(System.in);
		populateEmployeeDatabase(keyboard);
	}
//			12. [Bonus]: Create an addEmployee method that accepts a name and salary as its parameters (in that
//			order), creates a new Employee object with these values and puts the new Employee with its id in the
//			HashMap.
//			13. [Bonus]: Create an increaseSalary method that accepts an int id as its parameter and increases the
//			Employee with the matching id’s salary by 5000.
		
	public void addEmployee(String name, int salary) {
		double money =(double) salary; //typecasting int to double 
		employeeDatabase.put(Employee.getEmployeeCount(), new Employee(Employee.getEmployeeCount(), name, money));
	}
	public void increaseSalary(int id) {
		if(employeeDatabase.containsKey(id)) {
			employeeDatabase.get(id).setSalary(employeeDatabase.get(id).getSalary()+5000);
		}
		
	}
	

	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		employee e3 = new employee(15, "Bob Jones", 500000);  //e1 and e2 are reference type and you cna't use equal equal sign with reference type
		//you have to write a dot equal method to check (like an array you need to loop through to check it
		//new creates a new space in the memory; without new they will be equal
       
		HashMap <Integer, employee> employee08 = new HashMap <Integer, employee> ();
		
		int idNum = 810;
		for (int i = 0; i <5 ; i++) 
		{
    	   employee e = new employee(idNum);
    	   employee08.put(idNum, e);
    	   idNum++;
        }
//		Scanner keyboard = new Scanner(System.in);
//		System.out.print("how many employee do you have? ");
//		  int numStudents = keyboard.nextInt();
//		  
//		  // <Name, Grade> hashmap filler
//		  
//		  for(int j = 0; j < numStudents; j++) 
//		  {
//			  
//		  }
//	    
//			  
//			  
		for(Integer i : employee08.keySet()) //810, 811......
		{
			employee e = employee08.get(i);
			e.print();
			
		}
//		 
		employee e1 = new employee(810, "Alice", 5000 );
		employee e2 = new employee(810, "bob", 9000 );
		
//		employee e2 = new employee();
//		System.out.println(e1.getId()); //prints 0
//		System.out.println(e2.getId());
//		
//		System.out.println(employee.getEmployeeCount());
//	
		}
*/
}
