package homework;

import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		//5. while, break���� ����� 0�� �Էµɶ����� 
		//�Է��� ������ ������ ���
		
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��϶�. (0�� ����)");
		
		
		int cnt = 0;
		while(true) {
			int n = s.nextInt();
			if (n == 0 ) break;
			cnt++;
		}
		
		System.out.println("�� �Է� ����: " + cnt);
	}
}
