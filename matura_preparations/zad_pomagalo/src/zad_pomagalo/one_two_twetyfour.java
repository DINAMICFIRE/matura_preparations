package zad_pomagalo;

import java.util.Scanner;

public class one_two_twetyfour {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = Integer.parseInt(scan.nextLine());
		int min = Integer.parseInt(scan.nextLine());
		int sec = Integer.parseInt(scan.nextLine());
		
		if(isValid(hour, min, sec)) {
			int allSec =(hour * 60 * 60) +(min * 60) + sec ;
			int secLeft = allSec % 108;
			printValue(secLeft);
		}else {
			System.out.println("Invalid input!");
		}

	}
	private static boolean isValid(int hour,int min,int sec) {
		if(hour < 0 || min < 0 || sec < 0 || min > 59 || sec > 59 || hour > 23) {
			return false;		
		}
		return true;
	}
	private static void printValue(int sec) {
		if(sec < 61) {
			System.out.println("premini");
		}else if (sec < 65) {
		System.out.println("izchakai");
		}else if (sec < 104) {
			System.out.println("spri");
		}else if (sec < 109) {
			System.out.println("izchakai");
		}
	}
}
