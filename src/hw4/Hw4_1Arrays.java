package hw4;

import java.util.Arrays;

public class Hw4_1Arrays {
	
	public static void main(String[] args) {
		int [] A = {29, 100, 39 ,41, 50, 8, 66, 77, 95, 15};
		int sum=0;
		double avg = 0 ;
		Arrays.sort(A);
		for(int i=0; i<A.length; i++) {
			sum+=A[i];
			avg = sum/A.length;
		}
		System.out.println("該陣列平均值 ="+ avg);
		System.out.println("該陣列中大於平均值的數為");
		for(int i=0; i<A.length; i++) {
			if(A[i]>avg) {
				System.out.print(A[i]+"\t");
			}
		}		
	}		
}