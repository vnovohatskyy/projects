package lesson06.practicalTask02;

public abstract class Staff extends Person {
	protected double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Staff() {
		super();
	}

	public Staff(String name, double salary) {
		super(name);
		this.salary = salary;
	}

	public abstract double salary();

}
