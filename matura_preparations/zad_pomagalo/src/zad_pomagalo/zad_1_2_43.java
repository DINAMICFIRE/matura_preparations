package zad_pomagalo;

import java.util.Scanner;

public class zad_1_2_43 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		
		for (int i = 1; i <= N; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if( i % j == 0) {
					sum += j;
				}
			
			}
			if(sum == i) {
				System.out.println(i);
			}
		}
		
		

	}

}
