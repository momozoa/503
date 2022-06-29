package homework2;

public class Q14 {
	public static void main(String[] args) {
		// 14. ���� main()�� ���� �߻� Ŭ�������߻�޼ҵ� �ۼ��ض�.
		// (total �Լ��� �迭 ��(1,2,3,4,5) ���� ���Ϲ޴� �Լ�)

		Ab c = new Cd();
		System.out.println(c.total(new int []{1,2,3,4,5}));
	}
}

abstract class Ab{
	abstract int total(int[] n);
}

class Cd extends Ab{

	@Override
	int total(int[] n) {
		int sum = 0;
		for(int i : n) {
			sum += i;
		}
		return sum;
	}
}