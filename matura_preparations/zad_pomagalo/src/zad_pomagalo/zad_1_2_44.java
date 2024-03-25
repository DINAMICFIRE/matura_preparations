package zad_pomagalo;

import java.util.Scanner;

public class zad_1_2_44 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		
		int[] arr = new int[number + 1];
		
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			if(arr[i] == number){
				System.out.println(arr[i - 1]);
				System.out.println(arr[i - 2]);
				System.out.println(i);
				return;
			}
			
		}
		System.out.println("Not fibb");
	}
}
