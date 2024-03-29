package zad_pomagalo_1_3_24;

public class Star extends CelestialBody{
	

	private String spectralClass;
	
	
	


	public Star(String name, int mass, int radius, String spectralClass) {
		super(name, mass, radius);
		this.spectralClass = spectralClass;
	}


	public String getSpectralClass() {
		return spectralClass;
	}


	@Override
	public String toString() {
		return String.format("The star %s(%s) with mass %d and radius %d is pretty cool!"
				,getName()
				,getSpectralClass()
				,getMass()
				,getRadius());
	}
	
}
