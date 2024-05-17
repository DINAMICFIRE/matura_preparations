package zad_pomagalo;

import java.util.Scanner;

public class one_two_fourteen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double D = Double.parseDouble(scan.nextLine());
		double H = Double.parseDouble(scan.nextLine());
		
		double L = Double.parseDouble(scan.nextLine());
		double W = Double.parseDouble(scan.nextLine()); 
		
		int countRolls = 1;
		
		
		double currentHeight =L;
		
		double iterrations = Math.ceil(D/W);
		for (int i = 0; i < iterrations; i++) {
			if(currentHeight - H < 0) {
				countRolls++;
			    currentHeight = L;
			}
			currentHeight -= H;
			
			
			
		}
		System.out.println(countRolls);
		
		
		
	}
}
