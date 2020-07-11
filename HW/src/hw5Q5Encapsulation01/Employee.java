package hw5Q5Encapsulation01;

public class Employee {
	protected String empNameString;
	protected int empAge;
	protected char sex;
	protected boolean usCitizen;
	
	
	public String getEmpNameString() {
		return empNameString;
	}
	public int getEmpAge() {
		return empAge;
	}
	public char getSex() {
		return sex;
	}
	public boolean isUsCitizen() {
		return usCitizen;
	}
	public void setEmpNameString(String empNameString) {
		this.empNameString = empNameString;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}
	
	

}
