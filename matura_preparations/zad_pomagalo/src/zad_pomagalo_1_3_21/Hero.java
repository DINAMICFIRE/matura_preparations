package zad_pomagalo_1_3_21;

import zad_pomagalo_1_3_14.Distances;

public class Hero {
	private int xCoordinate;
	private int yCoordinate;
	private int energy;
	private int hp;
	
	public Hero(int xCoordinate, int yCoordinate, int energy, int hp) {	
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.energy = energy;
		this.hp = hp;
	}
	
	public void eat(Mushroom mushroom) {

		int distenceManh = Distances.Manhaten(xCoordinate, mushroom.getxCoordinate(), yCoordinate, mushroom.getyCoordinate());
		if(distenceManh > energy){
			throw new UnsupportedOperationException("Player doesn't have enough energy!");
		}else {

		this.addEffect(mushroom.getEffect());
		}
		
	}
	private void addEffect (int effect) {
		hp += effect;
	}

	public int getxCoordinate() {
		return xCoordinate;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public int getEnergy() {
		return energy;
	}

	public int getHp() {
		return hp;
	}

	
}
