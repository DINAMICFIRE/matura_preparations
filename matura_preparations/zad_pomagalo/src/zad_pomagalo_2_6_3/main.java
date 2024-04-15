package zad_pomagalo_2_6_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String textFileName = scan.nextLine();
		 try {
			Scanner inputFile = new Scanner(new File("src/zad_pomagalo_2_6_3/" + textFileName));
			int counter = 0;
			String dayOfWeek = getDayOfWeek(textFileName);
			while(inputFile.hasNext()) {
				String input = inputFile.nextLine();
				if(!input.contains("-")) {
					counter++;
				}
			}
			System.out.println(dayOfWeek + " -> " + counter);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("invalid file");
		} 
	}
	private static String getDayOfWeek(String num) {
		switch (num) {
		case "1":
			return "ponedelnik";
		case "2":
			return "vtornik";
		case "3":
			return "srqda";
		case "4":
			return "chetvurtuk";
		case "5":
			return "petuk";
			default:
				return "invalid";
		}
	}

}
