package homework;

class Person172 {
	String name;
	int age;

	Person172() {
		this("No Name", 1);
	}

	Person172(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Person172 returnItSelf() {
		return this;
	}
}

public class P172 {
	public static void main(String[] args) {

		Person172 noName = new Person172();
		System.out.println(noName.name);
		System.out.println(noName.age);

		Person172 p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}
}
