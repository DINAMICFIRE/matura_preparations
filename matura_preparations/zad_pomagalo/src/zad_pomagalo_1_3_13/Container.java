package zad_pomagalo_1_3_13;

public class Container {
private int weight;
private double height;
private double width;
private double length;
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public Container(int weight, double height, double width, double length) {
	super();
	this.weight = weight;
	this.height = height;
	this.width = width;
	this.length = length;
}


}
