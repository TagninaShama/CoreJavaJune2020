
public class Manager extends Employee{

	private String branchLocation;
	private int numSubordinates;
	
	
	//Constructor - default 
	
	public Manager()
	{
		branchLocation = "Athens, GA";
		numSubordinates=10;
	}
	
	public Manager(String s)
	{
		//super(700, "TBD", 6000);   calls the constructor 
		branchLocation = s;
		numSubordinates = 10;
	}
	//overriding vs overloading
	
	@Override
	public void print()
	{
		//call the employee class's priny method
		//this.print(); won't work
		super.print(); //will work
		System.out.println("Branch Location: " +this.branchLocation);
		System.out.println("Number of Subordinates: " +this.numSubordinates);
		
	}
	
	//override the equal method!
	@Override
	
	public void setName(String n) {
	
		 name = n;
	} 
}
