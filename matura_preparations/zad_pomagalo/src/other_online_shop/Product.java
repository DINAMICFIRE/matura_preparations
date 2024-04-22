package other_online_shop;

public class Product {

	private int id;
	private String name;
	private Double price;
	private int quantity;
	public Product(int id, String name, Double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	
}
