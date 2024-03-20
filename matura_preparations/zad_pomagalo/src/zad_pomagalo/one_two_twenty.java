package zad_pomagalo;

import java.util.Scanner;

public class one_two_twenty {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int hour = Integer.parseInt(scan.nextLine());
	int min = Integer.parseInt(scan.nextLine());
	int sec = Integer.parseInt(scan.nextLine());

	if(!validInput(hour, min, sec)) {
		System.out.println("Invalid input");
	}else {
		sec++;
		if(sec > 59) {
			sec = 0;
			min++;
		}
		if(min > 59) {
			min = 0;
			hour++;
		}
		if(hour > 23) {
			hour = 0;
		}
		printTime(hour, min, sec);
		
	}
	
}

private static boolean validInput(int hour,int min,int sec) {
	if(hour < 0 || min < 0 || sec < 0 || min > 59 || sec > 59 || hour > 23) {
		return false;		
	}
	return true;
}
private static void printTime(int hour,int min,int sec) {
	System.out.printf("%02d:%02d:%02d",hour,min,sec);
}
}
