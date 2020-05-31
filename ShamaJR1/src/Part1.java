import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner
		Scanner keyboard = new Scanner(System.in);
		//variables
		String lName;
		String fName;
		String customer;
		int accountNum;
		double balanceDue;
		double percentToPay;
		//userInput statements
		System.out.print("First Name: ");
		fName = keyboard.nextLine();
		System.out.print("Last Name: ");
		lName = keyboard.nextLine();
		System.out.print("Acount #: ");
		accountNum = keyboard.nextInt();
		System.out.print("Balance Due: ");
		balanceDue = keyboard.nextDouble();
		System.out.print("Percent to Pay: ");
		percentToPay = keyboard.nextDouble();
		//header statements
		System.out.println("********************************************************************************************************");
		System.out.println("Credit Payment Schedule");
		customer = fName + " " + lName;
		System.out.println("Customer: " + customer);
		System.out.println("Account #: " + accountNum);
		NumberFormat ft = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		System.out.println("Balance Due: " + ft.format(balanceDue)); 
		System.out.println("");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("Month \t Interest \t Payment \t Balance");
		//data and the equations
		double interest = 0;
		double payment = 0; 
		interest = balanceDue * 0.015; 
		double intPay = (balanceDue + interest) * (percentToPay/100) ; 

		for (int i = 1; i <= i+1 ; i++) {
			interest = balanceDue * 0.015;
			payment = ((balanceDue + interest) * (percentToPay/100)); 
			balanceDue = balanceDue + interest - payment; 
			System.out.println(i+ "\t" +ft.format(interest)+ "\t\t" +ft.format(payment)+ "\t\t" +ft.format(balanceDue));
			if(balanceDue < intPay) {
				interest = balanceDue * 0.015;
				payment = balanceDue + interest;
				balanceDue = 0.0;
				System.out.println(i+1+ "\t" +ft.format(interest)+ "\t\t" +ft.format(payment)+ "\t\t" +ft.format(balanceDue));
				break;
			}	
		}
		//footer
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("********************************************************************************************************");
	}

}















