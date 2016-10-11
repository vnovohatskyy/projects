package lesson04.HomeWork.Task2;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestDog {

private Dog dog1;
private Dog dog2;
private Dog dog3;
	
	@Before
	public void runTest() {
		dog1 = new Dog("Charlie", 2, Breed.LABRADOR);
		dog2 = new Dog("Chacki", 5, Breed.GERMAN_SHEPHERD);
		dog3 = new Dog("Chacki", 1, Breed.DUCHSHUND);
		
	}
	
	@Test
	public void rangeTrue() {
		Assert.assertTrue(dog1.equals(dog1));
	}

	@Test
	public void rangeFalse() {
		Assert.assertFalse(dog1.equals(dog3));
	}
	
	@Test
	public void rangeTrue2() {
		List<Dog> list = new ArrayList<>();
		list.add(dog1);
		list.add(dog2);
		list.add(dog3);
		Assert.assertTrue(Dog.checkSameName(list));
	}
}
