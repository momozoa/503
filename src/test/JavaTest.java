package test;





///////////////////////////////////////////////////////////
// 1. �� ������ �Է¹޾� ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ��ض�.
//    ���� ���) �� ������ �Է�: 10 20
//    ���� 30

//import java.util.Scanner;
//
//public class JavaTest {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("�� ������ �Է�: ");
//
//		int numA = s.nextInt();
//		int numB = s.nextInt();
//
//		System.out.println("���� " + (numA + numB));
//	}
//}


///////////////////////////////////////////////////////////
// 2. ���� CircleŬ������ Ȱ���Ͽ� Circle ��ü�迭�� �����ϰ�,
//    5���� �� �������� �Է¹޾� �迭�� ������ ��, 
//    ���� ������ ���� ����ض�. (r: ������)

//import java.util.Scanner;
//
//class Circle {
//	private double r;
//
//	Circle(double r) {
//		this.r = r;
//	}
//
//	double area() {
//		return 3.14 * r * r;
//	}
//}
//
//public class JavaTest {
//	public static void main(String[] args) {
//		Circle[] circle = new Circle[5];
//
//		Scanner s = new Scanner(System.in);
//		System.out.println("5���� �� �������� �Է��Ͽ���.");
//		for (int i = 0; i < circle.length; i++) {
//			double r = s.nextDouble();
//			circle[i] = new Circle(r);
//		}
//		
//		// ������ �� ���
//		double areaSum = 0.0;
//		for (int i = 0; i < circle.length; i++) {
//			areaSum += circle[i].area();
//		}
//		
//		System.out.printf("���� ������ ��: %.2f\n", areaSum);
//	}
//}


///////////////////////////////////////////////////////////
// 3.
// A) �Էµ� ������ �հ� �Է� ���� �� �ִ밪�� ���ϴ� Num ��� �̸��� Ŭ������ ������. 
//    �� Ŭ������ add(int n) ��� �޼ҵ带 ������ �ְ�, 
//    �� �Լ��� ȣ��� ������ �Ű�����n �� ���� �տ� �����ȴ�.
// B) �� Ŭ������ getSum() �� getMax() ��� �޼ҵ带 �����µ�, 
//    �� �޼ҵ�� ������ ������ �� ��ȯ, ������� ������ ���� �� �ִ밪�� ��ȯ�Ѵ�. 
//    Num Ŭ������ ����ϴ� main()�� ������ ����.

//class Num {
//	private int sum = 0;
//	private int max = Integer.MIN_VALUE;
//	
//	public void add(int n) {
//		sum += n;
//		if (max < n) {
//			max = n;
//		}
//	}
//
//	public int getSum() {
//		return sum;
//	}
//	
//	public int getMax() {
//		return max;
//	}
//}
//
//public class JavaTest {
//	public static void main(String[] args) {
//		Num nb = new Num();
//		nb.add(7);
//		nb.add(-1);
//		nb.add(20);
//		nb.add(5); // 4�� ���ڸ� �Է�
//		System.out.println("Sum = " + nb.getSum());   // 4�� ������ �հ�
//		System.out.println("Max = " + nb.getMax());   // 4�� ���� �� �ִ밪
//	}
//}


// C) ���� �ִ� Num Ŭ������ �� ���� �����ڸ� �߰��϶�. 
//    �ĸ����Ͱ� ���� �����ڿ� �ϳ��� �Ķ���͸� ���� �����ڸ� ����� 
//    �Ķ���Ͱ� ���� �����ڴ� �ʱⰪ(n)�� 0 �� �ǵ��� �ϸ�, 
//    ������ n �� �Ķ���ͷ� ������ �����ڴ� �ʵ忡 ���� �ʱ�ȭ�ض�. 
//    �� �� main�Լ����� �ٽ� ��ü �ϳ� �����Ͽ� getSum(), getMax() �Լ��� �����ε��ض�.

//class Num {
//	int n;
//	private int sum = 0;
//	private int max = Integer.MIN_VALUE;
//	
//	Num() {
//		this(0);
//	}
//	
//	Num(int n) {
//		this.n = n;
//	}
//
//	public void add(int n) {
//		sum += n;
//		if (max < n) {
//			max = n;
//		}
//	}
//	
//	public int getSum() {
//		return sum;
//	}
//	
//	public int getMax() {
//		return max;
//	}
//}
//public class JavaTest {
//	public static void main(String[] args) {
//		Num nb = new Num();
//		// �� �� main�Լ����� �ٽ� ��ü �ϳ� �����Ͽ� getSum(), getMax() �Լ��� �����ε��ض�.
//	}
//}


///////////////////////////////////////////////////////////
// 4. HashMap�� �̸�(���ڿ�), Ű(�Ǽ�) �� �ְ� �̸��� Ű���̴�. 
//    HashMap�� ������ ���� ���Ƿ� �����ϰ� ���� �ΰ� �����Ѵ�. 
//    �̸��� �Է��ϸ� �̸��� �´� ���� �������� �����ض�.

//import java.util.Scanner;
//
//public class JavaTest {
//	public static void main(String[] args) {
//		HashMap<String, Double> person = new HashMap<>();
//		
//		person.put("���1", 170.5);
//		person.put("���2", 181.3);
//		
//		Scanner s = new Scanner(System.in);
//		System.out.println("�̸��� �Է��϶�.");
//		String name = s.next();
//		if(person.containsKey(name)) {
//			System.out.println("�̸�: " + name + ", Ű: " + person.get(name));
//		} else {
//			System.out.println("���� �̸��̴�.");
//		}
//	}
//}


///////////////////////////////////////////////////////////
// 5. ������ ���� ȭ���� �ߵ��� GUI�� �����ض�.

//import java.awt.*;
//import javax.swing.*;
//
//public class JavaTest extends JFrame {
//	
//	JavaTest() {
//		Container c = getContentPane();
//		c.setLayout(new GridLayout(3, 3, 10, 10));
//		
//		JButton[] btn = new JButton[9];
//		
//		for(int i = 0; i < btn.length; i++) {
//			btn[i] = new JButton(String.valueOf(i+1));
//			c.add(btn[i]);
//		}
//		
//		setTitle("Dial");
//		setSize(300, 300);
//		setLocationRelativeTo(null);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setVisible(true);
//	}
//	
//	public static void main(String[] args) {
//		new JavaTest();
//	}
//}




///////////////////////////////////////////////////////////
// 6. ���� �ڵ带 �����Ͽ� ��ü ����ȭ, ������ȭ�� ������.
//    ObjectOutputStream, ObjectInputStream ���, 
//    java.txt���Ͽ� �����ϰ� �ܼ�â�� ���

//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//
//class Student implements Serializable {
//	private static final long serialVersionUID = -6197489294043861503L;
//	String name;
//	String id;
//	int age;
//	
//	Student(String name, String id, int age) {
//		this.name = name;
//		this.id = id;
//		this.age = age;
//	}
//	
//	
//	public void show() {
//		System.out.println("�̸�: " + name + ", ���̵�: " + id + ", ����: " + age);
//	}
//	
//}
//
//public class JavaTest {
//	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		Student s= new Student("jack", "123", 20);
//		s.show();
//		
//		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("java.txt"));
//		out.writeObject(s);
//		out.close();
//		
//		
//		ObjectInputStream in = new ObjectInputStream(new FileInputStream("java.txt"));
//		Student s1= (Student)in.readObject();
//		s1.show();
//		in.close();
//	}
//}