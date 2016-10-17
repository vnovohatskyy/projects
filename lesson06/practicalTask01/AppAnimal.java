package lesson06.practicalTask01;

import java.util.ArrayList;
import java.util.List;

/* Create interface Animal with methods voice() and feed(). Create two classes Cat and Dog, 
 * which implement this interface. Create array of Animal and add some Cats and Dogs to it. 
 * Call voice() and feed() method for all of it
 */

public class AppAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Cat("Cookie");
		Animal animal2 = new Cat("Masya");
		Animal animal3 = new Dog("Kolly");
		Animal animal4 = new Dog("Charly");

		List<Animal> list = new ArrayList<>();
		list.add(animal1);
		list.add(animal2);
		list.add(animal3);
		list.add(animal4);
		for (Animal in : list) {
			System.out.println(in);
			System.out.println(in.voice());
			System.out.println(in.feed());
		}

	}

}
