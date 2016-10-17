package lesson06.homeWork01;

public class Penguin extends NonFlyingBird {

	private double weight;

	public Penguin() {

	}

	public Penguin(String plaseOfResidens, String feathers, int layEggs, double weight) {
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
		return "I like to swim and to dive!!!";
	}

	@Override
	public String toString() {
		return "Penguin [weight=" + weight + ", plaseOfResidens=" + plaseOfResidens + ", feathers=" + feathers
				+ ", layEggs=" + layEggs + "]";
	}
}
