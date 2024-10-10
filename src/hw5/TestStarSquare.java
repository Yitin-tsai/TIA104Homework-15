package hw5;

import java.util.Scanner;

public class TestStarSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width,height;
		System.out.println("請輸入長方形寬度");
		width = sc.nextInt();
		System.out.println("請輸入長方形長度");
		height = sc.nextInt();
		
		StarSquare x = new StarSquare();
		x.starSquare(width, height);
		
	}

}
