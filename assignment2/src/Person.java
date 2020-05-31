public class Person {

	String name;
	int age;
	double gpa;
	String major;
	
	public Person(String aName, int aAge, String aMajor, double aGpa)
	{
		name = aName;
		age = aAge;
		gpa = aGpa;
		major = aMajor; 
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String pname) {
		name = pname;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int page) {
		age = page;
	}

	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double pgpa) {
		gpa = pgpa;
	}

	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @param major the major to set
	 */
	public void setMajor(String pmajor) {
		major = pmajor;
	}
	
	public void printInfo()
	{
		System.out.println("#########################");
		System.out.println("Terry College of Business");
		System.out.println("Name: " + name);
		System.out.println("Major: " + major);
		System.out.println("GPA: " + gpa);
		System.out.println("#########################");
		
	}
	
}
