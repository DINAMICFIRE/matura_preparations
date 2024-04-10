package zad_pomagalo;

import java.util.Scanner;

public class zad_2_3_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j<= n; j++) {
				for (int k = 1; k <= n; k++) {
					System.out.println(i + " " + j + " " + k);
				}
			}
		}
		//TODO: not really finished
	}
}
