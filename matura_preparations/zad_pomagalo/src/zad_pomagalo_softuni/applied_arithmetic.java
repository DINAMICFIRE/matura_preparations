package zad_pomagalo_softuni;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class applied_arithmetic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 List<Integer> numbers = 
				 Arrays.stream(scan.nextLine().split("\\s+"))
				 .map(Integer::parseInt)
				 .collect(Collectors.toList());
		 
		 String input = scan.nextLine();
		 
		 while(!input.equals("end")) {
			 if(input.equals("add")) {
				 numbers.stream().map(n -> n + 1);
			 }else if(input.equals("subtract")) {
				 numbers.stream().map(n -> n - 1);
			 }else if(input.equals("multiply")) {
				 numbers.stream().map(n -> n * 2);
			 }else if(input.equals("print")) {
				 numbers.forEach(el -> System.out.print(el + " "));
				 System.out.println();
			 }
			 
			 input = scan.nextLine();
		 }
	}

}
