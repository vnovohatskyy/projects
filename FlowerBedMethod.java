package lesson01;

public class FlowerBedMethod {
	double radius;

	public FlowerBedMethod() {
		FlowerBedInput flowerBedInput = new FlowerBedInput();
		this.radius = flowerBedInput.input();
	}

	public double circleArea() {
		double s;
		s = Math.PI * (radius * radius);
		return s;
	}

	public double circlePerimeter() {
		double s;
		s = 2 * Math.PI * radius;
		return s;
	}
}
