package homework;

abstract class Material {
	public abstract void doPrinting();
}


class Powder extends Material{
	@Override
	public void doPrinting() {
		System.out.println("Powder ���� ����մϴ�");
	}
	
	public String toString() {
		return "���� Powder �Դϴ�";
	}
}

class Plastic extends Material{
	@Override
	public void doPrinting() {
		System.out.println("Plastic ���� ����մϴ�");
	}
	
	public String toString() {
		return "���� Plastic �Դϴ�";
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
