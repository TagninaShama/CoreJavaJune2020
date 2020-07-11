package hw3Q4variableAndMethod01;

public class TestEmployee {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee(); 
		employee.Name = "Tofael";
		employee.age = 44; 
		employee.sex = 'M';
		employee.usaCitizen = false;
		employee.empInfo();
		
		System.out.println("********************************");
		Employee employee02 = new Employee();
		employee02.Name = "Shama";
		employee02.age = 22; 
		employee02.sex = 'F';
		employee02.usaCitizen = true;
		employee02.empInfo();

	}

}

/*Initialize object and method. I want the first outcome in console as 
 * --> My name: Tofael, Age: 44, Sex: M and USA Citizen status: false. 
 * I want second outcome in console for your info. 
 * So, Total 2 outcome is expecting from the test class. */
