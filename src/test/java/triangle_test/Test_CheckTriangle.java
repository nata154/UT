package triangle_test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import triangle.Triangle;

public class Test_CheckTriangle {

	@Test
	public void testC0(){
		fail ("There is a mistake in line 44 comparing c<0");
	}
	
	//entering 3 negative sides
	@Test
	public void test_NegativeSides() {
		double a = -3;
		double b = -4;
		double c = -5;
		String txtNegA = "a<=0";
		String txtNegB = "b<=0";
		String txtNegC = "c<=0";
		
		Triangle triangle = new Triangle(a, b, c);
		assertEquals(false, triangle.checkTriangle());
		assertEquals(txtNegA, triangle.getMessage());
		assertEquals(false, triangle.checkTriangle());
		assertEquals(txtNegB, triangle.getMessage());
		assertEquals(false, triangle.checkTriangle());
		assertEquals(txtNegC, triangle.getMessage());
	}
	
	//entering 1 negative side A
	@Test
	public void test_NegativeSideA() {
		double a = -3;
		double b = 4;
		double c = 5;
		String txtNegA = "a<=0";
				
		Triangle triangle = new Triangle(a, b, c);
		assertEquals(false, triangle.checkTriangle());
		assertEquals(txtNegA, triangle.getMessage());
		}
	
	//entering 1 negative side B
	@Test
	public void test_NegativeSideB() {
		double a = 3;
		double b = -4;
		double c = 5;
		String txtNegB = "b<=0";
				
		Triangle triangle = new Triangle(a, b, c);
		assertEquals(false, triangle.checkTriangle());
		assertEquals(txtNegB, triangle.getMessage());
		}
	
	//entering 1 negative side C
	@Test
	public void test_NegativeSideC() {
		double a = 3;
		double b = 4;
		double c = -5;
		String txtNegC = "c<=0";
				
		Triangle triangle = new Triangle(a, b, c);
		assertEquals(false, triangle.checkTriangle());
		assertEquals(txtNegC, triangle.getMessage());
		System.out.println("There is a mistake in line 44 comparing c<0");
		}
}
