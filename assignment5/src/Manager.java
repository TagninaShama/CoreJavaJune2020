public class Manager extends Employee {
 private int numSubordinates;
 private String branchLocation;
 
 public Manager() {
		branchLocation = "Athens, GA";
		numSubordinates= 10;
	}
	
	public Manager(String s) {
		branchLocation = s;
		numSubordinates = 10;
	}
 
 public int getNumSubordinates() {
	 return numSubordinates;
 }//getNum
 
 public void setNumSubordinates(int sub) {
	 numSubordinates = sub;
 }//setNum
 
 public String getBranchLocation() {
	 return branchLocation;
 }//getBranch
 
 public void setBranchLocation(String branch) {
	 branchLocation = branch;
 }//setBranch
 @Override
 public void print() {
	 super.print();
	 System.out.println("Branch Location: "+branchLocation);
	 System.out.println("Number of Subordinates: "+numSubordinates); 
 }//print
	
 public boolean equals(Manager m) {
	 if(super.equals(m)&&this.getNumSubordinates()==m.getNumSubordinates()
			 &&this.getBranchLocation().equals(m.branchLocation)) {
		 return true;
	 }
	return false;
 }//equals
	
	
	
	
}//Manager