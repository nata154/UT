package triangle_test;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import triangle.Triangle;

public class Tst_TriangleDataProvider { //to try writing dataProvider
	
	@DataProvider (name = "dataProviderSidesOfTriangle")
	public Object [][] createSomeData(){
		return new Object [][]
				{
			{new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0)) },
			{new ArrayList<Double>(Arrays.asList(3.0, 4.0, 5.0)) },
			{new ArrayList<Double>(Arrays.asList(300000000.0, 40000000.0, 50000000.0)) },
				};
	}
	
	@Test(dataProvider = "dataProviderSidesOfTriangle")
	public void test_getSquareDataProvider(ArrayList<Double> parameters) {
		Double side_a = (Double) parameters.get(0);
		Double side_b = (Double) parameters.get(1);
		Double side_c = (Double) parameters.get(2);
		
		double p = (side_a + side_b + side_c)/2;
		double expSquare = Math.sqrt(p*(p-side_a)*(p-side_b)*(p-side_c));
		
		Triangle triangle = new Triangle(side_a, side_b, side_c);
		Assert.assertEquals(triangle.getSquare(), expSquare);
	}
}
