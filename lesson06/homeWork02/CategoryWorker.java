package lesson06.homeWork02;

public enum CategoryWorker {

	JUNIOR(1800), MIDDLE(2500), SENIOR(3600);

	private int salary;

	CategoryWorker(int salary) {
		this.setSalary(salary);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}