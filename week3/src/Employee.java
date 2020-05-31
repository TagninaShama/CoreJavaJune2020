public class Employee {

	//---------------------ATTRIBUTES
	int ID;
	String name;
	double hoursWorked;
	double hourlyWage;
	double monthlyPayment;

	
	//---------------------METHODS
	//1 Create a default constructor to initialize variables (accepts no arguments) [provided]
	public Employee()
	{
		ID = 0;
		name = "TBD";
		hoursWorked = 0;
		hourlyWage= 8.0;
		monthlyPayment = 0;
	}
	
	//	2. Create at least one other constructor that accepts parameters for initialization
	//
	
	//
	//	3. Create accessors and mutators for name, hoursWorked, hourlyWage, and monthlyPayment
	//			--note: the accessor and mutator for ID are provided below
	public void setID(int number) //int number = 15; //mutator
	{
		ID = number;
	}
	
	public int getID() //accessors
	{
		return ID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String x) //String x = "Karen";
	{
		name = x;
	}
	public void setHoursWorked(double x)
	{
		hoursWorked = x;
	}
	public double getHoursWorked()
	{
		return hoursWorked;
	}
	public void setHourlyWage(double h)
	{
		hourlyWage = h;
	}
	public double getHourlyWage()
	{
		return hourlyWage;
	}
	public void setMonthlyPayment(double m)
	{
		monthlyPayment=m;
	}
	public double getMonthlyPayment()
	{
		return monthlyPayment;
	}

	//
	//	4. Create an unpaidLeave method that receives a double and decreases the hoursWorked by that amount
	//
	
	public void unpaidLeave(double y)
	{
		hoursWorked = hoursWorked-y;
	}
	
	//In-Class Example: 
	//returns the amount earned by multiplying hours worked by hourly wage
	public double amountEarned()
	{
		double x = hourlyWage*hoursWorked;
		return x;
		// same as : return hourlyWage*hoursWorked;
	}
	//
	//	5.Create a taxDeduction method that receives a double taxPercentage and returns the amount of tax 
	//     that the employee will be paying, using only the taxPercentage and the monthlyPayment
	//
	public double taxDeduction(double taxPercentage)
	{
		return monthlyPayment*taxPercentage;
	}
}
