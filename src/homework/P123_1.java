package homework;

public class P123_1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '*';
		int result = 0;

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("연산자 오류");
			return;
		}
		System.out.println("결과 값: " + result);
	}
}
