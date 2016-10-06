package lesson03.homeWork;

import java.util.ArrayList;
import java.util.List;
/*
 * Create Console Application project in Java.
Add class Person to the project.
Class Person should consists of
two private fields: name and birthYear (the birthday year) 
properties for access to these fields
default constructor and constructor with 2 parameters 
methods:
age - to calculate the age of person
input - to input information about person
output - to output information about person
changeName - to change the name of person
In the method main() create 5 objects of Person type and input information about them.

 */

public class AppPerson {
	public static void main(String[] args) {
		PersonData person1 = new PersonData("Ann", 1960, 12, 31);
		PersonData person2 = new PersonData("Ben", 1948, 3, 28);
		PersonData person3 = new PersonData("Sam", 1978, 6, 30);
		PersonData person4 = new PersonData("Kate", 1999, 5, 28);
		PersonData person5 = new PersonData("Peter", 2005, 3, 7);
		PersonData person6 = new PersonData();
		person6.inputData("Katia", 1990, 11, 28);
		person6.changeName("Oscar");
		System.out.println(person1.outputData());

		List<PersonData> list = new ArrayList<PersonData>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		list.add(person5);
		list.add(person6);
		for (PersonData in : list) {
			System.out.println(in);
		}

	}

}
