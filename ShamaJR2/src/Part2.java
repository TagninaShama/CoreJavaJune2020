import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner keyboard = new Scanner(System.in);
		String lName;
		String fName;
		String customer = null;
		int accountNum;
		double balanceDue; 
		double percentToPay;
		//asking the user to input information
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
		//creating an object 
		Part2 obj = new Part2();
		//calling the methods
		obj.nameMethod(fName, lName, customer, accountNum,balanceDue);
		obj.nameMethod2(balanceDue, percentToPay);
		obj.footer();
	}
	//method - nameMethod includes header
	public void nameMethod(String fName, String lName, String customer, int accountNum, double balanceDue ) {
		System.out.println("*********************************************************************************************************");
		System.out.println("Credit Payment Schedule");
		customer = fName + " " + lName;
		System.out.println("Customer: " + customer);
		System.out.println("Account #: " + accountNum);
		//to format the numbers
		NumberFormat ft = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		System.out.println("Balance Due: " + ft.format(balanceDue)); 
		System.out.println("");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("Month \t Interest \t Payment \t Balance");
	}
	//method nameMethod2 includes the data and the equations 
	public void nameMethod2(double balanceDue, double percentToPay) {
		double interest = 0;
		double payment = 0;
		//to format the numbers
		NumberFormat ft = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
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
	}
	//method - footer 
	public void footer(){
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("*********************************************************************************************************");
	}
}

