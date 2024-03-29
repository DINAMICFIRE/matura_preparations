package zad_pomagalo_1_3_24;

public class Moon extends CelestialBody{

	private Planet planet;

	

	public Moon(String name, int mass, int radius, Planet planet) {
		super(name, mass, radius);
		this.planet = planet;
	}



	public Planet getPlanet() {
		return planet;
	}
	@Override
	public String toString() {
		return String.format("The moon %s with mass %d and radius %d goes arround %s!"
				,getName()
				,getMass()
				,getRadius()
				,getPlanet().getName());
	}
	
}
