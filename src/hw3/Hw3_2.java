package hw3;

import java.util.Scanner;

public class Hw3_2 {
	public static void main(String[] args) {
		int i ;
		i = (int)(Math.random() * 10) ;
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!");
		int j = sc.nextInt();
		while(i != j) {
			System.out.println("猜錯囉");
			j = sc.nextInt();
		}
		if(i == j ) {
			System.out.println("答對了!答案就是"+ i );
		}
	}
}
