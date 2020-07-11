package hw6Q2Abstraction04;

public interface University extends College, Hospital{// interface name is always in upper case
	public void classSize();//Does it have to be always public?
	public void field();//method declared in a interface but can't be implemented(no curly brace)
	public void teacher();//is there a shortcut to write declared method like this
	public static void library() {//static method
		System.out.println("This is static method library.");
	}
	public default void	gymnesium () {	//default method
		System.out.println("This is a default method gymnesium");
	}	

}