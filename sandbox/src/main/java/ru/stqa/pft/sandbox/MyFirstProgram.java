package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	public static void main(String[] args) {
		hello("world");
		hello("user");
		hello("Marina");

		Square s = new Square(5);
		System.out.println("S квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(3,7);
		System.out.println("S прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}



}