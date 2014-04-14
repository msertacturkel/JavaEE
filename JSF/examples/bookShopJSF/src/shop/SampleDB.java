package shop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import javax.faces.context.FacesContext;

public class SampleDB {

	private Collection<Book> books;
	private Map session;

	public SampleDB() {

		session = FacesContext.getCurrentInstance().getExternalContext()
				.getApplicationMap();

		// load books from db
		books = (Collection<Book>) session.get("bookDB");

		// db not yet initialized, so do it
		if (books == null) {

			books = new ArrayList<Book>();

			// -------------SAMPLE BOOKS-------------------
			books.add(new Book(1111, "David Geary", "Core Java Server Faces", null,true));
			books.add(new Book(3333, "Stephenie Meyer", "Breaking Dawn", null, true));
			books.add(new Book(4444, "Dan Brown", "The Lost Symbol", null, true));
			books.add(new Book(5555, "Lisa Kleypas", "O Yaz", null, true));
			books.add(new Book(6666, "Paulo Coelho", "The Witch of Portobello", null,true));
			books.add(new Book(7777, "Chris Cleave", "Little Bee", null,true));
			books.add(new Book(8888, "Elizabeth Hoyt", "Raven Prince", null,true));
			books.add(new Book(9999, "Luke Welling", "Php ve My SQL", null,true));

			session.put("bookDB", books);
		}
	}

	private void loadData() {
		// load books from db
		books = (Collection<Book>) session.get("bookDB");
	}

	public void saveToDB(Book book) {
		// load books from db
		loadData();

		ArrayList<Book> list = (ArrayList<Book>) books;
		int i;

		// if book is existed, do an update
		for (i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == book.getId()) {
				list.remove(i);
				break;
			}
		}

		list.add(i, book);
		books = list;

		// save to DB
		session.put("bookDB", books);
	}

	public Book loadBookById(long id) {
		// load books from db
		loadData();

		for (Book iter : books) {
			if (iter.getId() == id) {
				return iter;
			}
		}
		return null;
	}

	public void deleteBookById(long id) {
		// load books from db
		loadData();

		for (Book iter : books) {
			if (iter.getId() == id) {
				books.remove(iter);
				break;
			}
		}

		// save to DB
		session.put("bookDB", books);
	}

	public Collection<Book> getAllBooks() {
		// load books from db
		loadData();
		return books;
	}
}