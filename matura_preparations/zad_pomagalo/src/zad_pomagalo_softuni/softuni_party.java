package zad_pomagalo_softuni;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class softuni_party {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<String> VIPList = new LinkedHashSet<>();
		Set<String> guestList = new LinkedHashSet<>();

		String input = scan.nextLine();

		while (!input.equals("PARTY")) {
			if(isVIP(input)) {
				VIPList.add(input);
			}else {
				guestList.add(input);
			}
			input = scan.nextLine();
		}
		
		while(!input.equals("END")) {
			guestList.remove(input);
			VIPList.remove(input);
			input = scan.nextLine();
		}

		for (String guest : VIPList) {
			System.out.println(guest);
			
		}
		for (String guest : guestList) {
			System.out.println(guest);
			
		}
	}

	private static boolean isVIP(String guestId) {
		char firstChar = guestId.charAt(0);
		if(Character.isDigit(firstChar)) {
			return true;
		}else {
			return false;
		}
	}
}
