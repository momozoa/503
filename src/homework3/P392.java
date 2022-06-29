package homework3;

abstract class Material {
	public abstract void doPrinting();
}

class Plastic extends Material {

	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다");
	}

	public String toString() {
		return "재료는 Plastic 입니다";
	}
}

class Powder extends Material {

	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다");
	}

	public String toString() {
		return "재료는 Powder 입니다";
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
