package hwExt;

public class Pencil extends Pen  {
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	public double getPrice() {
		return (super.getPrice())*0.8;
	}
}
