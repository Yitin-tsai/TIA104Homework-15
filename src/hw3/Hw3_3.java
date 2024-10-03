package hw3;

import java.util.Scanner;

//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//的號碼與總數,如圖:
public class Hw3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("請輸入你不喜歡的數字!");
		int i = sc.nextInt();
		for(int j = 1 ; j<50 ; j++ ) {
			if ((j % 10 !=i) && (j / 10 !=i)) {
				System.out.print(j + "\t");
				count++; 
				if( count % 6 == 0){
					System.out.println();
				}
			}
		}
		System.out.println("總共有"+ count +"個數字可以選擇");
	}

}
