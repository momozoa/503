package homework2;

public class Q05 {

	public static void main(String[] args) {
		// 5. equals(�� ���� ������ ������ ��),
		// toString�޼ҵ带 ����Ͽ� �ϼ����Ѷ�

		Circle a = new Circle(30);
		Circle b = new Circle(30);
		System.out.println("������" + a);
		System.out.println("������" + b);
		if (a.equals(b)) {
			System.out.println("���� ��");
		} else {
			System.out.println("�ٸ� ��");
		}
	}
}

class Circle {
	int r;

	Circle(int r) {
		this.r = r;
	}
	
	public double getArea() {
		return 3.14 * r * r;
	}
	
	@Override
	public String toString() {
		return String.valueOf(r);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle tmp = (Circle)obj;
			
			if (this.getArea() == tmp.getArea()) {
				return true;
			} else {
				return false;
			}
		}
		
		return false;
	}
}
