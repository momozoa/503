package homework3;

abstract class Material {
	public abstract void doPrinting();
}

class Plastic extends Material {

	public void doPrinting() {
		System.out.println("Plastic ���� ����մϴ�");
	}

	public String toString() {
		return "���� Plastic �Դϴ�";
	}
}

class Powder extends Material {

	public void doPrinting() {
		System.out.println("Powder ���� ����մϴ�");
	}

	public String toString() {
		return "���� Powder �Դϴ�";
	}
}

class GenericPrinter<T> {
	private T material;

	public void setMaterial(T material) {
		this.material = material;
	}

	public T getMaterial() {
		return material;
	}

	public String toString() {
		return material.toString();
	}
}

public class P392 {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);

		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
	}

}
