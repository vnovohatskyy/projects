package lesson03.example;

public class Student {

	static int countStudent;
	static int sumRating;
	private String name;
	private int rating;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;

	}

	public Student() {
		countStudent++;
		Student.sumRating = sumRating + this.rating;
	}

	public Student(String name, int rating) {
		super();
		this.name = name;
		this.rating = rating;
		countStudent++;
		Student.sumRating = sumRating + this.rating;
	}

	public boolean betterStudent(Student student) {
		if (this.rating > student.getRating()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rating=" + rating + "]";
	}

	public void changeRating(int rating) {
		this.rating = rating;
		
	}

}
