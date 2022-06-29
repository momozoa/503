package homework;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		// 6. 키보드로 정수 5개 입력받아 제일 큰 수 출력

		int[] nums = new int[5];
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 5개 입력하라.");
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = s.nextInt();
		}
		
		for(int n: nums) {
			System.out.print(n + " ");
		}
		
	}
}
