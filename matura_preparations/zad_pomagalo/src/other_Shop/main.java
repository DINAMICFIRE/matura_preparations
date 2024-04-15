package other_Shop;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Shop shop = new Shop(scan.nextLine());
		System.out.println("enter command p/c/i/stop");
		String input = scan.nextLine();
		while(!input.equals("stop")) {
			if(input.equals("p")) {
				System.out.println("Enter product info:");
				String[] info = scan.nextLine().split("\\s+");
				String name = info[0];
                double price = Double.parseDouble(info[1]);
                int quantity = Integer.parseInt(info[2]);
                
                shop.addProduct(new Product(name, price, quantity));
			} else if(input.equals("c")) {
				System.out.println("Enter customer info:");
				String[] info = scan.nextLine().split("\\s+");
				String name = scan.nextLine();
				int age = Integer.parseInt(scan.nextLine());
				shop.addCustomer(new Customer(name,age));
			} else if(input.equals("i")) {
				System.out.println(shop);
			} 
		}
	}
}
