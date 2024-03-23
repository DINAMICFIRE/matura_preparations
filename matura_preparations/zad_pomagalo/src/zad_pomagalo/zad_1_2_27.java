package zad_pomagalo;

import java.util.Scanner;

public class zad_1_2_27 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int grade1 = Integer.parseInt(scan.nextLine());
	int grade2 = Integer.parseInt(scan.nextLine());
	int grade3 = Integer.parseInt(scan.nextLine());
	int grade4 = Integer.parseInt(scan.nextLine());
	
	if(grade1 == 2 || grade2 == 2 || grade3 == 2 || grade4 == 2) {
		System.out.println("No");
	}else {
		if (grade1 == 6) {
			System.out.print("* ");
		}
		if(grade2 == 6) {
			System.out.print("* ");
		}
        if(grade3 == 6) {
			System.out.print("* ");
		}
        if(grade4 == 6) {
			System.out.print("* ");
		}
	}
}
}
