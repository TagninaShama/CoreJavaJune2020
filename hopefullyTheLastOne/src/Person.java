
public abstract class Person {
	protected int idNum;     //8111111
	protected String name;  //Karen Aguar
	protected String myID; //kaguar
	
	public int getIdNum() {
		return idNum;
	}
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMyID() {
		return myID;
	}
	public void setMyID(String myID) {
		this.myID = myID;
	}
	
	//printInfo: void
	
	public abstract void printInfo(); // to make it abstract remove method body and add semi colon
	

}
