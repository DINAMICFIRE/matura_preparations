package zad_pomagalo_1_3_16;

public class Book {
private String title;
private String author;
private double price;
private String genre;
public Book(String title, String author, double price, String genre) {
	setTitle(title);
	setAuthor(author);
	setGenre(genre);
	setPrice(price);
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	if(title.isBlank()) {
		throw new IllegalArgumentException("Cant be null or empty");
	}
	this.title = title;
}
public String getAuthor() {
	
	return author;
}
public void setAuthor(String author) {
	if(author.isBlank()) {
		throw new IllegalArgumentException("Cant be null or empty");
	}
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	if(price < 0) {
		throw new IllegalArgumentException("Cant be negative");
	}
	this.price = price;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	if(genre.isBlank()) {
		throw new IllegalArgumentException("Cant be null or empty");
	}
	this.genre = genre;
}
@Override
public String toString() {
	return String.format("%s от %s, %.2f",getTitle(),getAuthor(),getPrice());
}


}
