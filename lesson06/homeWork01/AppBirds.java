package lesson06.homeWork01;

import java.util.ArrayList;
import java.util.List;

/* Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().  
 * Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken. 
 * Create array Bird and add different birds to it. Call fly() method for allof it. 
 * Output the information about each type of created bird.
 */
public class AppBirds {

	public static void main(String[] args) {
		Bird bird1 = new Eagle("Asia", "dark brown", 3, (double) 3.5);
		Bird bird2 = new Swallow("Europe", "dark blue", 5, (double) 0.2);
		Bird bird3 = new Penguin("Antarctica", "white and black", 1, (double) 35);
		Bird bird4 = new Chicken("Europe", "yellow", 0, (double) 2.5);

		List<Bird> list = new ArrayList<>();
		list.add(bird1);
		list.add(bird2);
		list.add(bird3);
		list.add(bird4);
		for (Bird in : list) {
			System.out.println(in);
			System.out.println(in.fly());
			if (in instanceof Eagle) {
				System.out.println(((Eagle) in).feature());
			} else if (in instanceof Swallow) {
				System.out.println(((Swallow) in).feature());
			} else if (in instanceof Penguin) {
				System.out.println(((Penguin) in).feature());
			} else if (in instanceof Chicken) {
				System.out.println(((Chicken) in).feature());
			}
			System.out.println();
		}
	}
}
