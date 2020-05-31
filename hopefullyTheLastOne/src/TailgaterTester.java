
public class TailgaterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tailgate bob = new Tailgate();
		Tailgate jill = new Tailgate();
		Tailgate frank = new Tailgate();
		
		System.out.print(bob);
		System.out.print(jill);
		System.out.print(bob==jill);
		System.out.print(bob.equals(jill));
		bob.getDrinkFromCooler();
		
		//objName.methodName
		jill.getNumDrinks();
		bob.getNumDrinks();
		
		System.out.println(Tailgate.getNumDrinksInCooler());
		
		bob.getDrinkFromCooler(); //-1
		jill.getDrinkFromCooler(); //-1
	
		System.out.println(Tailgate.getNumDrinksInCooler());
		
	}

}
