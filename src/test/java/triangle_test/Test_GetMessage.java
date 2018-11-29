package triangle_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import triangle.Triangle;

public class Test_GetMessage {
	
		@Test
	public void test_getMessage() {
		String msg = "";
		Triangle triangle = new Triangle (2, 3, 4);
		Assert.assertEquals(triangle.getMessage(), msg);
	}

		@Test
	public void test_setMessage() {
		String msg = "Write msg";
		Triangle triangle = new Triangle (2, 3, 4);
		//Assert.assertEquals(triangle.setMessage(), msg);
		Assert.fail("There is no setMessage method. We can configure message only in checkTriangle method. What does the customer say?");
	}
}
