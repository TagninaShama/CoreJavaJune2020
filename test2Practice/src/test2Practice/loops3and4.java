package test2Practice;

public class loops3and4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "applepppppppplklklkp";

		int index = -1;

		char letter = 'p';

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==letter) {
				 index = i;
				 //break;
			}
		}
		System.out.println(index);
	}
}
