package lesson04.HomeWork.Task2;

import java.util.Comparator;
import java.util.List;

public class Dog {
	static int count;
	private String name;
	private int age;
	private Breed breed;

	public Dog() {
		count++;
	}

	public Dog(String name, int age, Breed breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + " breed " + breed + "]";
	}

	public static Comparator<Dog> ageSort = new Comparator<Dog>() {
		public int compare(Dog q1, Dog q2) {
			int age1 = (int) q1.getAge();
			int age2 = (int) q2.getAge();
			return age2 - age1;
		}
	};

	public static boolean checkSameName(List<Dog> list) {

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i).getName().equalsIgnoreCase(list.get(j).getName())) {
					return true;
				}
			}
		}
		return false;
	}

}
