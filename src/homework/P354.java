package homework;

class Book354{
	
	int bookNumber;
	String bookTitle;

	Book354(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		
		return bookTitle + "," + bookNumber;
	}
	
}

public class P354 {
	public static void main(String[] args) {

		Book354 book1 = new Book354(200, "ÀÚ¹Ù");
		
		System.out.println(book1);
		System.out.println(book1.toString());
		}
}
