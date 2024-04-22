package other_special_num;

import java.util.Scanner;

public class main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	try {
	int N = Integer.parseInt(scan.nextLine());
	if(N <= 0) {
		System.out.println("Something went wrong!");
	}else {
		boolean isSpecial = isSpecialNum(N);
		if(isSpecial) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
	
	}catch (Exception e) {
		System.out.println("Something went wrong!");
	}
}
private static boolean isSpecialNum(int num) {
	String[] arr = (num + "").split("");
	boolean isSpecial = true;
	for (String n : arr) {
		if(num % Integer.parseInt(n) != 0 ) {
			isSpecial = false;
		}
	}
	return isSpecial;
}
}
