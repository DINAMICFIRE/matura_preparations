package other_online_shop;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private int id;
	private String name;
	private String address;
	private List<Product> products;
	
	public Customer(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.products = new ArrayList<>();;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public List<Product> getProducts() {
		return products;
	}
	
	
}
