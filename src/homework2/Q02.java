package homework2;

public class Q02 {
	public static void main(String[] args) {
		// 2. while���� �̿��ؼ� 1���� 100���� ���� �� 5�ǹ���� ������ ���
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
