package lesson05.practicalTasks.task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Create a class Employee with fields name, department number, salary. Create five objects of 
 * class Employee. Displayall employees of a certain department (enter department number in the 
 * console); arrange workers by the field salary in descending order.
 */
public class AppEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println("Please input the number of department: ");
		employee.setDepartmentNumber(employee.inputInt());
		Employee employee1 = new Employee("Nick", employee.getDepartmentNumber(), 3587);
		Employee employee2 = new Employee("Ann", employee.getDepartmentNumber(), 2890);
		Employee employee3 = new Employee("Sam", employee.getDepartmentNumber(), 3150);
		Employee employee4 = new Employee("Mary", employee.getDepartmentNumber(), 4800);
		Employee employee5 = new Employee("Peter", employee.getDepartmentNumber(), 4950);

		List<Employee> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		System.out.println("========================================================================");
		Collections.sort(list, Employee.salarySort);
		for (Employee in : list) {
			System.out.println(in);
		}
		System.out.println("========================================================================");

	}
}
