package lesson04.HomeWork.task01_03;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestError {

	private Error error;
	
	@Before
	public void runTest() {
		error = new Error(400);;
		
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(error.cont(), HttpError.BAD_REQUEST);
	}

	@Test
	public void test() {
		Assert.assertSame(HttpError.BAD_REQUEST, error.cont());
	}
}
