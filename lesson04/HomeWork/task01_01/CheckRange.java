package lesson04.HomeWork.task01_01;

public class CheckRange {
	private float number;

	public CheckRange() {
	}

	public CheckRange(float number) {
		this.number = number;

	}

	public float getNumber() {
		return number;
	}

	public void setNumber(float number) {
		this.number = number;
	}

	public boolean range() {
		float a = this.number;
		boolean temp = false;
		if (a >= -5 && a <= 5) {
			temp = true;
		} else {
			temp = false;
		}
		return temp;

	}

}
