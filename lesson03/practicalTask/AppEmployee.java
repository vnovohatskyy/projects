package lesson03.practicalTask;

import java.util.ArrayList;
import java.util.List;

/*
 * Create Console Application project in Java.
Add class Employee to the project.
Class Employee should consists of
	three private fields: name, rate and hours; 
	static field totalSum
	properties for access to these fields;
	default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
	methods:
salary - to calculate the salary of person (rate * hours)
toString - to output information about employee
changeRate - to change the rate of employee
bonuses – to calculate 10% from salary
In the method main() create 3 objects of Employee type. Input information about them. 
Display the total hours of all workers to screen

 * 
 */

public class AppEmployee {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Ann", 8.5, 160);
		Employee employee2 = new Employee("Ben", 6.5, 115);
		Employee employee3 = new Employee("Den", 4.5, 121);
		Employee employee4 = new Employee("Devid", 10.4, 82);
		Employee employee5 = new Employee("Kelvin", 7.8, 101);
		Employee employee6 = new Employee("Ostin", 5.5, 141);
		Employee employee7 = new Employee("Alex", 8.7, 138);

		List<Employee> list = new ArrayList<Employee>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);
		list.add(employee7);
		for (Employee in : list) {
			System.out.println(in);
		}
		System.out.println("=========================================================================");
		System.out.printf("Total hours of all employees are: " + "%.2f", Employee.totalHours);
		System.out.println();
		System.out.printf("Total salary of all employees are: " + "%.2f", Employee.totalSum);
		System.out.println();
		System.out.printf("Total bonuses of all employees are: " + "%.2f", Employee.totalBonuses);

	}
}
