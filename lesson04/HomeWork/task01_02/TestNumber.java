package lesson04.HomeWork.task01_02;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNumber {

	private Number number;
	
	@Before
	public void runTest() {
		number = new Number(-3, 6, 8);;
		
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(8, number.maxNumber());
	}

	@Test
	public void test2() {
		Assert.assertEquals(-3, number.minNumber());
	}
}
