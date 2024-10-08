package hw4;

public class Hw4_3aeiouCount {
	public static void main(String[] args) {
		String s = "“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune";
		int count = 0;
		for(int i =0 ; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u' ) {
				count++;
			}
		}
		System.out.println("母音數目為"+ count);
	}

}
