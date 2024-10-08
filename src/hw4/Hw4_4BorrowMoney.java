package hw4;

import java.util.Scanner;

public class Hw4_4BorrowMoney {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個數字");
		int j = sc.nextInt();
		String s ="";
		int[][] x = {{25,32,8,19,27},{2500,800,500,1000,1200}};
		for(int i =0 ; i<x[0].length;i++) {
			if(x[1][i]>j) {
				s += x[0][i]+" ";
			}
		}
		System.out.println(x.length);
		System.out.println("有錢可借的員工編號:" + s );
	}

}
