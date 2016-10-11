package lesson04.HomeWork.task01_02;

/* read 3 integer numbers and write max and min of them;
 */
public class MaxMinInt {

	public static void main(String[] args) {
		Number number = new Number(-3, 6, 8);
		System.out.println("The maximum number is: " + number.maxNumber());
		System.out.println("The minimum number is: " + number.minNumber());

	}

}
