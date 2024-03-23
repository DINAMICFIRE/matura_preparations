package zad_pomagalo;

import java.util.Scanner;

public class zad_1_2_21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = Integer.parseInt(scan.nextLine());
		int y = Integer.parseInt(scan.nextLine());

		System.out.println(getQuadrant(x, y));
	}

	private static String getQuadrant(int x,int y) {
		String quadrant = "something went wrong";
		if(x == 0 && y == 0) {
			quadrant = "O";
		}else if (x == 0) {
			quadrant = "H";
		}else if(y == 0){
			quadrant = "V";
		}else if(x > 0 && y > 0){
			quadrant = "I";
		}else if(x > 0 && y < 0){
			quadrant = "IV";
		}else if(x < 0 && y > 0){
			quadrant = "II";
		}else if(x < 0 && y < 0){
			quadrant = "III";
		}
		return quadrant;
	}
}
