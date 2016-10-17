package lesson06.homeWork02;

public class SalariedEmployee extends Employee implements Pay {

	private CategoryWorker categoryWorker;

	public SalariedEmployee() {
	}

	public SalariedEmployee(String name, int EmployeeID, CategoryWorker categoryWorker) {
		super(name, EmployeeID);
		this.categoryWorker = categoryWorker;
	}

	public CategoryWorker getCategoryWorker() {
		return categoryWorker;
	}

	public void setCategoryWorker(CategoryWorker categoryWorker) {
		this.categoryWorker = categoryWorker;
	}

	@Override
	public double calculatePay() {
		return categoryWorker.getSalary();
	}

}
