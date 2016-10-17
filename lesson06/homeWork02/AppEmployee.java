package lesson06.homeWork02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Create an interface to the method calculatePay(), the base class Employee with a string variable 
 * employeeld. Create two classes SalariedEmployee and ContractEmployee, which implement interface and are 
 * inherited from the base class. 
 * Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers 
 * (second child). 
 * Describe the string variable socialSecurityNumber in the class SalariedEmployee .
 * Include a description of federalTaxIdmember in the class of contractEmployee .
 * The calculation formula for the "time-worker“ is: "the average monthly salary = hourly rate * number of 
 * hours worked"
 * For employees with a fixed payment the formula is: "the average monthly salary = fixed monthly payment“
 * Create an array of employees and add the employees with different form of payment.
 * Arrange the entire sequence of workers descending the average monthly wage. Output the employee ID, name, 
 * and the average monthly wage for all elements of the list.
 */
public class AppEmployee {

	public static void main(String[] args) {

		Employee employee1 = new SalariedEmployee("Nick", 195045, CategoryWorker.JUNIOR);
		Employee employee2 = new SalariedEmployee("Julie", 183579445, CategoryWorker.SENIOR);
		Employee employee3 = new SalariedEmployee("Peter", 1750454365, CategoryWorker.MIDDLE);
		Employee employee4 = new ContractEmployee("Alex", 2010454365, 160, RatesPerHour.FIRST);
		Employee employee5 = new ContractEmployee("Ann", 215045443, 120, RatesPerHour.SECOND);
		Employee employee6 = new ContractEmployee("Ben", 00012132143, 145, RatesPerHour.THIRD);

		List<Pay> list = new ArrayList<Pay>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);
		Collections.sort(list, CompareSalary.SalarySort);
		for (Pay in : list) {
			System.out.println(in);
			if (in instanceof SalariedEmployee) {
				System.out.println("Salary is: " + ((SalariedEmployee) in).calculatePay());
			}
			if (in instanceof ContractEmployee) {
				System.out.println("Salary is: " + ((ContractEmployee) in).calculatePay());
			}

		}
	}
}