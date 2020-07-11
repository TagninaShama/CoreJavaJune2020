package hw5Q4UseOfSuper01;

public class TestInheritance {
	public static void main(String[] args) {
		System.out.println("\n---------------------------------------------------------------");
		Son son = new Son();
		//Son son2 = new Son("Gias1", 55 , 'M');
		son.father();
		son.fatherInfo("ABC", 50, 'M');
		System.out.println("\n---------------------------------------------------------------");
		son.son();
		System.out.println("\n---------------------------------------------------------------");
		Son son3 = new Son(253663,'B');
		son.SonInfo(2463738, 'A');
		System.out.println("\n---------------------------------------------------------------");
		Father father = new Father();
		father.father();
		father.fatherInfo("Gias10", 30, 'M');
		System.out.println("\n---------------------------------------------------------------");
		Son son2 = new Son(76237, 'B');//ITS NOT PRINTING
		


	}

}
