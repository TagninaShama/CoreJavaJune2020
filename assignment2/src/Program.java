import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		
		//Declare person objects here
		
		Person person1 = new Person("Nikhil Dewars",40 , "MIS", 3.9);
		Person person2 = new Person("Mark Budweiser",23 , "MIS", 3.2);
		Person person3 = new Person("Craig Appletons",25 , "MIS", 3.0);
		Person person4 = new Person("Jim Beam",20 , "Finance", 3.7);
		Person person5 = new Person("Jack Daniels",19 , "Accounting", 2.9);
				
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in a person number whose gpa you would like to change > ");
		int personSelect = scan.nextInt();
		
		System.out.println("Type in the gpa you would like the person's to be > ");
		double newGPA = scan.nextDouble();
	

		
		if (personSelect == 1)
		{
			person1.setGpa(newGPA);
			person1.printInfo(); 
			}
		else if (personSelect == 2) {
			person2.setGpa(newGPA);
			person2.printInfo();
		}
		else if (personSelect == 3) {
			person3.setGpa(newGPA);
			person3.printInfo();
		}
		else if (personSelect == 4) {
			person4.setGpa(newGPA);
			person4.printInfo();
		}
		else if (personSelect == 5) {
			person5.setGpa(newGPA);
			person5.printInfo();
			
		}
		else if (personSelect <= 1 || personSelect > 5 ) {
			System.out.println("Please select a person number between 1 and 5.");
		}
		}
		
		
	}




