package lesson04.practicalTask.task01;

public class OddEven {
	private int number;

	public OddEven() {
	}

	public OddEven(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String methodOddEven() {
		String type;
		if (this.number % 2 == 0) {
			type = "even";
		} else {
			type = "odd";
		}
		return type;

	}

	@Override
	public String toString() {
		return "The number " + number + " is " + methodOddEven() + ";";
	}

}
