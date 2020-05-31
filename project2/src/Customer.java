public class Customer {

		protected int id; //initialized to current employeeCount
		protected String name;
		protected double amount;
		protected static int customerCount = 0;
		
		//2 Constructors
		public Customer() //default
		{
			id = customerCount;
			name = "Name TBD";
			amount = 0;
			customerCount++;
		}
		
		
		public int getId()
		{
			return id;
		}
		public double getAmount()
		{
			return amount;
		}
		public String getName()
		{
			return name;
		}
		public void setName(String n)
		{
			name = n;
		}
		public void setAmount(double a)
		{
			amount = a;
		}

		public void setId(int i)
		{
			id = i;
		}

		public static int getCustomerCount()
		{
			return customerCount;
		}
		
		
}
