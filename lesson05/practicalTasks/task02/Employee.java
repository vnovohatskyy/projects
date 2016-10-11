package lesson05.practicalTasks.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;

public class Employee {
	private String name;
	private int departmentNumber;
	private double salary;

	public Employee() {

	}

	public Employee(String name, int departmentNumber, double salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int inputInt() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inInt = 0;
		try {
			inInt = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Not valid data. Please, input integer number.");
		}
		return inInt;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", departmentNumber=" + departmentNumber + ", salary=" + salary + "]";
	}

	public static Comparator<Employee> salarySort = new Comparator<Employee>() {
		public int compare(Employee s1, Employee s2) {
			int salary1 = (int) s1.getSalary();
			int salary2 = (int) s2.getSalary();
			return salary2 - salary1;
		}
	};
}
