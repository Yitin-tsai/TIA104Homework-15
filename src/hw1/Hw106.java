package hw1;

public class Hw106 {
	public static void main (String[] args){
		System.out.println(5+5);
		//出現10 因為是兩個int相加
		System.out.println(5+'5');
		//出現58因為'5'為字元資料，按照UNICODE編碼表將其16進位換算為10進位數字後和5相加和為58
		System.out.println(5+"5");
		/*出現55因為"5"是字串資料，此時5+"5"視為字串串接顧出現55。
		 * 同理若要求JAVA印出1+"2"會出現12 */
				
	}

}
