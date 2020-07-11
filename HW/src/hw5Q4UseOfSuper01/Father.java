package hw5Q4UseOfSuper01;

public class Father {
	public String Name;
	public int age;
	public char sex;
	public boolean usCitizen;
	
	public Father() {
		System.out.println("This is default constructor from father");
	}

	public Father(String name, int age, char sex) {
		super();
		Name = name;
		this.age = age;
		this.sex = sex;
		System.out.println(Name + age + sex);
		
	}
	
	
	public void father() {
		System.out.println("This method  is from father");
	}
	
	public void fatherInfo(String name, int age, char sex) {
		
		Name = name;
		this.age = age;
		this.sex = sex;
		
		System.out.println("Name" +name +"\nAge"+age+"\nSex"+sex);
		
	}
	
	
}
