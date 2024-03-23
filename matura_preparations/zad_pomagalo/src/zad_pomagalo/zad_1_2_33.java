package zad_pomagalo;

import java.util.Scanner;

public class zad_1_2_33 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int n = Integer.parseInt(scan.nextLine());
	int[] arr = new int[n];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = i + 1;
	}
	
	int d = Integer.parseInt(scan.nextLine());
	int k = Integer.parseInt(scan.nextLine());
	
	int sum = 1;
	int tempIndex = 0;
	for (int i = 0; i < k; i++) {
		for (int j = 0; j < d; j++) {
			if(tempIndex + 1 >= arr.length) {
				tempIndex = 0;
			}else {
				tempIndex++;
			}	
		}
		
		sum += arr[tempIndex];
	}
	System.out.println(sum);

	
	
}

}
