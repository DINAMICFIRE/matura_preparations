package other_Cafe;

public class Coffee extends Drink{
	private int strength;
	
	public Coffee(String name, double price, Size size, int strength) {
		super(name, price, size);
		this.strength = strength;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	@Override
	public String toString() {
		return String.format("Coffee: %s, Size: %s, Strength: %d, Price: %.2f",
				super.getName(),
				super.getSize().toString(),
				this.getStrength(),
				super.getPrice());
	}

	
	
	

}
