package hw6Q2Abstraction04;

public class ColumbiaUniversity extends MedicalSchool implements University,VocationalSchool{
	
	public ColumbiaUniversity() {
		System.out.println("This is a default constructor from Columbia University.");
	}//this is a default constructor, which have to have the same name as class
	
	public void biology() {
		System.out.println("This is from Columbia University.");
	}// non abstract method created
	@Override
	public void commonRoom() {
		System.out.println("This commonRoom method  is from College Interface.");
		
	}

	@Override
	public void laboratory() {
		System.out.println("This laboratory method  is from College Interface.");
		
	}

	@Override
	public void languageClub() {
		System.out.println("This languageClub method  is from Interface College.");
		
	}

	@Override
	public void emergencyRoom() {
		System.out.println("This emergencyRoom method  is from  Interface Hospital.");
		
	}

	@Override
	public void surgeryRoom() {
		System.out.println("This surgeryRoom method  is from Interface Hospital.");
		
	}

	@Override
	public void cafeteria() {
		System.out.println("This cafeteria method  is from Interface Hospital.");
		
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("This aeronauticalInfo method  is from Interface AeronauticalSchool.");
		
	}

	@Override
	public void vocationalInfo() {
		System.out.println("This vocationalInfo method  is from Interface VocationalSchool.");
		
	}

	@Override
	public void classSize() {
		System.out.println("This classSize method  is from  Interface University.");
		
	}

	@Override
	public void field() {
		System.out.println("This field method  is from  Interface University.");
		
	}

	@Override
	public void teacher() {
		System.out.println("This teacher method  is from  Interface University.");
		
	}

	@Override
	public void anatomyLab() {
		
	}

	@Override
	public void hygine() {
		
	}

	@Override
	public void computerLab() {
		
	}
}

//The keyword "extends" is used to inherit regular class
	//A regular class can only inherit one regular class
	//A regular class can not inherit more than one regular class
	//A regular class can not  inherit interface or abstract  class
	//public void Chemistry(); its not possible to create abstract class in regular class
	