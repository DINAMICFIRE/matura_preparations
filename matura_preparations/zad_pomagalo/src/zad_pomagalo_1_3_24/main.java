package zad_pomagalo_1_3_24;

public class main {

	public static void main(String[] args) {
		Star sun = new Star("Sun", 999999, 999999, "G2V");
		Planet earth = new Planet("Earth", 33333,333333,sun);
		Moon moon = new Moon("Moon", 1111,1111, earth);
		System.out.println(sun);
		
		System.out.println(earth);
		
		System.out.println(moon);
	}

}
