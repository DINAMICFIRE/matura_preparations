package zad_pomagalo_1_3_18;

public class Starship {

	private double speed;
	private int weponPower;
	private int shield;
	private int xCoordinate;
	private int yCoordinate;
	private int hp;
	
	public Starship(double speed, int weponPower, int xCoordinate, int yCoordinate, int hp) {
		super();
		this.speed = speed;
		this.weponPower = weponPower;
		this.shield = 100;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.hp = hp;
	}
	
	public void attack(Starship enemy) {

		int finalShield = enemy.getShield() - this.getWeponPower();
		if(finalShield < 0) {
			int difference = Math.abs(finalShield);
			finalShield = 0;
			int finalHp = enemy.getHp() - difference;
			enemy.setHp(finalHp);
		}
	    enemy.setShield(finalShield);
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getWeponPower() {
		return weponPower;
	}

	public void setWeponPower(int weponPower) {
		this.weponPower = weponPower;
	}

	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	public int getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
}
