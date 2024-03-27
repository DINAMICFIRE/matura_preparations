package zad_pomagalo;

import java.util.List;
import java.util.Scanner;

public class zad_2_4_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char symbol = scan.nextLine().charAt(0);
		List<String> months = List.of(
			    "януари",
			    "февруари",
			    "март",
			    "април",
			    "май",
			    "юни",
			    "юли",
			    "август",
			    "септември",
			    "октомври",
			    "ноември",
			    "декември"
			);
		
		while(symbol >= 'а' && symbol <= 'я' || symbol >= 'А' && symbol <= 'Я') {
			
			int counter = 0;
			
			for (String month : months) {
				if(month.contains((symbol + "").toLowerCase())) {
					counter++;
				}
			}
			
			
			
			System.out.println(counter);
			symbol = scan.nextLine().charAt(0);
		}
		
		
	}
}
