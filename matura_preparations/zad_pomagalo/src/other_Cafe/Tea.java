package other_Cafe;

public class Tea extends Drink{
	private String type;
	
public Tea(String name, double price, Size size,String type) {
		super(name, price, size);
		this.type = type;
	}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

@Override
public String toString() {
	return String.format("Tea: %s, Size: %s, Type: %s, Price: %.2f"
			,super.getName()
			,super.getSize().toString()
			,this.getType()
			,super.getPrice());
}



}
