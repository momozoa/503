package homework2;

public class Q03 {
	public static void main(String[] args) {
		// 3. 0~30���� �� �߿��� 5�� ����� �����ϰ� ����ض�.
		// (���� �ݺ����� break, continue�� �� ����Ͽ� ���)
		int i = -1;
		for(;;) {
			i++;
			if (i > 30) break;
			if (i != 0 && i % 5 == 0) continue;
			System.out.print(i + " ");
		}
	}
}
