package hw5Q2Abstraction03;

public interface University {// interface name is always in upper case
	public void classSize();//Does it have to be always public?
	public void field();//method declared in a interface but can't be implemented(no curly brace)
	public void teacher();//is there a shortcut to write declared method like this
	public static void library() {//static method
	}
	public default void	gymnesium () {	//default method
	}	

}