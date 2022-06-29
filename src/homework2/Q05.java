package homework2;

public class Q05 {

	public static void main(String[] args) {
		// 5. equals(두 원의 면적이 같은지 비교),
		// toString메소드를 사용하여 완성시켜라

		Circle a = new Circle(30);
		Circle b = new Circle(30);
		System.out.println("반지름" + a);
		System.out.println("반지름" + b);
		if (a.equals(b)) {
			System.out.println("같은 원");
		} else {
			System.out.println("다른 원");
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
