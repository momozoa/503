package homework;

import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		//5. while, break문을 사용해 0이 입력될때까지 
		//입력한 숫자의 개수를 출력
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하라. (0은 종료)");
		
		
		int cnt = 0;
		while(true) {
			int n = s.nextInt();
			if (n == 0 ) break;
			cnt++;
		}
		
		System.out.println("총 입력 개수: " + cnt);
	}
}
