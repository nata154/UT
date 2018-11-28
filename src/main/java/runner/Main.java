package runner;

import triangle.Triangle;

public class Main {


	public static void main(String[] args) {

		Triangle tr = new Triangle(100000000, 600000000, 200000000);
		System.out.println(tr.checkTriangle());
		System.out.println(tr.getMessage());
		System.out.println(tr.getSquare());
		System.out.println(tr.detectTriangle());
	}

}
