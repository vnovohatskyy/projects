package lesson06.homeWork02;

public class ContractEmployee extends Employee implements Pay {

	private double hours;
	private RatesPerHour rates;

	public ContractEmployee() {
	}

	public ContractEmployee(String name, int employeeId, double hours, RatesPerHour rates) {
		super(name, employeeId);
		this.hours = hours;
		this.rates = rates;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public RatesPerHour getRates() {
		return rates;
	}

	public void setRates(RatesPerHour rates) {
		this.rates = rates;
	}

	@Override
	public double calculatePay() {
		return rates.getRate() * hours;
	}

}
