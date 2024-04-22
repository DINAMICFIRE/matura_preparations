package other_online_shop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private int id;
	private Date orderDate;
	private Customer client;
	private List<Product> products;
	public Order(int id, Customer client) {
		super();
		this.id = id;
		this.orderDate = new Date();
		this.client = client;
		this.products = new ArrayList<>();
	}
	public int getId() {
		return id;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public Customer getClient() {
		return client;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void addProduct(Product product) {
		products.add(product);
	}
	public void removeProductById(int id) {
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i).getId() == id) {
				products.remove(i);
				break;
			}
		}
	}
	public String getProductInfoById(int id) {
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i).getId() == id) {
				return products.get(i).toString();
			}
		}
		return "No such Product!";
	}
	public void makeOrder() {
		
	}
}
