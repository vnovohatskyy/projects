package lesson06.practicalTask02;

public class Cleaner extends Staff {

	final static String TypePerson = "cleaner";

	public Cleaner(String name, double salary) {
		super(name, salary);
		System.out.println(TypePerson);
	}

	public Cleaner() {
		System.out.println(TypePerson);
	}

	@Override
	public double salary() {
		return this.salary;
	}

	@Override
	public String print() {
		return "I am a " + TypePerson + ".";
	}

}
