package lesson04.practicalTask.task01;

/* Enter three numbers. Find out how many of them are odd.
 */
public class AppOddEven {

	public static void main(String[] args) {
		OddEven number1 = new OddEven(2);
		OddEven number2 = new OddEven(7);
		OddEven number3 = new OddEven(-8);
		System.out.println(number1.toString());
		System.out.println(number2.toString());
		System.out.println(number3.toString());
	}
}
