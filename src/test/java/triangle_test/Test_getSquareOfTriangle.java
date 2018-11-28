package triangle_test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import triangle.Triangle;

public class Test_getSquareOfTriangle {
	
	//ordinary triangle
	@Test
	public void test_getSquare() {
		Triangle triangle = new Triangle(3, 4, 5);
		assertEquals(6, triangle.getSquare(), 0.01);
	}
	
	
	//overflow test
	@Test (expectedExceptions=Exception.class)
	public void test_SquareOverflow() {
		Triangle triangle = new Triangle(100000000, 600000000, 200000000);
		triangle.getSquare();
	}

}
