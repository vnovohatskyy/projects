package lesson01;

import java.util.Scanner;

public class FlowerBedInput {

	public double input() {
		Scanner sc = new Scanner(System.in);
		double radius = 0;

		try {
			System.out.print("Enter the radius: ");
			radius = sc.nextDouble();
		} catch (Exception e) {
			System.out.println("Not valid data");
		} finally {
			sc.close();
		}

		return radius;
	}
}