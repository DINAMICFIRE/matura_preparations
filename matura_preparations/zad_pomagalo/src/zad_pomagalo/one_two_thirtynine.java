package zad_pomagalo;

import java.util.Scanner;

public class one_two_thirtynine {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int n = Integer.parseInt(scan.nextLine());
	
	for (int i = 1; i <= n; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
