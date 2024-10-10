package hw5;

public class MyrectangleMain {
	public static void main(String[] args) {
		MyRectangle r1 = new MyRectangle(10, 20);
		System.out.println("r1面積為");
		System.out.println(r1.getArea());
		MyRectangle r2 = new MyRectangle();
		System.out.println("r2面積為");
		System.out.println(r2.getArea());
	}

}
