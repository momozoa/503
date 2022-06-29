package homework2;

public class Q04 {
	
	public static void main(String[] args) {
		// 4. main함수를 보고 adder, exp 함수를 작성해라
		
		int result=adder(10,20); //두 수의 합 출력
		System.out.println(result);
		System.out.println(exp(3.5)); //3.5의 제곱한 값 출력
	}

	static int adder(int a, int b) {
		return a + b;
	}
	
	static double exp(double a) {
		return a * a;
	}
}
