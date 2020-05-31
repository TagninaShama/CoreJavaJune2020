package model;
import java.text.NumberFormat;
import java.util.Locale;
public class CreditCard {
	private String fName;
	private String lName;
	private String customer = null;
	private int accountNum;
	private double balanceDue; 
	private double percentToPay;
	//default constructor
	public CreditCard() {
		super();
		this.fName = "Vic";
		this.lName = "Allen";
		this.accountNum = 2222;
		this.balanceDue = 500;
		this.percentToPay = 10;
	}
	//constructor
	public CreditCard( String fName, String lName,int accountNum, double balanceDue,
			double percentToPay) {
		super();
		this.lName = lName;
		this.fName = fName;
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

	
	//method - data and the equations 
	public String data() {
		String table= "<table> <tr> <th> Month </th> <th> Interest </th> <th> Payment </th><th> Balance </th> </tr>";
	    
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
			table += "<tr> <td>"+i +"</td> <td>"+ft.format(interest)+"</td> <td>"+ ft.format(payment)+ "</td> <td>"+ ft.format(balanceDue) + "</td></tr>";
			if(balanceDue < intPay) {
				interest = balanceDue * 0.015;
				payment = balanceDue + interest;
				balanceDue = 0.0;
				i++;
				table += "<tr> <td>"+i +"</td> <td>"+ft.format(interest)+"</td> <td>"+ ft.format(payment)+ "</td> <td>"+ ft.format(balanceDue) + "</td></tr></table>";
				break;
				
			}	
		}
		return table;
	}

}
