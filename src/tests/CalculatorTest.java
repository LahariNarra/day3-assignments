package tests;
import org.junit.Test;
import main.Calculator;
import static org.junit.Assert.*;

public class CalculatorTest
{
	@Test
	public void testAddforPsitiveNumbers()
	{
		assertEquals(40,new Calculator().addition(30,10));
	}
}