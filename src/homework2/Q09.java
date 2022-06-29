package homework2;

public class Q09 {
	public static void main(String[] args) {
		// 9. main()를 보고 인터페이스를 작성해라.
		// (인터페이스명은 Re, 모든 메소들들을 인터페이스안에서 선언하고
		// show함수는 default로 설정,area는 abstract로 설정)
		//실행결과) 사각형!!
		//        면적 200


		Re r = new Rec(10, 20);
		r.show(); // "사각형!!" 출력
		System.out.println("면적 " + r.area());

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
		System.out.println("사각형!!");
	}	
	
	@Override
	public int area() {
		return width * height;
	}
}
