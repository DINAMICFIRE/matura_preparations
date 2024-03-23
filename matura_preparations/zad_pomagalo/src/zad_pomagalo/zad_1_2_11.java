package zad_pomagalo;

import java.util.Scanner;

public class zad_1_2_11 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a = Integer.parseInt(scan.nextLine());
	int b = Integer.parseInt(scan.nextLine());
	int c = Integer.parseInt(scan.nextLine());
	
	if(a == 0 || b == 0 || c == 0 || a == b || b == c) {
		System.out.println("Failed input!");
		return;
	}
	
	
	System.out.printf("%d%d%d%n",a, b, c);
	System.out.printf("%d%d%d%n",a , c , b);
	System.out.printf("%d%d%d%n",b , a , c);
	System.out.printf("%d%d%d%n",b , c , a);
	System.out.printf("%d%d%d%n",c , a , b);
	System.out.printf("%d%d%d%n",c , b , a);
	
	
}
}
