import java.util.*; //import java.util.HashMap; astrick imports everything 
public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashMap < String, String > definitions = new HashMap <String, String>();
   String word = "zebra";
   String definition = "an African wild house with black-and-white stripes";
   String word1 = "panda";
   String definition1 = "is a bear native to south central China";
   
   definitions.put(word, definition);
   definitions.putIfAbsent("zebra", "No Value");
   //System.out.println(definitions.get(word));
   definitions.put("panda", "is a bear native to south central China");
   
   
   for(String s : definitions.keySet())    //for(String s : definitions.values())
{
	System.out.println(s);
}
   
   //System.out.println(definitions);
  
   
	}

}
