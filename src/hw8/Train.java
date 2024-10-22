package hw8;

import java.util.Objects;

public class Train implements Comparable<Train> {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public int getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public String getStart() {
		return start;
	}

	public String getDest() {
		return dest;
	}

	public double getPrice() {
		return price;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	@Override
	public int compareTo(Train o) {
		// TODO Auto-generated method stub
		if (this.getNumber() > o.getNumber()) {
			return -1;
		} else if (this.number == o.number && this.type.equals(o.type) && this.start.equals(o.start)
				&& this.dest.equals(o.dest) && this.price == o.price) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "班次 = " + number + " ,車種 = " + type + ",出發地 = " + start + ",目的地 = " + dest +",票價 =" +price;
	}
}
