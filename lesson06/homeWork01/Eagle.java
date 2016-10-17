package lesson06.homeWork01;

public class Eagle extends FlyingBird {

	private double weight;

	public Eagle() {

	}

	public Eagle(String plaseOfResidens, String feathers, int layEggs, double weight) {
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
		return "I can fly!!!!!";
	}

	public String feature() {
		return "I am a bird of pray!!!";
	}

	@Override
	public String toString() {
		return "Eagle [weight=" + weight + ", plaseOfResidens=" + plaseOfResidens + ", feathers=" + feathers
				+ ", layEggs=" + layEggs + "]";
	}

}
