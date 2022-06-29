package homework;

class Book {

	private String bookName;
	private String author;

	public Book() {
	}

	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
}

public class P207 {
	public static void main(String[] args) {
		Book[] library = new Book[5];

		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
