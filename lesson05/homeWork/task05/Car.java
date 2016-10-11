package lesson05.homeWork.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;

public class Car {
	private String type;
	private int yearOfProduction;
	private double engineCapacity;

	public Car() {

	}

	public Car(String type, double engineCapacity) {
		this.type = type;
		this.engineCapacity = engineCapacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public int inputInt() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inInt = 0;
		try {
			inInt = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Not valid data. Please, input integer number.");
		}
		return inInt;
	}

	public static Comparator<Car> yearSort = new Comparator<Car>() {
		public int compare(Car y1, Car y2) {
			int year1 = (int) y1.getYearOfProduction();
			int year2 = (int) y2.getYearOfProduction();
			return year2 - year1;
		}
	};

	@Override
	public String toString() {
		return "Car [type=" + type + ", yearOfProduction=" + yearOfProduction + ", engineCapacity=" + engineCapacity
				+ "]";
	}

}
