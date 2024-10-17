package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileCalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		int x = 0;
		int y = 0 ;
		boolean x1 = true;
		boolean y1 = true;
		
		System.out.println("請輸入x的值:");
		while(x1) {	
			try {
				x = sc.nextInt();
				x1 = false;
			}catch(InputMismatchException e) {
				System.err.print("請輸入整數  ");
				e.printStackTrace();
				x1 = true;
				sc.next();
			}
		}	
		System.out.println("請輸入y的值:");
		
		while(y1) {
			try {
				y = sc.nextInt();
				y1=false;
			}catch(InputMismatchException e) {
				System.err.print("請輸入整數");
				e.printStackTrace();
				y1=true;
				sc.next();
			}
		}	
		try {
			System.out.println(x + "的"+ y + "次方 = "+ c.powerXY(x, y));
		}catch(CalException e ) {
			e.printStackTrace();
		}
	
	}
}
