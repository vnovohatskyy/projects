package lesson05.homeWork.task05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Create class Car with fields type, year of production and engine capacity. Create and initialize
 *four instances of class Car. Display cars certain model year  (enter year in the console);
ordered by the field year.
 */

public class AppCar {
	public static void main(String[] args) {

		Car car1 = new Car("Dodge", (double) 2.4);
		System.out.println("Please input year of production " + car1.getType() + ":");
		car1.setYearOfProduction((car1.inputInt()));
		;

		Car car2 = new Car("Jeep", (double) 2.8);
		System.out.println("Please input year of production " + car2.getType() + ":");
		car2.setYearOfProduction((car2.inputInt()));
		;

		Car car3 = new Car("Honda", (double) 1.8);
		System.out.println("Please input year of production " + car3.getType() + ":");
		car3.setYearOfProduction((car3.inputInt()));
		;

		Car car4 = new Car("Toyota", (double) 2.0);
		System.out.println("Please input year of production " + car4.getType() + ":");
		car4.setYearOfProduction((car4.inputInt()));
		;

		Car car5 = new Car("Ford", (double) 4.2);
		System.out.println("Please input year of production " + car5.getType() + ":");
		car5.setYearOfProduction((car5.inputInt()));
		;
		System.out.println();

		List<Car> list = new ArrayList<>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		list.add(car4);
		list.add(car5);

		System.out.println("The cars are:");
		Collections.sort(list, Car.yearSort);
		for (Car in : list) {
			System.out.println(in);
		}
	}
}
