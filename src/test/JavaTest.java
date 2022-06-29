package test;





///////////////////////////////////////////////////////////
// 1. 두 정수를 입력받아 합을 구하여 출력하는 프로그램을 작성해라.
//    실행 결과) 두 정수를 입력: 10 20
//    합은 30

//import java.util.Scanner;
//
//public class JavaTest {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("두 정수를 입력: ");
//
//		int numA = s.nextInt();
//		int numB = s.nextInt();
//
//		System.out.println("합은 " + (numA + numB));
//	}
//}


///////////////////////////////////////////////////////////
// 2. 다음 Circle클래스를 활용하여 Circle 객체배열을 생성하고,
//    5개의 원 반지름을 입력받아 배열에 저장한 후, 
//    원의 면적의 합을 출력해라. (r: 반지름)

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
//		System.out.println("5개의 원 반지름을 입력하여라.");
//		for (int i = 0; i < circle.length; i++) {
//			double r = s.nextDouble();
//			circle[i] = new Circle(r);
//		}
//		
//		// 면적의 합 출력
//		double areaSum = 0.0;
//		for (int i = 0; i < circle.length; i++) {
//			areaSum += circle[i].area();
//		}
//		
//		System.out.printf("원의 면적의 합: %.2f\n", areaSum);
//	}
//}


///////////////////////////////////////////////////////////
// 3.
// A) 입력된 숫자의 합과 입력 숫자 중 최대값을 구하는 Num 라는 이름의 클래스를 만들어라. 
//    이 클래스는 add(int n) 라는 메소드를 가지고 있고, 
//    이 함수가 호출될 때마다 매개변수n 의 값이 합에 누적된다.
// B) 이 클래스는 getSum() 과 getMax() 라는 메소드를 가지는데, 
//    이 메소드는 더해진 숫자의 합 반환, 현재까지 더해진 숫자 중 최대값을 반환한다. 
//    Num 클래스를 사용하는 main()은 다음과 같다.

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
//		nb.add(5); // 4개 숫자를 입력
//		System.out.println("Sum = " + nb.getSum());   // 4개 숫자의 합계
//		System.out.println("Max = " + nb.getMax());   // 4개 숫자 중 최대값
//	}
//}


// C) 위에 있는 Num 클래스에 두 개의 생성자를 추가하라. 
//    파리미터가 없는 생성자와 하나의 파라미터를 가진 생성자를 만들어 
//    파라미터가 없는 생성자는 초기값(n)이 0 이 되도록 하며, 
//    정수값 n 을 파라미터로 가지는 생성자는 필드에 값을 초기화해라. 
//    그 후 main함수에서 다시 객체 하나 생성하여 getSum(), getMax() 함수를 오버로딩해라.

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
//		// 그 후 main함수에서 다시 객체 하나 생성하여 getSum(), getMax() 함수를 오버로딩해라.
//	}
//}


///////////////////////////////////////////////////////////
// 4. HashMap에 이름(문자열), 키(실수) 로 주고 이름이 키값이다. 
//    HashMap에 적절한 값을 임의로 설정하고 값을 두개 저장한다. 
//    이름을 입력하면 이름에 맞는 값이 나오도록 구현해라.

//import java.util.Scanner;
//
//public class JavaTest {
//	public static void main(String[] args) {
//		HashMap<String, Double> person = new HashMap<>();
//		
//		person.put("모모1", 170.5);
//		person.put("모모2", 181.3);
//		
//		Scanner s = new Scanner(System.in);
//		System.out.println("이름을 입력하라.");
//		String name = s.next();
//		if(person.containsKey(name)) {
//			System.out.println("이름: " + name + ", 키: " + person.get(name));
//		} else {
//			System.out.println("없는 이름이다.");
//		}
//	}
//}


///////////////////////////////////////////////////////////
// 5. 다음과 같이 화면이 뜨도록 GUI를 구현해라.

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
// 6. 다음 코드를 참고하여 객체 직렬화, 역직렬화를 보여라.
//    ObjectOutputStream, ObjectInputStream 사용, 
//    java.txt파일에 저장하고 콘솔창에 출력

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
//		System.out.println("이름: " + name + ", 아이디: " + id + ", 나이: " + age);
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