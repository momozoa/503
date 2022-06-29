package homework;

class Person {
	String name;
	float height;
	float weight;

	public Person() {}

	public Person(String pname) {
		name = pname;
	}

	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}

public class P157 {
	public static void main(String[] args) {
		Person personMo = new Person();
		personMo.name = "모모";
		personMo.weight = 75.5F;
		personMo.height = 184.0F;

		Person personLee = new Person("이순신", 175, 75);
	}
}
