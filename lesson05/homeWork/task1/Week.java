package lesson05.homeWork.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Week {

	static final int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private int numberMonth;

	public Week() {
		super();
	}

	public Week(int numberMonth) {
		this.numberMonth = numberMonth;
	}

	public int getNumberMonth() {
		return numberMonth;
	}

	public void setNumberMonth(int numberMonth) {
		this.numberMonth = numberMonth;
	}

	public int inputInt() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please input the number of month: ");
		int inInt = 0;
		try {
			inInt = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Not valid data. Please, input integer number.");
		}
		if (inInt < 1 | inInt > 12) {
			System.out.println("There is no such month. Please input correct number of month");
		}
		return inInt;
	}

	public void switchDays() {
		switch (numberMonth) {
		case 1:
			System.out.println("The number of days in January is: " + monthDays[0]);
			break;
		case 2:
			System.out.println("The number of days in February is: " + monthDays[1]);
			break;
		case 3:
			System.out.println("The number of days in March is: " + monthDays[2]);
			break;
		case 4:
			System.out.println("The number of days in April is: " + monthDays[3]);
			break;
		case 5:
			System.out.println("The number of days in May is: " + monthDays[4]);
			break;
		case 6:
			System.out.println("The number of days in June is: " + monthDays[5]);
			break;
		case 7:
			System.out.println("The number of days in July is: " + monthDays[6]);
			break;
		case 8:
			System.out.println("The number of days in August is: " + monthDays[7]);
			break;
		case 9:
			System.out.println("The number of days in September is: " + monthDays[8]);
			break;
		case 10:
			System.out.println("The number of days in October is: " + monthDays[9]);
			break;
		case 11:
			System.out.println("The number of days in November is: " + monthDays[10]);
			break;
		case 12:
			System.out.println("The number of days in December is: " + monthDays[11]);
			break;
		}

	}
}
