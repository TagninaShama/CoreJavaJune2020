package hw5Q5Encapsulation01;

public class TestEmployee {


	public static void main(String[] args) {
		
		
		Employee employee = new Employee();
		employee.setEmpNameString("Nishat");
		employee.setEmpAge(20);
		employee.setSex('F');
		employee.setUsCitizen(false);
		
		
		System.out.println("Name: "+ employee.getEmpNameString()+ "\t Age: "+employee.getEmpAge()+ "\n Sex: "
				+employee.getSex()+ "\r Is US citizen: "+ employee.isUsCitizen());
		

	}

}