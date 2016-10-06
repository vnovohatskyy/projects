package lesson03.homeWork;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PersonData {
	private String name;
	private LocalDate birthDate;

	public PersonData() {

	}

	public PersonData(String name, int year, int month, int day) {
		this.name = name;
		this.birthDate = LocalDate.of(year, month, day);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getLocalDate() {
		return birthDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.birthDate = localDate;
	}

	public long calculateAge() {
		LocalDate start = birthDate;
		LocalDate end = LocalDate.now();
		long years = ChronoUnit.YEARS.between(start, end);
		return years;
	}

	public void inputData(String name, int year, int month, int day) {
		this.name = name;
		birthDate = LocalDate.of(year, month, day);
	}

	public String outputData() {
		String data = this.name + this.birthDate;
		return data;
	}

	public void changeName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonData [name=" + name + ", birth date=" + birthDate + ", calculateAge=" + calculateAge() + "]";
	}
}
