package lesson03.practicalTask;

public class Employee {
	static double totalHours;
	static double totalSum;
	static double totalBonuses;
	private String name;
	private double rate;
	private double hours;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;

	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public Employee() {
		super();

	}

	public Employee(String name, double rate) {
		super();
		this.name = name;
		this.rate = rate;

	}

	public Employee(String name, double rate, double hours) {
		super();
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		Employee.totalHours = totalHours + this.hours;
		Employee.totalSum = totalSum + this.salary();
		Employee.totalBonuses = totalBonuses + this.bonus();
	}

	public double salary() {
		double val = this.rate * this.hours * 100;
		val = Math.round(val);
		val = val / 100;
		return val;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", rate=" + rate + ", hours=" + hours + ", salary=" + this.salary()
				+ ", bonus=" + this.bonus() + "]";
	}

	public void changeRate(double rate) {
		this.rate = rate;
	}

	public double bonus() {
		double val = salary() * 10;
		val = Math.round(val);
		val = val / 100;
		return val;
	}

}
