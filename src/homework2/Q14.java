package homework2;

public class Q14 {
	public static void main(String[] args) {
		// 14. 다음 main()를 보고 추상 클래스와추상메소드 작성해라.
		// (total 함수는 배열 값(1,2,3,4,5) 총합 리턴받는 함수)

		Ab c = new Cd();
		System.out.println(c.total(new int []{1,2,3,4,5}));
	}
}

abstract class Ab{
	abstract int total(int[] n);
}

class Cd extends Ab{

	@Override
	int total(int[] n) {
		int sum = 0;
		for(int i : n) {
			sum += i;
		}
		return sum;
	}
}