package Nintyday;

public class Occurance_3 {

	public static void main(String[] args) {
		String str = "you have no choices other than following me!";
		int count = 0;
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if(array[i]=='o') {
				count = count+1;
			}
			
		}
		System.out.println("occurance of o is:"+ count);

	}

}
