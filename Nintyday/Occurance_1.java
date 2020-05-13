package Nintyday;

public class Occurance_1 {
	public static void main(String[] args) {
		String str = "you have no choices other than following me!";
		String replacedstr = str.replaceAll("[^o]", "");
		System.out.println("Occurance of o: " +replacedstr.length());
		
		
		
	}

}
