package other_Shop;

public class Product {
	private String name;
	private double price;
	private int quantity;
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return String.format("Продукт: %s, Цена: %.2f лв., Налично количество: %d бр.",getName(), getPrice(),getQuantity());
	}
	
	
}
