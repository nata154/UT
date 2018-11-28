package triangle_test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import triangle.Triangle;

public class Test_GetMessage {
	
	
	@Test
	public void test_getMessage() {
		String msg = "";
		Triangle triangle = new Triangle (2, 3, 4);
		assertEquals(msg, triangle.getMessage());
	}

}
