package hw5;

public class MyRectangle {
	private double width;
	private double depth;
	
	public void setWidth(double width) {
		if(width>0)
			this.width = width;
		else
			System.out.println("請輸入正確數字");		
	}
	public void setDepth(double depth) {
		if(depth>0)
			this.depth = depth;
		else
			System.out.println("請輸入正確數字");		
	}
	public double getArea() {
		return width*depth;
	}
	
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
	public MyRectangle() {
		this.width = 10;
		this.depth = 20;
	}

}
