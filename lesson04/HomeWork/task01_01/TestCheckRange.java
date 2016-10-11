package lesson04.HomeWork.task01_01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCheckRange {
	private CheckRange checkRange1;
	private CheckRange checkRange2;

	@Before
	public void runTest() {
		checkRange1 = new CheckRange((float) 3.5);
		checkRange2 = new CheckRange((float) -5.6);
	}

	@Test
	public void rangeTrue() {
		Assert.assertTrue(checkRange1.range());
	}

	@Test
	public void rangeFalse() {
		Assert.assertFalse(checkRange2.range());
	}

}
