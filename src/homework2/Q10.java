package homework2;

public class Q10 {
	public static void main(String[] args) {
		// 10. ���� main�Լ��� ���� �ۼ��ض�.
		// ���� ���) ���� �ż��� �ô��� �佽��
		//          �� �غ� �۰� �̻�
		//          ������ ȣ��!!

		Book b1=new Book("���� �ż���", "�ô��� �佽��");
		Book b2=new Book("�� �غ�");
		Book b3=new Book(); 

	}
}

class Book{
	String title;
	String author;

	Book() {
		this("������ ȣ��!!", "");
	}
	
	Book(String title) {
		this(title, "�۰� �̻�");
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

