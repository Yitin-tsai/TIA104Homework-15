package hw2;

//印出
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF

public class Hw207 {
	
	static public void main(String[] args) {
		int i1, i2, i3;
		for( i1 =0; i1<=5 ; i1++) {
			for(i2=0; i2<=i1 ; i2++) {
				i3= 65 +i1;
				char i4 = (char)i3;
				System.out.print(i4);
			}
			System.out.println();		
		}
	}
}
