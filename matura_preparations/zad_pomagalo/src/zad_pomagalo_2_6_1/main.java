package zad_pomagalo_2_6_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new File("src/zad_pomagalo_2_6_1/names"));
			int n = Integer.parseInt(new Scanner(System.in).nextLine());
			Map<String,String> names = new HashMap<>();
			
			
			while(scan.hasNext()) {
				String[] input = scan.nextLine().split("\\s+");
				if(!names.containsKey(input[0]) && n > 0) {
					names.put(input[0], input[1]);
					n--;
				}
				
			}
			if(n > 0) {
				System.out.println("invalid N");
			}else {
				for (Map.Entry<String, String> entry : names.entrySet()) {
					String firstName = entry.getKey();
					String secondName = entry.getValue();
					System.out.println(firstName + " " +secondName);
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

	}

}
