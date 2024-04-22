package other_scoring_system;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(scan.nextLine());
			System.out.println(getGrade(num));
		}
	}
	private static String getGrade(int grade) {
		if(grade < 0) {
			return "Invalid";
		}else if(grade < 40) {
			return "Did not pass";
		}else if(grade <= 59) {
			return "Average";
		}else if(grade <= 79) {
			return "Good";
		}else if(grade <= 89) {
			return "Very Good";
		}else {
			return "Exelent";
		}
	}
}
