package lesson06.practicalTask02;

public class Student extends Person {

	final static String TypePerson = "student";

	public Student(String name) {
		super(name);
		System.out.println(TypePerson);
	}

	public Student() {
		System.out.println(TypePerson);
	}

	@Override
	public String print() {
		return "I am a " + TypePerson + ".";
	}

}
