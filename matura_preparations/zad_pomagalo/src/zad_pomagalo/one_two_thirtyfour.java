package zad_pomagalo;


import java.util.Scanner;

public class one_two_thirtyfour {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	int m = Integer.parseInt(scan.nextLine());
	int n = Integer.parseInt(scan.nextLine());
	
	long sum = 0;
	int count = 0;
	
	for (int i = m; i <= n; i++) {
		if(i % 2 == 0) {
			sum += i;
			count++;
		}
	}
	System.out.println(sum / count);
}
private static boolean isValid(int m,int n) {
	if(m < n && n <= 1_000_000_000) {
		return true;
	}
	return false;
}
}
