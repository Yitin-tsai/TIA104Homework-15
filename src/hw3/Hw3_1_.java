package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3_1_ {
	public static void main(String[] args){
		double [] x = new double[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("input numbers");
		for(int i = 0; i< x.length; i++) {
//			if(sc.nextDouble()>0) {     為什麼這樣寫不行?
//				x[i]=sc.nextDouble();
//			}
			double var = sc.nextDouble();
			if(var>0) {
				x[i]=var;
			}
			else {
				System.out.println("請輸入正整數");
				break;
			}
		}	
		Arrays.sort(x) ;
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		if (x[0] == x[1] && x[1] == x[2] && x[1] !=0) {
			System.out.println("這是一個正三角形");
		}
		else if (x[0] == x[1] || x[1] == x[2] && ((x[0] + x[1]) >x[2])) {
			System.out.println("這是一個等腰三角形");
		}
		else if ((((x[0]*x[0] + x[1]*x[1]) == x[2]*x[2])) && x[0] !=0) {
			System.out.println("這是一個直角三角形");
		}
		else if ((x[0] + x[1])> x[2] && x[0] != 0) {
			System.out.println("這是一個三角形");
		}
		else if (x[0] == 0 || x[1] == 0 || x[2] == 0) {
			System.out.println("錯誤");
		}
		else {
			System.out.println("這不是一個三角形");
		}
	}

}

