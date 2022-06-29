package homework;

import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		// 4.while문을 이용해 숫자 입력받아 입력받은 모든 수의 합을 출력해라.
		// 0이 입력되면 입력이 종료되고 합을 출력한다.
		
		Scanner s = new Scanner(System.in);
		
		int n = -1;
		int sum = 0;
		System.out.println("숫자를 입력하라. (0 은 종료)");
		while((n = s.nextInt()) != 0) {
			sum += n;
		}
		
		System.out.println("총 합:" + sum);
	}
}
