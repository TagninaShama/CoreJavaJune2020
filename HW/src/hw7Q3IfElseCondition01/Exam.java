package hw7Q3IfElseCondition01;
/*Initialize your marks as variable. Now put the below condition 
 * and figure out which grade you deserve. 
 * marks < 0 || marks > 100 as invalid mark(sysout), 
 * marks >= 0 && marks <= 30 as fail(sysout), 
 * marks >= 31 && marks <= 60 as pass (sysout), 
 * marks >= 61 && marks <=100 as Pass with Honors(sysout).
 * 
 * 
 * */

public class Exam {
	public static void main(String[] args) {
	int marks = 40;

if (marks <0 || marks >100) {
	System.out.println("Invalid mark!");
}
	
else if (marks >= 0 && marks <= 30) {
	System.out.println("Fail!");
}
else if (marks >= 31 && marks <= 60) {
	System.out.println("Pass!");
}
else if (marks >= 61 && marks <=100) {
	System.out.println("Pass with Honors!");
}
}
}
