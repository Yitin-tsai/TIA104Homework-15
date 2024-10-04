package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3_1_ {
	public static void main(String[] args){
		double [] x = new double[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("input numbers");
		for(int i = 0; i< x.length; i++) {
//			if(sc.nextDouble()>0) {     
////			                            呼叫方法後須將scan輸入的數字以變數名稱暫存，才能進行比對，
////										左邊的寫法會變成每次進到第一行變會重新呼叫一次方法再輸入一次數字。
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
			if(x[i]>0) {
				System.out.print(x[i]+" ");
				}
			else {
				break;
			}
		}
		if (x[0] == x[1] && x[1] == x[2] && x[1] !=0) {
			System.out.println("這是一個正三角形");
		}
		else if ((x[0] == x[1] || x[1] == x[2]) && ((x[0] + x[1]) >x[2])&& x[0] !=0) {
			System.out.println("這是一個等腰三角形");
		}
		else if ((((x[0]*x[0] + x[1]*x[1]) == x[2]*x[2])) && x[0] !=0) {
			System.out.println("這是一個直角三角形");
		}
		else if ((x[0] + x[1])> x[2] && x[0] != 0) {
			System.out.println("這是一個三角形");
		}
		else {
			System.out.println("這不是一個三角形");
		}
	}

}

