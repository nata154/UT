package triangle_test;

import org.testng.annotations.Test;

import triangle.Triangle;

import org.testng.Assert;

public class Test_DetectTriangle {
	
	@Test (groups = {"rectangularTriangle"})
	public void test_isTriangleRectangularAll(){
		double a = 3;
		double b = 4;
		double c = 5;
		int TR_Rectangular = 8;
		//how to compare with variable in Triangle, not with this my variable.
		//if they change int in Triangle, i had to change it here. all variables.
		// maybe it should be static?
		
		Triangle triangle1 = new Triangle(a, b, c);
		Triangle triangle2 = new Triangle(b, c, a);
		Triangle triangle3 = new Triangle(a, c, b);
		Assert.assertTrue((triangle1.detectTriangle()==TR_Rectangular) || (triangle2.detectTriangle()==TR_Rectangular) || (triangle3.detectTriangle()==TR_Rectangular));
		}
	
	@Test (groups = {"rectangularTriangle"})
	public void test_isTriangleRectangularABC(){
		double a = 3;
		double b = 4;
		double c = 5;
		int TR_Rectangular = 8;
	
		Triangle triangle1 = new Triangle(a, b, c);
		Assert.assertTrue(triangle1.detectTriangle()==TR_Rectangular);
		}
	
	@Test (groups = {"rectangularTriangle"})
	public void test_isTriangleRectangularBCA(){
		double a = 5;
		double b = 3;
		double c = 4;
		int TR_Rectangular = 8;
	
		Triangle triangle2 = new Triangle(a, b, c);
		Assert.assertTrue(triangle2.detectTriangle()==TR_Rectangular);
		}
	
	@Test (groups = {"rectangularTriangle"})
	public void test_isTriangleRectangularACB(){
		double a = 3;
		double b = 5;
		double c = 4;
		int TR_Rectangular = 8;
				
		Triangle triangle3 = new Triangle(a, b, c);
		Assert.assertTrue(triangle3.detectTriangle()==TR_Rectangular);
	}
	
	@Test (groups = {"equilateralTriangle"})
	public void test_isTriangleEquilateralReturnedValueEquals(){
		double a = 4;
		double b = 4;
		double c = 4;
		int TR_Equilateral = 1;
		
		Triangle triangle1 = new Triangle(a, b, c);
		Assert.assertEquals(triangle1.detectTriangle(), TR_Equilateral);
		//returns 3! why?
		// if you try to change this and Triangle variable TR_Equilateral on 5, it returns 7.
		// it deplaces by 2 points. Why?
		}
	
	@Test (groups = {"equilateralTriangle"})
	public void test_isTriangleEquilateralReturnedValueTrue(){
		double a = 4;
		double b = 4;
		double c = 4;
		int TR_Equilateral = 1;
		
		Triangle triangle1 = new Triangle(a, b, c);
		Assert.assertTrue(triangle1.detectTriangle()==TR_Equilateral);
		//returns false! why?
		}
	
	@Test (groups = {"isoscelesTriangle"})
	public void test_isTriangleIsoscelesTrueAll(){
		double a = 4;
		double b = 4;
		double c = 5;
		int TR_Isosceles = 2;
		
		Triangle triangle1 = new Triangle(a, b, c);
		Triangle triangle2 = new Triangle(b, c, a);
		Triangle triangle3 = new Triangle(a, c, b);
		Assert.assertTrue((triangle1.detectTriangle()==TR_Isosceles) || (triangle2.detectTriangle()==TR_Isosceles) || (triangle3.detectTriangle()==TR_Isosceles));
		}
	
	@Test (groups = {"ordinaryTriangle"})
	public void test_isTriangleOrdinary(){
		double a = 5;
		double b = 7;
		double c = 9;
		int TR_Ordinary = 4;
		
		Triangle triangle1 = new Triangle(a, b, c);
		Triangle triangle2 = new Triangle(b, c, a);
		Triangle triangle3 = new Triangle(a, c, b);
		Assert.assertTrue((triangle1.detectTriangle()==TR_Ordinary) || (triangle2.detectTriangle()==TR_Ordinary) || (triangle3.detectTriangle()==TR_Ordinary));
		}
	}
