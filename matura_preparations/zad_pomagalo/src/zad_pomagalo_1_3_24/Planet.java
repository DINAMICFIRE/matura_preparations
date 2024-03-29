package zad_pomagalo_1_3_24;

public class Planet extends CelestialBody{
	
	private Star star;
	
	

	public Planet(String name, int mass, int radius, Star star) {
		super(name, mass, radius);
		this.star = star;
	}

	public Star getStar() {
		return star;
	}

	@Override
	public String toString() {
		return String.format("The planet %s with mass %d and radius %d goes arround %s!"
				,getName()
				,getMass()
				,getRadius()
				,getStar().getName());
	}
	
}
