package homework;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�. ");
	}

	public void readBook() {
		System.out.println("����� å�� �н��ϴ�. ");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�. ");
	}

	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�. ");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ� ");
	}

	public void flying() {
		System.out.print("�������� ������ �� ��� �ָ� ���ư��ϴ�");
	}
}

public class P260 {

	public static void main(String[] args) {
		P260 test = new P260();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
	}

	public void moveAnimal(Animal animal) {
			animal.move();
	}

}
