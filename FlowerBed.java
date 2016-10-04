package lesson01;

public class FlowerBed {

	/*
	 * Create console application. In method main() write code for solving next
	 * tasks: Flower bed is shaped like a circle. Calculate the perimeter and
	 * area by entering the radius. Output obtained results.
	 */

	public static void main(String[] args) {

		FlowerBedMethod flowerBed = new FlowerBedMethod();

		System.out.println("The Flower Bed area is: "+flowerBed.circleArea());
		System.out.println("The Flower Bed perimeter is: "+flowerBed.circlePerimeter());

	}

}
