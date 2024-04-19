package other_triangle;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
		int a = Integer.parseInt(scan.nextLine());
		int b = Integer.parseInt(scan.nextLine());
		int c = Integer.parseInt(scan.nextLine());
		
		if(lengthCheck(a, b, c)) {
			if(a == b && b == c) {
				System.out.println("ravnobedren");
			}else if(a == b || b == c) {
				System.out.println("ravnobedren");
			}else {
				System.out.println("raznostranen");
			}
		}else {
			System.out.println("Invalid lengths");
		}
		
		
		}catch (Exception e) {
			System.out.println("Something went wrong!");
		}
	}
	private static boolean lengthCheck(int a, int b, int c) {
		if( a+b < c || a+c < b || b+c < a) {
			return false;
		}
		return true;
	}
}
