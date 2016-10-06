package lesson03.example;

import java.util.ArrayList;
import java.util.List;



/*
 * Create Console Application project in Java.
Add class Student to the project.
Class Student should consists of
	two private fields: name and rating; 
	properties for access to these fields
	static field avgRating – average rating of all students
	default constructor and constructor with parameters 
	methods:
	betterStudent - to definite the better student (between two, return true or false)
	toString - to output information about student
	changeRating - to change the rating of student
In the method main() create 3 objects of Student type and input information about them.
Display the average and total rating of all student.

 */
public class StudentRating {

	public static void main(String[] args) {
		Student student1 = new Student("Ann", 3);
		Student student2 = new Student("Ben", 2);
		Student student3 = new Student("Den", 4);

		List<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		for (Student in : list) {
			System.out.println(in);
		}
		System.out.println("===================================================================");
		System.out.println("Student " + student1.getName() + " is better than student " + student2.getName() + ": "
				+ student1.betterStudent(student2));
		System.out.println("Student " + student2.getName() + " is better than student " + student3.getName() + ": "
				+ student2.betterStudent(student3));
		System.out.println("Student " + student3.getName() + " is better than student " + student1.getName() + ": "
				+ student3.betterStudent(student1));
		System.out.println("====================================================================");
		System.out.println("The total rating of the students is: "+Student.sumRating);
		System.out.println("The avarage rating of the students is: "+Student.sumRating/Student.countStudent);

	}
}
