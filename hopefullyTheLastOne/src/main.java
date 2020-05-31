
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Company c = new Company(); //This should run your code once completed!
		
		//This should loop through your HashMap's values, calling the
		//print method for each Employee object.
		for(Employee e: c.getEmployeeDatabase().values()) 
		{
			e.print();
		}
		c.addEmployee("Joe Joe", 25000);
		c.increaseSalary(2); //Joe Joe has id = 2
		c.getEmployeeDatabase().get(2).print(); //print Joe Joe's info
		
	}
	
	

}
