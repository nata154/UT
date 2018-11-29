package triangle_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import triangle.Triangle;

public class Test_getSquareOfTriangle {
	
	//ordinary triangle
	@Test(groups = {"triangleExists"})
	public void test_getSquare() {
		double a = 3;
		double b = 4;
		double c = 5;
		double expSquare = 6;
		Triangle triangle = new Triangle(a, b, c);
		Assert.assertEquals(triangle.getSquare(), expSquare);
	}
	
	//square of rectangular triangle with another equation
	@Test(groups = {"triangleExists"})
	public void test_getSquareRectangTrianAnotherEquation() {
		double a = 3;
		double b = 4;
		double c = 5;
		double square = (0.5)*(a*b);
		Triangle triangle = new Triangle(a, b, c);
		Assert.assertEquals(triangle.getSquare(), square);
	}
	
	//ordinary triangle which can't exist  (exception or message? what did customer say?)
	@Test(expectedExceptions=Exception.class)
	public void test_getSquareTrCantExist() {
		Triangle triangle = new Triangle(1, 2, 5);
		Assert.assertEquals(triangle.getSquare(), 3);
//		Assert.fail("Triangle which can't exist - We must output exception or message? what did customer say?");
	}
	
	
	//overflow test  - doesn't work, how to do it?
	@Test (expectedExceptions=Exception.class)
	public void test_SquareOverflow() {
		Triangle triangle = new Triangle(300000000, 400000000, 500000000);
		Assert.assertEquals(triangle.getSquare(), 6.0E16);
	}

	//triangle with negative side
	@Test (expectedExceptions=Exception.class)
	public void test_getSquareNegativeSide() {
		Triangle triangle = new Triangle(-3, 4, 5);
		Assert.assertEquals(triangle.getSquare(), 6);
	}
	
	//ordinary triangle with negative side
	@Test
	public void test_getSquareNegManual() {
		Triangle triangle = new Triangle(-3, 4, 5);
//		assertEquals(triangle.getSquare(), 6);
		Assert.fail("Calculates square of triangle with negative side");
	}
	
	
}
