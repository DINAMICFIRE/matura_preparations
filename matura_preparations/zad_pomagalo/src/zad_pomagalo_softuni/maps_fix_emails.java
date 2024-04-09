package zad_pomagalo_softuni;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maps_fix_emails {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Map<String, String> emails = new HashMap<>();
		
		String input = scan.nextLine();
		
		while(!input.equals("stop")) {
			String email = scan.nextLine();
			
			if(validEmail(email)) {
				emails.put(email, input);
			}
			input = scan.nextLine();
		}
		
		for (Map.Entry<String, String> entry : emails.entrySet()) {
			String name = entry.getKey();
			String email = entry.getValue();
			
			System.out.println(name + " -> " + email);
		}
	}
	public static boolean validEmail(String email) {
		email.toLowerCase();
		if(email.endsWith("uk") || email.endsWith("com") || email.endsWith("us")) {
		return false;	
		}
		return true;
	}

}
