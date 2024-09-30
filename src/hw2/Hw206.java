package hw2;
//印出以下數字
//1 2 3 4 5 6 7 8 9 10
//1 2 3 4 5 6 7 8 9
//1 2 3 4 5 6 7 8
//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
public class Hw206 {
	
	static public void main(String[] args) {
		for(int i=10 ; i>0 ; i--) {
			int j=1;
			while(j <= i) {
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
		}
	}
}
