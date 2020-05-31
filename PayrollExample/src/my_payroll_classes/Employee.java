/**
 * 
 */
package my_payroll_classes;

import java.util.Calendar;

/**
 * @author tagninashama
 *
 */
public class Employee {
	private String firstName; /*private=access modifier...only available in this class...
	                          String is class not a premitive data type*/
	private String lastName;
	private int empID; /*premitive data type*/
	private Calendar startDate;
	//TODO write the constructors
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the empID
	 */
	public int getEmpID() {
		return empID;
	}
	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	/**
	 * @return the startDate
	 */
	public Calendar getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	

}
