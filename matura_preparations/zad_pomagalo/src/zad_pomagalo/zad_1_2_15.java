package zad_pomagalo;

import java.util.Scanner;

public class zad_1_2_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = Integer.parseInt(scan.nextLine());
		int b = Integer.parseInt(scan.nextLine());
		
		int c = Integer.parseInt(scan.nextLine());
		int d = Integer.parseInt(scan.nextLine());
		
		double result = Math.ceil((a*b) / (c*d));
		System.out.println(result);
	}

}
