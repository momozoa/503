package homework;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		// 6. Ű����� ���� 5�� �Է¹޾� ���� ū �� ���

		int[] nums = new int[5];
		
		Scanner s = new Scanner(System.in);
		System.out.println("���� 5�� �Է��϶�.");
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = s.nextInt();
		}
		
		for(int n: nums) {
			System.out.print(n + " ");
		}
		
	}
}
