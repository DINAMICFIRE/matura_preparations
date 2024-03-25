package zad_pomagalo;

import java.time.LocalDate;
import java.util.Scanner;

public class zad_1_2_41 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int day = Integer.parseInt(scan.nextLine());
		int month = Integer.parseInt(scan.nextLine());
		int year = Integer.parseInt(scan.nextLine());
		
		int daysToAdd = Integer.parseInt(scan.nextLine());
		
		LocalDate date = LocalDate.of(year, month, day);
		
		LocalDate nextDate = date.plusDays(daysToAdd);
		
		String dateString = nextDate.toString();
		
		
		System.out.print(dateString.split("-")[2] + ":");
		System.out.print(dateString.split("-")[1] + ":");
		System.out.print(dateString.split("-")[0]);
	}

}
