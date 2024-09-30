package hw1;

public class Hw104 {
	
	public static void main (String[] args){
		
		double pi = 3.1415;
		double circleArea = pi*Math.pow(5,2);
		double circlePerimeter = pi*5*2;
		System.out.println("面積 = " + circleArea  );
		System.out.println("周長 = " + circlePerimeter  );
		 
		double circleArea2 = Math.PI*Math.pow(5,2);
		double circlePerimeter2 = Math.PI*5*2;
		System.out.println("面積 = " + circleArea2  );
		System.out.println("周長 = " + circlePerimeter2  );
	}
}
