package zad_pomagalo;

import java.util.Random;

public class zad_2_5_6 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int randomLength = rnd.nextInt(8,17);
		String[] password = new String[randomLength];
		boolean upper = false;
		boolean lower = false;
		boolean number = false;
		boolean special = false;
		
		for (int i = 0; i < password.length; i++) {
			int randomCommand = rnd.nextInt(1,5);
			if(randomCommand == 1) {
				password[i] = genUpperCase(rnd);
				upper = true;
			}else if(randomCommand == 2) {
				password[i] = genLowerCase(rnd);
				lower = true;
			}else if(randomCommand == 3) {
				password[i] = genNumber(rnd);
				number = true;
			}else if(randomCommand == 4) {
				password[i] = genSpecialChar(rnd);
				special = true;
			}
			if( i == password.length - 1) {
				if(upper && lower && number && special) {
					for (String charecter : password) {
						System.out.print(charecter);
					}
				}else {
					i = 0;
					upper = false;
					lower = false;
					number = false;
					special = false;
				}
			}
		}
		
		
		
		
	}
	private static String genUpperCase(Random rnd) {
		return ((char) rnd.nextInt(65, 91)) + ""; 
	}
	private static String genLowerCase(Random rnd) {
		return ((char) rnd.nextInt(97, 123)) + ""; 
	}
	private static String genNumber(Random rnd) {
		return String.valueOf(rnd.nextInt(0,10));
		}
	private static String genSpecialChar(Random rnd) {
		String[] arr = {"#","$","%","^","&","*"};
		int randomIndex = rnd.nextInt(0,arr.length);		
		return arr[randomIndex];
		
	}
}
