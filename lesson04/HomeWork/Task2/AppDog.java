package lesson04.HomeWork.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Ñreate class Dog with fields name, breed, age. 
Declare enum for field breed. 
Create 3 instances of type Dog. 
Check if there is no two dogs with the same name. 
Display the name and the kind of the oldest dog. 
 */
public class AppDog {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Charlie", 2, Breed.LABRADOR);
		Dog dog2 = new Dog("Chacki", 5, Breed.GERMAN_SHEPHERD);
		Dog dog3 = new Dog("Chacki", 1, Breed.DUCHSHUND);
		List<Dog> list = new ArrayList<>();
		list.add(dog1);
		list.add(dog2);
		list.add(dog3);
		Collections.sort(list, Dog.ageSort);
		for (Dog in : list) {
			System.out.println(in);
		}
		System.out.println("The oldest dog is: " + list.get(list.size() - Dog.count));
		System.out.println("================================================================");
		System.out.println("The name of the dog " + dog1.getName() + " is equals the name of the dog " + dog2.getName()
				+ ": " + dog1.equals(dog2));

		System.out.println("The name of the dog " + dog2.getName() + " is equals the name of the dog " + dog3.getName()
				+ ": " + dog2.equals(dog3));

		System.out.println("The name of the dog " + dog3.getName() + " is equals the name of the dog " + dog1.getName()
				+ ": " + dog3.equals(dog1));
		System.out.println("================================================================");
		System.out.println("There is the same name of the dogs in the list: " + Dog.checkSameName(list));

	}
}
