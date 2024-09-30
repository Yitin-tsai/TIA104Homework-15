package hw2;

//計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)

public class Hw202 {
	public static void main (String[] args){
		int product = 1 ;
		int i ;
		for (i=1; i<=10; i++) {
			product = product*i;
		}
		
		System.out.println(product);
		
			
	}

}
