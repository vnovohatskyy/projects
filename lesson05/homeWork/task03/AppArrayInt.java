package lesson05.homeWork.task03;

/*Enter 5 integer numbers. Find 
position of second positive number;
minimum and its position in the array.
 */
public class AppArrayInt {

	public static void main(String[] args) {
		ArrayInt arrayInt = new ArrayInt();
		int[] values = { -3, 2, -1, -1, -8, 3 };
		int[] values2 = { 10, 2, 3, 1, 9, 4 };

		System.out.println(
				"The position of second positive number in the array1 is: " + arrayInt.getPositiveIndex(values, 2));
		System.out.println(
				"The position of second positive number in the array2 is: " + arrayInt.getPositiveIndex(values2, 2));
		System.out.println("====================================================================");
		System.out.println("The minimum of the array1 is: " + arrayInt.getMinimumNumber(values) + ", its' position is "
				+ arrayInt.getArrayIndex(values, arrayInt.getMinimumNumber(values)));
		System.out.println("The minimum of the array2 is: " + arrayInt.getMinimumNumber(values2) + ", its' position is "
				+ arrayInt.getArrayIndex(values, arrayInt.getMinimumNumber(values2)));

	}

}
