package lesson06.practicalTask01;

public class Dog implements Animal {

	private String name;

	public Dog() {
	}

	public Dog(String name) {
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
		return "Wow!!! Wow!!! Wow!!!";
	}

	@Override
	public String feed() {
		return "I like meat!!!!! Give me some meat!!!!!!!!!!";
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

}
