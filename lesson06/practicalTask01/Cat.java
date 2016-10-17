package lesson06.practicalTask01;

public class Cat implements Animal {

	private String name;

	public Cat() {
	}

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String voice() {
		return "Meow!!! Meow!!! Meow!!!";
	}

	@Override
	public String feed() {
		return "I like fish, big fish....Give me some fish!!!!!!";
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}

}
