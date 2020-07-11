package hw4Q5Constructor01;

/* p05) Create a package name "hw4Q5Constructor01" in HW project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (as char). Declare default constructor and multiple parameterized constructor. Use only one System.out.println() in each constructor. Create another class TestComputer. Create object as many as you want under main method. Initialize constructors. I want the first outcome in console as --> This is from default Constructor of Computer class. Second outcome -- > My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? : false. I want the third outcome in console for your configuration. Fourth outcome for 1 variable, 5th outcome for 3 variable, 6th outcome for 5 variable. Paste your constructor github link below*/
public class Computer {
	
	public String Brand;
	public String Model;
	public int price;
	public String OperatingSystem;
	public boolean madeinUSA;
	public char grade;
	
	public Computer() {
		System.out.println("This is from default constructor");
	}
	public Computer(String Brand) {
		this.Brand= Brand;
		System.out.println("Brand:"+ Brand);
		}
	
	
	
	public Computer(String brand, String model, int price) {
		super();
		Brand = brand;
		Model = model;
		this.price = price;
		System.out.println("My Brand:"+ Brand + ", Model:" + Model + ", Price:$" + price  );
	}
	public Computer(String brand, String model, int price, String operatingSystem, boolean madeinUSA) {
		super();
		Brand = brand;
		Model = model;
		this.price = price;
		OperatingSystem = operatingSystem;
		this.madeinUSA = madeinUSA;
		System.out.println("My Brand:"+ Brand + ", Model:" + Model + ", Price:$" + price + ", "
				+ " Operating System:"
				 + OperatingSystem + ", Made in USA: " + madeinUSA );
		
	}
	
	public void computerConfigeration() {
		System.out.println("My Brand:"+ Brand + ", Model:" + Model + ", Price:$" + price + ", "
				+ " Operating System:"
				 + OperatingSystem + ", Made in USA: " + madeinUSA );
	}

}