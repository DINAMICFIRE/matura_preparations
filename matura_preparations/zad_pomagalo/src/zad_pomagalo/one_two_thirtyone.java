package zad_pomagalo;

import java.util.Iterator;
import java.util.Scanner;

public class one_two_thirtyone {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	int tempD = Integer.MAX_VALUE;
	int tempM = Integer.MAX_VALUE;
	for (int i = 0; i < n; i++) {
		int d = Integer.parseInt(scan.nextLine());
		int m = Integer.parseInt(scan.nextLine());
	
		if(d < tempD) {
			tempD = d;
			tempM = m;
		}else if(d == tempD && m < tempM) {
			tempD = d;
			tempM = m;
		}
		
	}
	System.out.println(tempD + " " + tempM);
}
}
