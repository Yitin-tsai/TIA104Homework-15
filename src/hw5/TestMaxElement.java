package hw5;

public class TestMaxElement {
	public static void main(String[] args) {
		int[][] intArray = {
				{1,6,3},
				{9,5,2}
		};
		double[][] doubleArray= {
				{1.2, 3.5, 2.2},
				{7.4, 2.1, 8.2}
		};
	MaxElement test = new MaxElement();
	System.out.println(test.maxElement(intArray));
	System.out.println(test.maxElement(doubleArray));
	}

}
