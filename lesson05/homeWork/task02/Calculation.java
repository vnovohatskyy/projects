package lesson05.homeWork.task02;

public class Calculation {

	public Calculation() {
	}

	public void calc(int[] values) {
		int sum;
		if (values[0] > 0 & values[1] > 0 & values[2] > 0 & values[3] > 0 & values[4] > 0) {
			sum = values[0] + values[1] + values[2] + values[3] + values[4];
			System.out.println("The sum of first 5 elements is: " + sum);
		} else {
			sum = values[5] + values[6] + values[7] + values[8] + values[9];
			System.out.println("The product of last 5 elements is: " + sum);
		}

	}

}
