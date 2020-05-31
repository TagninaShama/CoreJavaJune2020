public class Payroll {

	public static void main(String[] args) {
	
		//Scanner scnr = new Scanner(System.in);
		Employee e1 = new Employee(); //create Employee object with default constructor
		System.out.println(e1.getID()); //access and print Employee e1's ID
		//mutatotr
		e1.setMonthlyPayment(1000);
		System.out.println(e1.taxDeduction(.25));
		
		// 7. Create 3 sample Employee objects 
		//     - use different constructors and mutators to set attribute values
		
		// 8.  Call various Employee methods to set values and retrieve information
		
		// 9.  Check that your unpaidLeave and taxDeduction methods work to expectations

	}

}
