package other_film_menagement_system;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of the film management");
		String name = scan.nextLine();
		FilmLibrary filmLibrary = new FilmLibrary(name);
		
		String input = "";
		while(!input.equals("q")) {
			System.out.println("Enter command");
			input = scan.nextLine();
			
			if(input.equals("a")) {
				System.out.println("Enter film info");
				String filmTitle = scan.nextLine();
				String filmDirector = scan.nextLine();
				int year = Integer.parseInt(scan.nextLine());
				filmLibrary.addFilm(new Movie(filmTitle,filmDirector,year));
			}else if(input.equals("v")) {
				filmLibrary.printInfo();
			}
			
		}
	}
}
