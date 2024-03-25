package zad_pomagalo_1_3_12;

public class SmartPhone {
	private String manifacturer;
	private String model;
	private double frequency;
	private double price;
	public String getManifacturer() {
		return manifacturer;
	}
	public void setManifacturer(String manifacturer) {
		this.manifacturer = manifacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getFrequency() {
		return frequency;
	}
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public SmartPhone(String manifacturer, String model, double frequency, double price) {
		super();
		this.manifacturer = manifacturer;
		this.model = model;
		this.frequency = frequency;
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("Manifacturer:%s%nModel:%s%nFrequency:%.2f%nPrice:%.2f%n"
				, getManifacturer()
				,getModel()
				,getFrequency()
				,getPrice());
	}
	
	
}
