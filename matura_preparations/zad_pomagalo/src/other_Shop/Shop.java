package other_Shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
	private String name;
	private List<Product> products;
	private List<Customer> customers;

	public Shop(String name) {
		super();
		this.name = name;
		this.products = new ArrayList<>();
		this.customers = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	@Override
	public String toString() {
		String outPut = String.format("Магазин: %s%n", getName());
		outPut += "Продукти: ";
		for (Product product : products) {
			outPut += String.format("%s%n", product);
		}
		outPut += "Клиенти: ";
		for (Customer customer : customers) {
			outPut += String.format("%s%n", customer);
		}
		return outPut;
	}

}
