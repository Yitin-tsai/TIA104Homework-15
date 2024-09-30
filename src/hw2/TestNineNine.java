package hw2;

public class TestNineNine {

	public static void main(String[] args) {
		
//		使用for+while迴圈完成99乘法表
		int i=1;
		for (i = 1; i <= 9; i++) {
			int j=1;
			while(j<10) { 
			System.out.print(i + "*" + j + "=" + i * j + "\t");
			j++;}
		System.out.println();
		}
		
//		使用for+do while迴圈完成99乘法表
//		int i=1;
//		for (i = 1; i <= 9; i++) {
//			int j=1;
//			do{ 
//			System.out.print(i + "*" + j + "=" + i * j + "\t");
//			j++;
//			}while (j<=9);
//		System.out.println();
//		}
		
//		使用while+do while迴圈完成99乘法表		
//		int i=0;
//		while(i<=9) {
//			int j =1;
//			do {
//			System.out.print(i + "*" + j + "=" + i * j + "\t");
//			j++;
//			}while (j<=9); 
//		i++;
//		System.out.println();	
//		}
	}
}	
