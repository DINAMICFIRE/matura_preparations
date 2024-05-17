package zad_pomagalo;

import java.util.Scanner;

public class one_two_twelve {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int hours = Integer.parseInt(scan.nextLine());
	int minutes = Integer.parseInt(scan.nextLine());
	hours +=  Integer.parseInt(scan.nextLine());
	minutes += Integer.parseInt(scan.nextLine());
	
	hours *= 60;
	minutes += hours;
	
	int finalHours = minutes/60 % 24;
	int finalMinutes = minutes % 60;
	System.out.printf("%02d:%02d",finalHours,finalMinutes);
}
}
