package by.epam.task1.test;

import org.junit.Assert;
import org.junit.Test;

import by.epam.task1.code.MainFormula;

public class TestCountFormula {
	@Test
	public void testForZeroes() {
		double x = 0.0;
		double y = 0.0;
		double expected = 0.5;
		double actual = MainFormula.countFormula(x, y);
		
		Assert.assertEquals(expected, actual, 0.00000001);
		
	}
	
}
