package lesson01;

public class Person {
	PersonInput personInput = new PersonInput();
	String name;
	int age;
	String adress;

	public String inputName() {
		System.out.println("What is your name?");

		name = personInput.inputString();

		return name;
	}

	public String inputAdress() {
		System.out.println("What is your adress?");
		adress = personInput.inputString();
		return adress;
	}

	public int inputAge() {
		System.out.println("What is your age?");
		age = personInput.inputInt();
		return age;
	}

}