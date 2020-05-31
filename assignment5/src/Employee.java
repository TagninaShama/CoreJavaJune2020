public class Employee {

		protected int id; //initialized to current employeeCount
		protected String name;
		protected double salary;
		protected static int employeeCount = 0;
		
		//2 Constructors
		public Employee() //default
		{
			id = employeeCount;
			name = "Name TBD";
			salary = 0;
			employeeCount++;
		}


		public Employee(String name, double s)
		{
			id = employeeCount;
			this.name = name;
			salary = s;
			employeeCount++;
		}
		
		public void print()
		{
			System.out.println("Employee ID: " + id);
			System.out.println("Name: " + name);
			System.out.println("Salary: $" + salary);
		}
		
		public int getId()
		{
			return id;
		}
		public double getSalary()
		{
			return salary;
		}
		public String getName()
		{
			return name;
		}
		public void setName(String n)
		{
			name = n;
		}
		public void setSalary(double s)
		{
			salary = s;
		}

		public void setId(int i)
		{
			id = i;
		}

		public static int getEmployeeCount()
		{
			return employeeCount;
		}
		
		public boolean equals(Employee e)
		{
			if(name.equals(e.getName()) && id == e.getId() && equalSalaries(salary, e.getSalary()))
				return true;
			else
				return false;
		}
		
		//private helper method to compare two doubles - used in equals method
		private boolean equalSalaries(double x, double y)
		{
			if(x-y < .01 || y-x < .01)
				return true;
			else
				return false;
		}
}
