package lesson06.practicalTask02;

public abstract class Person {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public abstract String print();

	@Override
	public String toString() {
		return "My name is " + name + ".";
	}
}
