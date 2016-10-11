package lesson05.homeWork.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IntNumber {
	static int sumEven;
	private int number;

	public IntNumber() {
	}

	public IntNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int inputInt() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the first integer number: ");
		try {
			this.number = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Not valid data. Please, input integer number.");
		}
		while (this.number >= 0) {
			if (this.number % 2 == 0) {
				sumEven += this.number;
			}
			System.out.print("Enter your next integer number: ");
			try {
				this.number = Integer.parseInt(br.readLine());
			} catch (Exception e) {
				System.out.println("Not valid data. Please, input integer number.");
			}

		}

		return sumEven;
	}

}
