package other;

import java.util.Scanner;

public class zad25 {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int sum = 0;
		if(n > 100_000 && n < 1) {
			return;
		}
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
