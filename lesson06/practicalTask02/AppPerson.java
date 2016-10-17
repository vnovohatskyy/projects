package lesson06.practicalTask02;

import java.util.ArrayList;
import java.util.List;

/* Create next structure. In abstract class Person with property name, declare abstract method 
 * print(). In other classes in body of method print() output text “I am a …”. In class Staff 
 * declare abstract method salary(). In each concrete class create constant TYPE_PERSON. Output 
 * type of person in each constructors. Create array of Person and add some Teachers, Cleaners 
 * and Students to it. Call method print() for all of it. Call method salary() for all Teachers 
 * and Cleaner
 */

public class AppPerson {

	public static void main(String[] args) {
		Person person1 = new Student("Ann");
		Person person2 = new Student("Ben");
		Person person3 = new Student("Sam");

		Person person4 = new Teacher();
		person4.setName("Peter");
		((Staff) person4).setSalary(3120);
		Person person5 = new Teacher("Kate", 2900);
		Person person6 = new Teacher("Alison", 2870);
		Person person7 = new Cleaner("Alex", 1980);
		Person person8 = new Cleaner("Ostin", 1670);
		Person person9 = new Cleaner("Justin", 1530);
		List<Person> list = new ArrayList<>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		list.add(person5);
		list.add(person6);
		list.add(person7);
		list.add(person8);
		list.add(person9);

		for (Person in : list) {
			System.out.println(in);
			System.out.println(in.print());
			if (in instanceof Staff) {
				System.out.println("My salary  is: (USD) " + ((Staff) in).salary());
			}
			System.out.println();
		}
	}

}
