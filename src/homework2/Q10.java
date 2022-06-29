package homework2;

public class Q10 {
	public static void main(String[] args) {
		// 10. 다음 main함수를 보고 작성해라.
		// 실행 결과) 멋진 신세계 올더스 헉슬리
		//          더 해빙 작가 미상
		//          생성자 호출!!

		Book b1=new Book("멋진 신세계", "올더스 헉슬리");
		Book b2=new Book("더 해빙");
		Book b3=new Book(); 

	}
}

class Book{
	String title;
	String author;

	Book() {
		this("생성자 호출!!", "");
	}
	
	Book(String title) {
		this(title, "작가 미상");
	}
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
		show();
	}
	
	public void show() {
		System.out.println(title + " " + author);
	}
}

