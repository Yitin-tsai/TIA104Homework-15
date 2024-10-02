package hw3;

import java.util.Arrays;
import java.util.Scanner ;

public class Hw3_1_NG {
	
	public static void main(String[] args){
		double [] x = new double[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("input numbers");
		for(int i = 0; i< x.length; i++) {		
			x[i]=sc.nextDouble();
		}
		Arrays.sort(x) ;
		System.out.print("三邊長為:");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
		
		if(x[0]<=0||x[1]<=0||x[2]<=0) {
			System.out.println("請輸入大於零的數");
		
			if( x[0]==x[1] &&x[1]==x[2]) {
				System.out.println("這是一個正三角形");
			}
			else if ((x[0]==x[1] || x[1]==x[2] || x[0]==x[2]) && ((x[0]+x[1])>x[2])) {
				System.out.println("這是一個等腰三角形");
			}
			else if((x[0]*x[0]+x[1]*x[1])==x[2]*x[2]) {
				System.out.println("這是一個直角三角形");
			}
			else if (((x[0]+x[1])>x[2])|| ((x[1]+x[2])>x[0]) || ((x[0]+x[2])>x[1])) {
				System.out.println("這是一個三角形");
			}
			if(x[0]<=0||x[1]<=0||x[2]<=0) {
				System.out.println("請輸入大於零的數");
			}
			else {
				System.out.println("這不是一個三角形");
			}
		}	
	}
}
