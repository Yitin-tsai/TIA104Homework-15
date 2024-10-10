package hw5;

public class RandAvg {
	public void randAvg() {
		int[] x = new int [10];
		int sum =0;
		for(int i = 0 ; i<x.length ; i++) {
			x[i] = (int)(Math.random()*100)+1;
			System.out.print(x[i] + ",");
			sum+=x[i];
		}
		System.out.println("平均數為" + (sum/10));
	}

}
