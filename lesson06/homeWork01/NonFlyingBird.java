package lesson06.homeWork01;

public class NonFlyingBird extends Bird {

	protected String plaseOfResidens;

	public NonFlyingBird() {
	}

	public NonFlyingBird(String plaseOfResidens, String feathers, int layEggs) {
		super(feathers, layEggs);
		this.plaseOfResidens = plaseOfResidens;
	}

	public String getPlaseOfResidens() {
		return plaseOfResidens;
	}

	public void setPlaseOfResidens(String plaseOfResidens) {
		this.plaseOfResidens = plaseOfResidens;
	}

	@Override
	public String fly() {
		return "I can't fly.";
	}

}
