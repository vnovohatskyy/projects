package lesson01;

import java.io.IOException;

public class NameAdress {
	/*
	 * Create console application. In method main() write code for solving next
	 * tasks: Define string variable name and integer value age. Output question
	 * "What is your name?" Read the value name and output next question: “Where
	 * are you live, (name)?". Read address and write whole information.
	 */

	public static void main(String[] args) throws IOException {

		Person person = new Person();
		person.inputName();
		person.inputAge();
		person.inputAdress();
		System.out.println("Hello! Your name is: " + person.name+".");
		System.out.println("Your age is: " + person.age+".");
		System.out.println("Your adress is: " + person.adress+".");

	}
	

}
