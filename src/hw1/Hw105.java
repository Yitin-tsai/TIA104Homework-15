package hw1;

public class Hw105 {
	public static void main (String[] args){
		int saveing = 1500000;
		double rate = 0.02;
		double TenYearSaveing = saveing*(Math.pow(1+rate, 10));
		
		System.out.println(TenYearSaveing);
	}

}
