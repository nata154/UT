package triangle_test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import triangle.Triangle;

public class Test_Constructor {
	
	double a = -5.0;
	double b = 4.0;
	double c = 5.0;
	
	@Test
	public void testConstructor_for_parameters() {
		
		//creating triangle with negative side
		Triangle triangle = new Triangle (a, b, c);
		assertEquals(-5.0, a);
		fail("Constructor creates triangle with negative side");
		//no getters and setters
	}
		
		//triangle doesn't exist
		@Test
		public void test_DoesTriangleExist() {
			Triangle triangle = new Triangle(1, 2, 2);
			assertEquals(false, triangle.checkTriangle());
		}
}

