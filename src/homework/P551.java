package homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person551 implements Serializable {

	private static final long serialVersionUID = -5370957095776059165L;

	String name;
	transient String job;

	public Person551() {
	}

	public Person551(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public String toString() {
		return name + "," + job;
	}
}

public class P551 {

	public static void main(String[] args) throws ClassNotFoundException {

		Person551 personAhn = new Person551("모모1", "대표이사");
		Person551 personKim = new Person551("모모2", "상무이사");

		try (FileOutputStream fos = new FileOutputStream("P551.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeObject(personAhn);
			oos.writeObject(personKim);

		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("P551.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			Person551 p1 = (Person551) ois.readObject();
			Person551 p2 = (Person551) ois.readObject();

			System.out.println(p1);
			System.out.println(p2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}