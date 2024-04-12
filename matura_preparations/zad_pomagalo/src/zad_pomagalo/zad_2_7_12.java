package zad_pomagalo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import zad_pomagalo_1_3_16.Book;
import zad_pomagalo_2_7_10.BookLibrary;

public class zad_2_7_12 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("src/zad_pomagalo_2_7_10/BookInfo"));
		BookLibrary library = new BookLibrary();
		
		while(scan.hasNext()) {
			String[] input = scan.nextLine().split("\\s+");
			library
			.append(new Book(input[0],
					input[1],
					Double.parseDouble(input[2]),
					input[3]));
		}	

		 FileWriter writer = new FileWriter("src/zad_pomagalo_2_7_10/BookOutPut", true);
		for (Book book: library.getBooks()) {
			writer.write(String.format(book.toString() + "\n"));
		}
		writer.flush();
		
	
	}
}
