package other_film_menagement_system;

import java.util.ArrayList;
import java.util.List;

public class FilmLibrary {
	private String name;
	private List<Movie> movies;

	public FilmLibrary(String name) {
		super();
		this.name = name;
		this.movies = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public List<Movie> getMovies() {
		return movies;
	}
	public void addFilm(Movie movie) {
		this.movies.add(movie);
	}

	public void printInfo() {
		System.out.println("Филмотека: " + name);
		System.out.println("Филми:");
		for (Movie movie : movies) {
			System.out.println(movie);
		}
	}
}
