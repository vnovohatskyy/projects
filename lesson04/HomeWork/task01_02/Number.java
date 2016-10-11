package lesson04.HomeWork.task01_02;

public class Number {
	private int number1;
	private int number2;
	private int number3;

	public Number() {
	}

	public Number(int number1, int number2, int number3) {
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getNumber3() {
		return number3;
	}

	public void setNumber3(int number3) {
		this.number3 = number3;
	}

	public int maxNumber() {
		int a = this.number1;
		int b = this.number2;
		int c = this.number3;
		int max;
		max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		return max;
	}

	public int minNumber() {
		int a = this.number1;
		int b = this.number2;
		int c = this.number3;
		int min;
		min = a < b ? (a < c ? a : c) : (b < c ? b : c);
		return min;
	}

}
