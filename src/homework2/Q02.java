package homework2;

public class Q02 {
	public static void main(String[] args) {
		// 2. while문을 이용해서 1부터 100까지 정수 중 5의배수의 총합을 출력
		int n = 1;
		int sum = 0;
		while(n <= 100) {
			if (n % 5 == 0)
				sum += n;

			n++;
		}
		System.out.println(sum);
	}
}
