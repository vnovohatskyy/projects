package lesson06.homeWork01;

public class Chicken extends NonFlyingBird {

	private double weight;

	public Chicken() {

	}

	public Chicken(String plaseOfResidens, String feathers, int layEggs, double weight) {
		super(plaseOfResidens, feathers, layEggs);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String fly() {
		return "I can't fly.";
	}

	public String feature() {
		return "I am poultry!!!";
	}

	@Override
	public String toString() {
		return "Chicken [weight=" + weight + ", plaseOfResidens=" + plaseOfResidens + ", feathers=" + feathers
				+ ", layEggs=" + layEggs + "]";
	}
}
