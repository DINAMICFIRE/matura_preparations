package zad_pomagalo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zad_1_2_42 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int perimeter = Integer.parseInt(scan.nextLine());
	
	int ravnostranni = 0;
	int raznostranni = 0;
	int ravnobedren = 0;
	
	List<String> list = new ArrayList<>();
	
	
	
	for (int i = 1; i < perimeter - 1; i++) {
		for (int j = 1; j < perimeter - 1; j++) {
			for (int k = 1; k < perimeter - 1; k++) {
				if((i + j + k) == perimeter) {
				if(!occured(list,i,j,k)) {
				if(i == j && j == k) {
					ravnostranni++;
				}else if(i == j || j == k || k == i){
					ravnobedren++;
				}else{
					raznostranni++;
				}
				list.add(i+""+j+""+k);
				}
			}
		}
		
	}
	}
	System.out.println("ravnostranni: " + ravnostranni);
	System.out.println("ravnobedren: " + ravnobedren);
	System.out.println("raznostranni: " + raznostranni);
	
}
	private static boolean occured(List<String> list, int i , int j , int k) {
		for (String numbers : list) {
			if(numbers.contains(String.valueOf(i)) 
					&& numbers.contains(String.valueOf(j))
							&& numbers .contains(String.valueOf(i))
							) {
				return true;
			}
		}
		return false;
		
		
	}
}
