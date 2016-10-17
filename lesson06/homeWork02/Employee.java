package lesson06.homeWork02;

public abstract class Employee implements Pay {
	protected String name;
	protected int employeeId;

	public Employee() {
	}

	public Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + "]";
	}

}
