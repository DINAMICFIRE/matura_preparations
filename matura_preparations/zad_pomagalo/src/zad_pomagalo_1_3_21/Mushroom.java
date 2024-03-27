package zad_pomagalo_1_3_21;

public class Mushroom {
	private int xCoordinate;
	private int yCoordinate;
	private int effect;
	public Mushroom(int xCoordinate, int yCoordinate, int effect) {
		super();
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.effect = effect;
	}
	public int getxCoordinate() {
		return xCoordinate;
	}
	public int getyCoordinate() {
		return yCoordinate;
	}
	public int getEffect() {
		return effect;
	}
	
}
