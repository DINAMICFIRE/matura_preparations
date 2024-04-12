package zad_pomagalo_2_7_10;

import java.util.ArrayList;
import java.util.List;

import zad_pomagalo_1_3_16.Book;

public class BookLibrary {
	private List<Book> books;

	public BookLibrary() {
		books = new ArrayList<>();
	}
	public int size() {
		return books.size();
	}
	public void append(Book b) {
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			if(book.getAuthor().equals(b.getAuthor()) && book.getTitle().equals(b.getTitle())) {
				return;
			}
		}
		books.add(b);
	}
	public void delete(String title, String author) {
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			if(book.getAuthor().equals(author) && book.getTitle().equals(title)) {
				books.remove(i);
				return;
			}
		}
	}
	public Book getB(String title) {
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			if(book.getTitle().equals(title)) {
				return book;
			}
		}
		return null;
	}
	
	public Book getBA(String title, String author) {
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			if(book.getAuthor().equals(author) && book.getTitle().equals(title)) {
				return book;
			}
		}
		return null;
	}
	public List<Book> getBooks() {
		return books;
	}
	
}
