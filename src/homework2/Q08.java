package homework2;

public class Q08 {
	public static void main(String[] args) {
		// 8. main()�� ���� Ŭ������ �ۼ��ض�.
		Point p = new Point(3,4);
		System.out.println(p); //3.4���
	}
	
}

class Point{
	int x, y;

	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return x + "." + y;
	}
}
