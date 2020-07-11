package hw4Q5Constructor01;

public class TestComputer {
	public static void main(String[] args) {

		Computer computer = new Computer();
		computer.Brand = "Apple";
		computer.Model = "macbookAir";
		computer.price = 800;
		computer.OperatingSystem = "MacOS Mojave";
		computer.madeinUSA = false;
		computer.computerConfigeration();
		
		Computer computer1 = new Computer();
		computer1.Brand = "Applemac";
		computer1.Model = "macbookPro";
		computer1.price = 1200;
		computer1.OperatingSystem = "MacOS Mojave";
		computer1.madeinUSA = false;
		computer1.computerConfigeration();

		Computer computer2 = new Computer("AppleMac");
		Computer computer3 = new Computer("AppleMac", "macbookPro", 1300 );
		Computer computer4 = new Computer("Apple", "ipad", 900 , "macOS", true);
		

	}
}
