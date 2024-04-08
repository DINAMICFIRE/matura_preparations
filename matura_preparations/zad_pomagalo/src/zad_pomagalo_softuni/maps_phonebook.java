package zad_pomagalo_softuni;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maps_phonebook {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();
		Map<String, String> phoneBook = new HashMap<>();

		while (!input.equals("search")) {
			String name = input.split("-")[0];
			String phone = input.split("-")[1];

			phoneBook.put(name, phone);

			input = scan.nextLine();
		}
		input = scan.nextLine();
		while (!input.equals("stop")) {
			if (phoneBook.containsKey(input)) {
				System.out.println(input + " -> " + phoneBook.get(input));
			} else {
				System.out.println("Contact " + input + " does not exist.");
			}

			input = scan.nextLine();
		}

	}

}
