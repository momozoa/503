package homework;

import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		// 4.while���� �̿��� ���� �Է¹޾� �Է¹��� ��� ���� ���� ����ض�.
		// 0�� �ԷµǸ� �Է��� ����ǰ� ���� ����Ѵ�.
		
		Scanner s = new Scanner(System.in);
		
		int n = -1;
		int sum = 0;
		System.out.println("���ڸ� �Է��϶�. (0 �� ����)");
		while((n = s.nextInt()) != 0) {
			sum += n;
		}
		
		System.out.println("�� ��:" + sum);
	}
}
