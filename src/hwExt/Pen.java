package hwExt;

public abstract class Pen {
	private String brand;
	private double price; 
	
	public void setPrice(double price) {
		if(price>0) {
			this.price = price;
		}
		else {
			System.out.println("請輸入正確的價格");
		}
	}
	public double getPrice() {
		return price;
	}
	public void setbrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public Pen(String brand,double price) {
		this.brand = brand;
		this.price = price;		
	}
	public Pen() {
		this.brand = "UNI";
		this.price = 10;
	}

	public abstract void write();
	

}
