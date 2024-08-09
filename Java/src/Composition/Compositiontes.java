package Composition;
class Book{
	private String title;
	private String author;
	private String isbn;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
	}
}
class Library{
	
	private Book[] books;
	private int bookcount;
	
	public Library(int capacity) {
		books = new Book[capacity];
		bookcount =0;
	}
	
	//method to a add a book to a library
	public boolean addBook(Book book) {
		if(bookcount<books.length) {
			books[bookcount++] = book;
			return true;
		}
		else {
			System.out.println("Library is full.Cannot add more books");
			return false;
		}
	}
	public void display() {
		System.out.println("Library Books");
		for(int i=0;i<bookcount;i++) {
			books[i].displayBookDetails();
			System.out.println();
		}
	}
	
}
public class Compositiontes {
	public static void main(String[] args) {
		Library myLibrary = new Library(3);
		
		Book book1= new Book("hod","vam","2554");
		Book book2= new Book("got","kri","2556");
		Book book3= new Book("lor","vishnu","2557");
		Book book4= new Book("nar","varsha","2558");
		
		myLibrary.addBook(book1);
		myLibrary.addBook(book2);
		myLibrary.addBook(book3);
		myLibrary.addBook(book4);
		
		myLibrary.display();
	}
}
