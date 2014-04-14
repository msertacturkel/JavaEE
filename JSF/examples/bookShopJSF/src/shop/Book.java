package shop;

import java.io.Serializable;
import javax.faces.component.UIParameter;
import javax.faces.event.ActionEvent;

public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// ------------------ Properties --------------------------------
	private long id;
	private String author;
	private String title;
	private String owner = "...";
	private boolean available = true;

	// ------------------ Constructors -------------------------------
	public Book() {
	}

	public Book(long id, String author, String title, String owner,
			boolean available) {
		this.id = id;
		this.author = author;
		this.title = title;
		if (!available)
			this.owner = owner;
		this.available = available;
	}

	// ------------------ Getter and setter methods ---------------------
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBook(Book book) {
		this.setId(book.getId());
		this.setAuthor(book.getAuthor());
		this.setTitle(book.getTitle());
		this.setOwner(book.getOwner());
		this.setAvailable(book.isAvailable());
	}

	public Book getBook() {

		return new Book(this.getId(), this.getAuthor(), this.getTitle(), this
				.getOwner(), this.isAvailable());
	}

	// ------------------ Action listener Methods ---------------------
	/**
	 * Initial the properties of the class with null
	 * 
	 * @param event
	 */
	public void initBook(ActionEvent event) {

		// init the book object
		this.setBook(new Book());
	}

	/**
	 * Get the book to edit and assign it to the bean
	 * 
	 * @param event
	 */
	public void selectBook(ActionEvent event) 
	{
		SampleDB sampleDB = new SampleDB();

		UIParameter component = (UIParameter) event.getComponent().findComponent("editId");

		long id = Long.parseLong(component.getValue().toString());

		this.setBook(sampleDB.loadBookById(id));
	}

	/**
	 * Add or update the book in the simulated database. If the book id is not
	 * set the book will be added otherwise the book will be updated
	 * 
	 * @param event
	 */
	public void saveBook(ActionEvent event) {

		SampleDB sampleDB = new SampleDB();

		sampleDB.saveToDB(this.getBook());
	}

	/**
	 * Delete a book in the simulated database
	 * 
	 * @param event
	 */
	public void deleteBook(ActionEvent event) {

		SampleDB sampleDB = new SampleDB();

		UIParameter component = (UIParameter) event.getComponent()
				.findComponent("deleteId");

		long id = Long.parseLong(component.getValue().toString());

		sampleDB.deleteBookById(id);
	}

	public void oduncAl(ActionEvent event) {

		SampleDB sampleDB = new SampleDB();

		UIParameter component = (UIParameter) event.getComponent()
				.findComponent("borrowId");

		UIParameter component2 = (UIParameter) event.getComponent()
				.findComponent("user");

		long id = Long.parseLong(component.getValue().toString());
		String user = component2.getValue().toString();

		this.setBook(sampleDB.loadBookById(id));
		this.available = false;
		this.owner = user;
		saveBook(event);
	}
}
