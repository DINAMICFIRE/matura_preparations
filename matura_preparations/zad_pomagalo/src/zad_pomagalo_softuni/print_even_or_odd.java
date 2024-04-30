package zad_pomagalo_softuni;

import java.util.Arrays;
import java.util.Scanner;

public class print_even_or_odd {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String[] bonds = scan.nextLine().split(" ");
	String type = scan.nextLine();
	
	for (int i = Integer.parseInt(bonds[0]); i <= Integer.parseInt(bonds[1]); i++) {
		if(type.equals("odd") && i % 2 != 0) {
			System.out.println(i);
		}else if(type.equals("even") && i % 2 == 0) {
			System.out.println(i);
		}
	}
}
}
