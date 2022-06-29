package homework2;

public class Q03 {
	public static void main(String[] args) {
		// 3. 0~30까지 수 중에서 5의 배수를 제외하고 출력해라.
		// (무한 반복문과 break, continue를 다 사용하여 출력)
		int i = -1;
		for(;;) {
			i++;
			if (i > 30) break;
			if (i != 0 && i % 5 == 0) continue;
			System.out.print(i + " ");
		}
	}
}
