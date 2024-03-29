package zad_pomagalo_1_3_24;

public abstract class CelestialBody {
	
	private String name;
	private int mass;
	private int radius;
	public CelestialBody(String name, int mass, int radius) {
		super();
		this.name = name;
		this.mass = mass;
		this.radius = radius;
	}
	public String getName() {
		return name;
	}
	public int getMass() {
		return mass;
	}
	public int getRadius() {
		return radius;
	}
	
	
	
}
