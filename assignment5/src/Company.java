import java.util.HashMap;
import java.util.Scanner;

public class Company {
	private HashMap<Integer, Employee> employeeDatabase = new HashMap<Integer, Employee>();
	
	public HashMap<Integer,Employee> getEmployeeDatabase()
	{ 
		return employeeDatabase;
	}

	/*
	 * Creates a new Employee object with the name and salary initialized
	 * to the values passed in through the parameter. Adds the Employee
	 * to the employeeDatabase HashMap.
	 */
	public void addEmployee(String name, double s)
	{
		Employee e = new Employee(name,s);
		employeeDatabase.put(e.getId(), e);
	}
	
	/*
	 * Complete the addManager method that accepts values for the Manager's name,
	 * salary, branchLocation, and numSubordinates as parameters (in that order).
	 * 
	 * This method should create a new Manager object, initialize name, salary,
	 * brancLocation, and numSubordinates to the values passed in through the
	 * parameters. The initialized Manager object should then be added to the
	 * employeeDatabase HashMap.
	 *Note: the id is already being set to the curernt employeeCount in the Employee constructor.
	 */
	public void addManager(String name, double s, String loc, int numSub)
	{
	   Manager m = new Manager();
		m.name=name;
		m.salary=s;
		m.setBranchLocation(loc);
		m.setNumSubordinates(numSub);
		
		employeeDatabase.put(m.getId(), m);
	}
}
