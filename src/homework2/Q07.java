package homework2;

public class Q07 {
	public static void main(String[] args) {
		
		// 7. Tv클래스와main()를 보고 
		// Tv클래스를 상속받은 Tv1클래스를작성해라
		
		Tv1 t=new Tv1(20, "삼성");
		t.show(); //삼성 20인치 Tv 출력
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
		System.out.println(brand + " " + getsize() + "인치 Tv");
	}
	
	
	
	
	
}