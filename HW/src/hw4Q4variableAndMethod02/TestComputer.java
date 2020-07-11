package hw4Q4variableAndMethod02;


public class TestComputer {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		computer.Brand = "Apple";
		computer.Model = "macbookAir";
		computer.price = 800 ;
		computer.OperatingSystem = "MacOS Mojave";
		computer.madeinUSA = false;
		
		computer.computerConfigeration();
	

	}

}