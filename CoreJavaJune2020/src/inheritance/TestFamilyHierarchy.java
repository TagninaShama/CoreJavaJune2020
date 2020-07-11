package inheritance;

public class TestFamilyHierarchy {

	public static void main(String[] args) {
		Grandfather grandfather = new Grandfather(); // default Constructor initialize
		grandfather.Name="Ismail"; //variable initialize
		grandfather.age=434; //variable initialize
		grandfather.grandfatherInfo();
		
		Father father = new Father();
		father.Name = "Johir"; //variable initialize
		father.age = 65; //variable initialize 
		father.fatherInfo();

	}

}