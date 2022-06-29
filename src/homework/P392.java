package homework;

abstract class Material {
	public abstract void doPrinting();
}


class Powder extends Material{
	@Override
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다");
	}
	
	public String toString() {
		return "재료는 Powder 입니다";
	}
}

class Plastic extends Material{
	@Override
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다");
	}
	
	public String toString() {
		return "재료는 Plastic 입니다";
	}
}

class GenericPrinter<T extends Material> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString(){
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}

public class P392 {
	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		powder.doPrinting();
		powderPrinter.printing();
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		plastic.doPrinting();
		plasticPrinter.printing();
	}
}
