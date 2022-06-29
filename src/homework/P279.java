package homework;

import java.util.ArrayList;

class Shape {
	void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Circle");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Rectangle");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Triangle");
	}
}

public class P279 {
	public static void main(String[] args) {
		
		ArrayList<Shape> list = new ArrayList<>();
		
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Rectangle());
		
		for(Shape s : list) {
			s.draw();
		}
	}
}
