package hw6;

import java.util.Scanner;

public class Calculator {
	public int powerXY(Integer x ,Integer y) throws CalException {
		Scanner sc = new Scanner(System.in) ;
				
		 if(x==0 && y==0) {
			 throw  new CalException("0的0次方沒有意義!");
		 }else if (y<0) {
			 throw new CalException("次方為負值，結果回傳不為整數!");
		 }else {
			 return (int) Math.pow(x, y);
		 }
	}
}
