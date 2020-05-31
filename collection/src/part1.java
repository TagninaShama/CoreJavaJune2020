import java.util.ArrayList;

public class part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str[] = {"banana"};
 ArrayList<String> stringList = new ArrayList<String>();
 stringList.add("This"); //0
 stringList.add("is");//1
 stringList.add("test");//2
 // 1 find out where test is at - indexOf
// stringList.indexOf("test")
 stringList.add(stringList.indexOf("test"),"a"); 
 
// ArrayList<Integer> intList = new ArrayList<Integer>();
// intList.add(12);
// intList.add(15);
 	       System.out.println(stringList);
// 	for(int i=0; i <+stringList .size()-1;i++);
// 	{
// 		String myString = stringList.get(i);
//	}
 	for (String s: stringList)
 	{
 		System.out.println(s);
 	}
// 	for ( int x = intArray)
 	
	}
}
