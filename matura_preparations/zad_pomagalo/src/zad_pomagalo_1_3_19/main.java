package zad_pomagalo_1_3_19;

import zad_pomagalo_1_3_18.Starship;

public class main {

	public static void main(String[] args) {
		Starship player = new Starship(10, 101, 1, 1, 100);
		Starship enemy = new Starship(10, 101, 1, 1, 100);

		player.attack(enemy);
		System.out.println("Hp of the enemy must be 99 and it is: " + enemy.getHp());
	}

}
