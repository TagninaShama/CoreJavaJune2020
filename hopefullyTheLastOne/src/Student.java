
public class Student extends Person{
	
	enum Year{freshman, sophomore, junior, senior, graduate};
	Year year;

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		
	}

	//getYear
	public Year getYear()
	{
		return year;
	}
	
}
