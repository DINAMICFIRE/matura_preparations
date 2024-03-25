package zad_pomagalo;

import java.util.Scanner;

public class zad_1_2_40 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	 
	String[] arr = new String[(n*2) - 1];
	int middle = n - 1;

	
	
	for (int i = 0; i < n; i++) {
		arr[middle + i] = "*";
		arr[middle - i] = "*";
		printRow(arr);
	}
	
	
}
private static void printRow(String[] arr) {
	for (int i = 0; i < arr.length; i++) {
		String currentEl = arr[i];
		if(currentEl == null) {
			System.out.print(" ");
		}else {
			System.out.print(currentEl);
		}
	}
	System.out.println();
}
}
