package zad_pomagalo_softuni;

import java.util.Arrays;
import java.util.Scanner;

public class predicat_zad_softuni {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		Arrays
		.stream(scan.nextLine().split("\\s+"))
		.filter(el -> el.length() == n)
		.forEach(el -> System.out.println(el));
	}

}
