package lesson01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NameAdress {
	/*
	 * Create console application. In method main() write code for solving next tasks:
	 * Define string variable name and integer value age. Output question "What is your name?" 
	 * Read the value name and output next question: “Where are you live, (name)?". Read address 
	 * and write whole information.
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(
			    new InputStreamReader(System.in));
		
		System.out.println("What is your name?");
		String name = br.readLine();
		
		System.out.println("What is your age?");
		int age = Integer.parseInt(br.readLine()); 
		
		System.out.println("Where are you live?");
		String adress = br.readLine();
		
		
		System.out.println("Hello, your name is "+name+".");
		System.out.println("Your age is "+age+".");
		System.out.println("Your adress is "+adress+".");
	}

}
