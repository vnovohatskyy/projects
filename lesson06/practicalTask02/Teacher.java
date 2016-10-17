package lesson06.practicalTask02;

public class Teacher extends Staff {

	final static String TypePerson = "teacher";

	public Teacher(String name, double salary) {
		super(name, salary);
		System.out.println(TypePerson);
	}

	public Teacher() {
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
