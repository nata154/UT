package triangle_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import triangle.Triangle;

public class Test_CheckTriangle {

	@Test
	public void testC0(){
		Assert.fail ("There is a mistake in line 44 comparing c<0");
	}
	
	//input 3 negative sides
	@Test
	public void test_AllNegativeSides() {
		double a = -3;
		double b = -4;
		double c = -5;
		String txtNegA = "a<=0";
		String txtNegB = "b<=0";
		String txtNegC = "c<=0";
		
		Triangle triangle = new Triangle(a, b, c);
		Assert.assertEquals(triangle.checkTriangle(), false);
		Assert.assertEquals(triangle.getMessage(), txtNegA);
		Assert.assertEquals(triangle.checkTriangle(), false);
		Assert.assertEquals(triangle.getMessage(), txtNegB);
		Assert.assertEquals(triangle.checkTriangle(), false);
		Assert.assertEquals(triangle.getMessage(), txtNegC);
	}
	
	//entering 1 negative side A
	@Test
	public void test_NegativeSideA() {
		double a = -3;
		double b = 4;
		double c = 5;
		String txtNegA = "a<=0";
				
		Triangle triangle = new Triangle(a, b, c);
		Assert.assertEquals(triangle.checkTriangle(), false);
		Assert.assertEquals(triangle.getMessage(), txtNegA);
		}
	
	//entering 1 negative side B
	@Test
	public void test_NegativeSideB() {
		double a = 3;
		double b = -4;
		double c = 5;
		String txtNegB = "b<=0";
				
		Triangle triangle = new Triangle(a, b, c);
		Assert.assertEquals(triangle.checkTriangle(), false);
		Assert.assertEquals(triangle.getMessage(), txtNegB);
		}
	
	//entering 1 negative side C
	@Test
	public void test_NegativeSideC() {
		double a = 3;
		double b = 4;
		double c = -5;
		String txtNegC = "c<=0";
				
		Triangle triangle = new Triangle(a, b, c);
		Assert.assertEquals(triangle.checkTriangle(), false);
		Assert.assertEquals(triangle.getMessage(), txtNegC);
		System.out.println("There is a mistake in line 44 comparing c<0");
		}
	
	@Test
	public void test_SumAB() {
		double a = 1;
		double b = 2;
		double c = 10;
		String sumAB = "a+b<=c";
		
		Triangle triangle = new Triangle(a, b, c);
		Assert.assertEquals(triangle.checkTriangle(), false);
		Assert.assertEquals(triangle.getMessage(), sumAB);
	}
	
	@Test
	public void test_SumAC() {
		double a = 1;
		double b = 10;
		double c = 2;
		String sumAC = "a+c<=b";
		
		Triangle triangle = new Triangle(a, b, c);
		Assert.assertEquals(triangle.checkTriangle(), false);
		Assert.assertEquals(triangle.getMessage(), sumAC);
	}
	
	@Test
	public void test_SumBC() {
		double a = 10;
		double b = 1;
		double c = 2;
		String sumBC = "b+c<=a";
		
		Triangle triangle = new Triangle(a, b, c);
		Assert.assertEquals(triangle.checkTriangle(), false);
		Assert.assertEquals(triangle.getMessage(), sumBC);
	}
}
