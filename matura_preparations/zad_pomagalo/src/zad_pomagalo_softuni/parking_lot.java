package zad_pomagalo_softuni;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class parking_lot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		Set<String> cars = new LinkedHashSet<>();
		
		while(!input.equals("END")) {
			String direction = input.split(", ")[0];
			String plate = input.split(", ")[0];
			
			if(cars.isEmpty() && direction.equals("out")) {
				System.out.println("No cars");
			}else if(direction.equals("in")) {
				cars.add(plate);
			}else {
				cars.remove(plate);
			}
			input = scan.nextLine();
		}
		
		if (cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else{
            for (String car:cars) {
                System.out.println(car);
            }
        }
	}

}
