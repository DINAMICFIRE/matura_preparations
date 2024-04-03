package zad_pomagalo;

import java.util.Scanner;

public class zad_2_4_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int begining = 0;
		int middle = 50;
		int end = 100;
		
		int tries = Integer.parseInt(scan.nextLine());
		
		for (int i = 0; i < tries; i++) {
			System.out.println(middle);
			String input = scan.nextLine();
			if(input.equals("Ok")) {
				System.out.println("I won!");
				return;
			}else if(input.equals("up")) {
				begining = middle;
				middle = (middle + end) /2;
			}else if(input.equals("down")) {
				end = middle;
				middle = (begining + middle) / 2;
			}
		}
		System.out.println("You won!");
	}

}
