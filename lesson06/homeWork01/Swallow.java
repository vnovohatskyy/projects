package lesson06.homeWork01;

public class Swallow extends FlyingBird {

	private double weight;

	public Swallow() {

	}

	public Swallow(String plaseOfResidens, String feathers, int layEggs, double weight) {
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
		return "I am a migratory bird!!!";
	}

	@Override
	public String toString() {
		return "Swallow [weight=" + weight + ", plaseOfResidens=" + plaseOfResidens + ", feathers=" + feathers
				+ ", layEggs=" + layEggs + "]";
	}

}
