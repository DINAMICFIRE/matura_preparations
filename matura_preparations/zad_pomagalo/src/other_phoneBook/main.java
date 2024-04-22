package other_phoneBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Map<String,String> phoneBook = new HashMap<>();
		String input = scan.nextLine();
		
		while(!input.equals("END")) {
			if(input.startsWith("Add")) {
				String name = input.split("\\s+")[1];
				String phone = input.split("\\s+")[2];
				phoneBook.put(name, phone);
			}else if(input.startsWith("Remove")) {
				String name = input.split("\\s+")[1];
				phoneBook.remove(name);
			}else if(input.startsWith("Search")) {
				String name = input.split("\\s+")[1];
				String phone = phoneBook.containsKey(name) ? phoneBook.get(name) : "Invalid name";
				System.out.println(phone);
 			}else if(input.startsWith("Update")) {
 				String name = input.split("\\s+")[1];
				String phone = input.split("\\s+")[2];
				phoneBook.put(name, phone);
			}else if(input.startsWith("Print")) {
				for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
					String name = entry.getKey();
					String phone = entry.getValue();
					System.out.printf("%s has a number -> %s%n",name,phone);
				}
			}
			input = scan.nextLine();
		}

	}

}
