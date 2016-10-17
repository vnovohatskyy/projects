package lesson06.homeWork02;

public enum RatesPerHour {

	FIRST(18.5), SECOND(21), THIRD(23.5);

	private double rate;

	RatesPerHour(double rate) {
		this.setRate(rate);
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

}
