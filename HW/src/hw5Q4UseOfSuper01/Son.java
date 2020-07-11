package hw5Q4UseOfSuper01;

public class Son extends Father{
	
	public int stID;
	public char grade;
	
	
	public Son(){
		super();
		super.father();
		super.fatherInfo("Giasuddin Ahmed", 60, 'M');
		super.age = 80;
		System.out.println(age);
		System.out.println("This is default constructor from Son");
	}


	public Son(int stID, char grade) {//this is a parameterized constructor
		//super();
		
		super("Gias2", 70, 'M');//parametarized constructor called
		super.father();//method called
		super.fatherInfo("Gias", 80, 'M');//parametarized method called
		super.age = 83;//variable called
		super.Name = "Gias4";//variable called
		super.usCitizen = false;//variable called
		System.out.println(age+Name+ usCitizen);
		
		
		this.stID = stID;
		this.grade = grade;
	}
	
	public void son() {//this is a method
		//super();//default  constructor  can't called in a method
		
		//super("Gias3", 77, 'M');//parametarized constructor  can't called in a method
		System.out.println("This method is from son class");
		super.age = 88;//variable called
		
		super.father();//method called
		super.fatherInfo("Gias", 80, 'M');//parametarized method called
		
	}
	
	public void SonInfo(int stID, char grade) {//this is a parameterized method
		//super();
		super.age = 89;//variable called
		super.father();//method called
		super.fatherInfo("Giasuddin", 50, 'M');//parametarized method called
		System.out.println("This is from method sonInfo.");
		this.stID = stID;
		this.grade = grade;
	}

}
