package hw4;

import java.util.Scanner;

public class Hw4_5CountDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] d1 = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] d2 = {31,29,31,30,31,30,31,31,30,31,30,31};
		count c = new count();
		int daySum = 0;
		System.out.println("請輸入西元年");
		int year = sc.nextInt();
		int month = 0;
			while(month == 0) {
				System.out.println("請輸入月份");
				month = sc.nextInt();
				if(month>12||month<1) {
					month=0;
					System.out.println("請輸入正確的月份");
				}
				else
					break ;
			}
		int day = 0;
			if (month!=2) {
				while(day==0) {
					System.out.println("請輸入日期");
					day = sc.nextInt();
					if((c.m31Test(month)&&day>31)||(c.m30Test(month)&&day>30)||day<=0) {
						day=0;
						System.out.println("輸入錯誤，請重新輸入");
						}
					else break;
				}
			}
			else {
				while(day==0) {
					System.out.println("請輸入日期");
					day = sc.nextInt();
					if((c.leapYearTest(year)&&day>29)||(c.notLeapYearTest(year)&&day>28)||day<=0) {
						day=0;
						System.out.println(month +"月日期應小於29或28天，請重新輸入");
					}
					else break;
				}
			}
			if(c.leapYearTest(daySum)) {
				for (int i=0;i<(month)-1;i++) 
					daySum += d1[i];
			}
			else {
				for (int i=0;i<(month)-1;i++) 
					daySum += d2[i];
			}
			daySum += day;
			System.out.println("西元"+ year +"年" +" 第"+ daySum + "天");
			
		
	}
}
class count{
	int[] m31 = {1,3,5,7,8,10,12};
	int[] m30 = {4,6,9,11};
	boolean leapYearTest(int i) { 
		return((i%4==0 && i%100!=0)||i%400==0);
		}
	boolean notLeapYearTest(int i) {
		return(i%4!=0);
	}
	boolean m31Test(int i) {
		for(int j=0 ; j<m31.length;j++) {
			if(i==m31[j])
				return true;
		}
				return false;
	}
	boolean m30Test(int i) {
		for(int j=0 ; j<m30.length;j++) {
		if(i==m30[j])
			return true;
		}
			return false;
	}
}	
