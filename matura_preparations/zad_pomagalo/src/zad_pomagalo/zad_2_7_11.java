package zad_pomagalo;

import zad_pomagalo_1_3_16.Book;
import zad_pomagalo_2_7_10.BookLibrary;

public class zad_2_7_11 {
	public static void main(String[] args) {
		BookLibrary library = new BookLibrary();
		Book book1 = new Book("Title 1","Author 1",1.00,"Genre 1");
		Book book2 = new Book("Title 2","Author 2",2.00,"Genre 2");
		Book book3 = new Book("Title 3","Author 3",3.00,"Genre 3");
		
		library.append(book1);
		library.append(book2);
		library.append(book3);
		
		library.getBooks().forEach(el -> System.out.println(el));
	}
}
