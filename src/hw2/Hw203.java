package hw2;

//計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)

public class Hw203 {
	
	public static void main (String[] args){
		int product = 1;
		int i=1 ;
		while(i<=10) {
			product = i * product;
			i++ ; 
		}
		System.out.println(product);
	}

}
