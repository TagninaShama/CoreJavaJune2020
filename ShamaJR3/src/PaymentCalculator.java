import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class PaymentCalculator {

	Scanner keyboard = new Scanner(System.in);
	public String fName;
	public String lName;
	public String customer = null;
	public int accountNum;
	public double balanceDue; 
	public double percentToPay;
	//default constructor
	public PaymentCalculator() {
		super();
		this.fName = "Vic";
		this.lName = "Allen";
		this.customer = "Vic Allen";
		this.accountNum = 2222;
		this.balanceDue = 500;
		this.percentToPay = 10;
	}
	//constructor
	public PaymentCalculator(String lName, String fName, String customer, int accountNum, double balanceDue,
			double percentToPay) {
		super();
		this.lName = lName;
		this.fName = fName;
		this.customer = customer;
		this.accountNum = accountNum;
		this.balanceDue = balanceDue;
		this.percentToPay = percentToPay;
	}
	//accessors and mutators
	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the customer
	 */
	public String getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	/**
	 * @return the accountNum
	 */
	public int getAccountNum() {
		return accountNum;
	}

	/**
	 * @param accountNum the accountNum to set
	 */
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	/**
	 * @return the balanceDue
	 */
	public double getBalanceDue() {
		return balanceDue;
	}

	/**
	 * @param balanceDue the balanceDue to set
	 */
	public void setBalanceDue(double balanceDue) {
		this.balanceDue = balanceDue;
	}

	/**
	 * @return the percentToPay
	 */
	public double getPercentToPay() {
		return percentToPay;
	}

	/**
	 * @param percentToPay the percentToPay to set
	 */
	public void setPercentToPay(double percentToPay) {
		this.percentToPay = percentToPay;
	}

	//method - user input(asking the user to enter information)
	public void userInput() {
		System.out.print("First Name: ");
		fName = keyboard.nextLine();
		System.out.print("Last Name: ");
		lName = keyboard.nextLine();
		System.out.print("Acount #: ");
		accountNum = keyboard.nextInt();
		System.out.print("Balance Due: ");
		balanceDue = keyboard.nextDouble();
		System.out.print("Percent to Pay: ");
		percentToPay = keyboard.nextDouble();}
	//method - header 
	public void header( ) {
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
	//method - data and the equations 
	public void data() {
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
	public void footer() {
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("*********************************************************************************************************");
	}


}
