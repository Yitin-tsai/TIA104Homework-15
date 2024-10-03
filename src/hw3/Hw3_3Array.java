package hw3;

import java.util.Scanner;
import java.util.Arrays;

public class Hw3_3Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[50];
		int count=0; 
		System.out.println("請輸入你不喜歡的數字!");
		int bad = sc.nextInt();
		
//		將需要的數字存入陣列
		for(int j = 1 ; j<50 ; j++ ) {
			if ((j % 10 !=bad) && (j / 10 !=bad)) {
				nums[count] = j;
				count++; 
				}
			}
//		印出陣列
		for(int i = 0; i < count; i++) {
			System.out.print(nums[i]+"\t");
			if( i>0&&(i-5)%6==0) {
				System.out.println();
				}
			}
		System.out.println("總共有"+ count +"個數字可以選擇");
		System.out.println("6個隨機可以選擇數字為:");
		
//		生成六個隨機數字並印出
		int[] random = new int[6];
		for( int i = 0 ; i<=5 ;i++) {
			random[i] = (int)(Math.random() * count) + 1 ;
			}
		Arrays.sort(random);
		for(int i = 0 ; i<=5 ;i++) {
			System.out.print(random[i]+"\t");
		}
	
	}
}	



