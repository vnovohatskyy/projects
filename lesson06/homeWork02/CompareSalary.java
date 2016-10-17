package lesson06.homeWork02;

import java.util.Comparator;

public class CompareSalary {
	public static Comparator<Pay> SalarySort = new Comparator<Pay>() {
		public int compare(Pay s1, Pay s2) {
			int salary1 = (int) s1.calculatePay();
			int salary2 = (int) s2.calculatePay();
			return salary2 - salary1;
		}
	};
}
