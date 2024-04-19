package other_film_menagement_system;

public class Movie {
private String title;
private String director;
private Integer year;


public Movie(String title, String director, Integer year) {
	super();
	this.title = title;
	this.director = director;
	this.year = year;
}


public String getTitle() {
	return title;
}


public String getDirector() {
	return director;
}


public Integer getYear() {
	return year;
}


@Override
public String toString() {
	return String.format("Филм: %s, Режисьор: %s, Година: %d", title,director,year);
}

}
