package shop;

import java.util.Collection;

public class BookList {

	// ------------------------- Properties ---------------------------
	Collection<Book> books;

	// ------------------------- Getter and Setter --------------------
	public Collection<Book> getBooks() {

		SampleDB sampleDB = new SampleDB();
		return sampleDB.getAllBooks();
	}

	public void setBooks(Collection<Book> books) {
		this.books = books;
	}
}
