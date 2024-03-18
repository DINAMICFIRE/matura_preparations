package zad_pomagalo;

import java.util.Scanner;

public class one_two_thirteen {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int lev = Integer.parseInt(scan.nextLine());
	double course = Double.parseDouble(scan.nextLine());
	
	double euro = Math.floor(lev/course);
	
	double cents =lev - ((lev/course) % euro) /1.95;
	//unspecified zad
	System.out.println(euro);
	System.out.println(cents);
}
}
