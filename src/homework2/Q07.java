package homework2;

public class Q07 {
	public static void main(String[] args) {
		
		// 7. TvŬ������main()�� ���� 
		// TvŬ������ ��ӹ��� Tv1Ŭ�������ۼ��ض�
		
		Tv1 t=new Tv1(20, "�Ｚ");
		t.show(); //�Ｚ 20��ġ Tv ���
	} 

}

class Tv {
	private int size;

	Tv(int size) {
		this.size = size;
	}

	protected int getsize() {
		return size;
	}
}

class Tv1 extends Tv{
	private String brand;

	Tv1(int size, String brand) {
		super(size);
		this.brand = brand;
	}
	
	public void show() {
		System.out.println(brand + " " + getsize() + "��ġ Tv");
	}
	
	
	
	
	
}