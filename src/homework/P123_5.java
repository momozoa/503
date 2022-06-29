package homework;

public class P123_5 {
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			int k = (i < 4) ? 3 - i : i - 3;
			
			for(int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < 2 * (3 - k) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
