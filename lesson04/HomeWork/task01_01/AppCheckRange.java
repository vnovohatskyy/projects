package lesson04.HomeWork.task01_01;

/* read 3 float numbers and check: are they all belong to the range [-5,5];
 */
public class AppCheckRange {

	public static void main(String[] args) {
		CheckRange checkRange1 = new CheckRange((float) 3.5);
		CheckRange checkRange2 = new CheckRange((float) -5.6);
		CheckRange checkRange3 = new CheckRange((float) 7.8);
		System.out.println("The float number " + checkRange1.getNumber() + " is belong to the range [-5,5] "
				+ checkRange1.range());
		System.out.println("The float number " + checkRange2.getNumber() + " is belong to the range [-5,5] "
				+ checkRange2.range());
		System.out.println("The float number " + checkRange3.getNumber() + " is belong to the range [-5,5] "
				+ checkRange3.range());

	}
}
