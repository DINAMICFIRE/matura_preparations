package other_Cafe;

public class Drink {
	private String name;
	private double price;
	private Size size;
	public Drink(String name, double price, Size size) {
		super();
		this.name = name;
		this.price = price;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public Size getSize() {
		return size;
	}
	
	
}
