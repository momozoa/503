package homework2;

public class Q04 {
	
	public static void main(String[] args) {
		// 4. main�Լ��� ���� adder, exp �Լ��� �ۼ��ض�
		
		int result=adder(10,20); //�� ���� �� ���
		System.out.println(result);
		System.out.println(exp(3.5)); //3.5�� ������ �� ���
	}

	static int adder(int a, int b) {
		return a + b;
	}
	
	static double exp(double a) {
		return a * a;
	}
}
