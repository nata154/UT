package triangle_test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import triangle.Triangle;

public class Test_getSquareOfTriangle {
	
	//ordinary triangle
	@Test
	public void test_getSquare() {
		Triangle triangle = new Triangle(3, 4, 5);
		assertEquals(6, triangle.getSquare(), 0.01);
	}
	
	//square of rectangular triangle with another equation
	@Test
	public void test_getSquareRectangTrianAnotherEquation() {
		double a = 3;
		double b = 4;
		double c = 5;
		double square = (0.5)*(a*b);
		Triangle triangle = new Triangle(a, b, c);
		assertEquals(square, triangle.getSquare());
	}
	
	//ordinary triangle which can't exist  (exception or message? what did customer say?)
	@Test(expectedExceptions=Exception.class)
	public void test_getSquareCantExist() {
		Triangle triangle = new Triangle(1, 2, 5);
		assertEquals(3, triangle.getSquare(), 0.01);
//		fail("Triangle which can't exist - We must output exception or message? what did customer say?");
	}
	
	
	//overflow test  - doesn't work
	@Test (expectedExceptions=Exception.class)
	public void test_SquareOverflow() {
		Triangle triangle = new Triangle(300000000, 400000000, 500000000);
		assertEquals(6.0E16, triangle.getSquare());
	}

	//triangle with negative side
	@Test (expectedExceptions=Exception.class)
	public void test_getSquareNegativeSide() {
		Triangle triangle = new Triangle(-3, 4, 5);
		assertEquals(6, triangle.getSquare(), 0.01);
	}
	
	//ordinary triangle with negative side
	@Test
	public void test_getSquareNegManual() {
		Triangle triangle = new Triangle(-3, 4, 5);
//		assertEquals(6, triangle.getSquare(), 0.01);
		fail("calculates square of triangle with negative side");
	}
	
	
}
