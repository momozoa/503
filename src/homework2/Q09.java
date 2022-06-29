package homework2;

public class Q09 {
	public static void main(String[] args) {
		// 9. main()�� ���� �������̽��� �ۼ��ض�.
		// (�������̽����� Re, ��� �޼ҵ���� �������̽��ȿ��� �����ϰ�
		// show�Լ��� default�� ����,area�� abstract�� ����)
		//������) �簢��!!
		//        ���� 200


		Re r = new Rec(10, 20);
		r.show(); // "�簢��!!" ���
		System.out.println("���� " + r.area());

	}
}

interface Re {
	void show();
	int area();
}

class Rec implements Re {
	int width, height;

	Rec(int w, int h) {
		width = w;
		height = h;
	}

	@Override
	public void show() {
		System.out.println("�簢��!!");
	}	
	
	@Override
	public int area() {
		return width * height;
	}
}
