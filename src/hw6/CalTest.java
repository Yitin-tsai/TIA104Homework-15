package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		int x = 0;
		int y = 0 ;
		System.out.println("請輸入x的值:");
		try {
			x = sc.nextInt();
		}catch(InputMismatchException e) {
			e.printStackTrace();
			System.exit(0);
		}
			
		System.out.println("請輸入y的值:");
		try {
			y = sc.nextInt();
		}catch(InputMismatchException e) {
			e.printStackTrace();
			System.exit(0);
		}
		try {
			System.out.println(x + "的"+ y + "次方 = "+ c.powerXY(x, y));
		}catch(CalException e ) {
			e.printStackTrace();
		}
		
	}
}
