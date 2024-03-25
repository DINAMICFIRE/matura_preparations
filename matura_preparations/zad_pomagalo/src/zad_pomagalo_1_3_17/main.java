package zad_pomagalo_1_3_17;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import zad_pomagalo_1_3_16.Book;

public class main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Map<Double,Book> library = new TreeMap<>();
		for (int i = 0; i < 3; i++) {
			String title = scan.nextLine();
			String author = scan.nextLine();
			double price = Double.parseDouble(scan.nextLine());
			
			library.put(price, new Book(title,author,price,""));
			//TODO finish the zad
			
		}
		
		
		
		
		
	}
}
