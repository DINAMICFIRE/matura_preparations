package zad_pomagalo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class zad_2_5_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<String> words = Arrays.stream(scan.nextLine().split("\\s+")).toList();
		List<String> forbiden = Arrays.stream(scan.nextLine().split(", "))
				.map(el -> el.toUpperCase())
				.toList();
		
		for (int i = 0 ; i < words.size(); i++) {
			String word = words.get(i);
			boolean found = false;
			for (String forbidenWord : forbiden) {
				if(i == words.size() - 1) {
					word = word.substring(0,word.length() - 1);
				}
				String tempWord = word.toUpperCase();
				if(tempWord.equals(forbidenWord)) {
					found = true;
				}
			}
			if(!found) {
				System.out.print(words.get(i) + " ");
			}else {
				System.out.print("*** ");
			}
			
		}
		String finalChar = words.get(words.size() - 1);
		if(finalChar.contains("!")) {
			System.out.print("!");
		}else if(finalChar.contains(".")) {
			System.out.print(".");
		}else if(finalChar.contains("?")) {
			System.out.print("?");
		}else if(finalChar.contains(";")) {
			System.out.print(";");
		}
	}
}
