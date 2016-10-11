package lesson05.homeWork.task02;

public class AppCalculation {

	/*
	 * Enter 10 integer numbers. Calculate the sum of first 5 elements if they
	 * are positive or product of last 5 element in the other case.
	 */

	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		int[] values = { 5, 4, 10, 11, 2, 7, -3, -9, 12, 7 };
		int[] values2 = { 3, -1, 7, 9, -11, 6, 28, 13, 19, -4 };
		calculation.calc(values);
		calculation.calc(values2);

	}

}
