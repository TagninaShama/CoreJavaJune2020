
public class Employee {
	
	// instance field
	
	protected String name;
	private int id;
	private double salary;
	private static int employeeCount = 0;
	
	// accessor methods
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public static int getEmployeeCount()
	{
		
		return employeeCount;
	}
	
	// mutator methods
	public void setId(int r)
	{
		id = r;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	public void setSalary(double s)
	{
		salary = s;
	}
	
	// constructors
	
	public Employee () //default
	{
		id = employeeCount;
        name = "tbd";
        salary= 0;
        employeeCount++;
        
	}
	
	public Employee(String name, double salary) //**fix
	{
		this.id =employeeCount;
		this.name=name;;
		this.salary = salary;
		employeeCount++;		
	}
	public Employee(int id, String name, double salary)
	{	
		this.id = employeeCount;
		this.name = name;
		this.salary = salary;
		employeeCount++;
	}
	
	public boolean equals(Employee e)
	{
		if(name.equals(e.getName())&& id == e.getId() && salary ==e.getSalary())
		{
			return true;
		}
		else 
			return false;
	}
	



	public void print()
	{
		System.out.println("Employee ID: " +id);
		System.out.println("Name: " +name);
		System.out.println("Salary: $" +salary);
				
	}
	
}
