package zad_pomagalo;

import java.util.Scanner;

import zad_pomagalo_1_3_14.Distances;

public class zad_2_4_9 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("x1 - ");
	int x1 = Integer.parseInt(scan.nextLine());
	System.out.println("x2 - ");
	int x2 = Integer.parseInt(scan.nextLine());
	System.out.println("y1 - ");
	int y1 = Integer.parseInt(scan.nextLine());
	System.out.println("y2 - ");
	int y2 = Integer.parseInt(scan.nextLine());
	
	System.out.println(Distances.Evklid(x1, x2, y1, y2));
	System.out.println(Distances.Chebish(x1, x2, y1, y2));
	System.out.print(Distances.Manhaten(x1, x2, y1, y2));
	
}
}
