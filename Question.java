package lesson01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Question {
	/*
	 * Create Console Application project in Java.
	In method main() write code for solving next tasks:
	Output question �How are you?�. Define string variable answer. Read the value answer and 
	output: �You are (answer)".
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How are you?");
		String answer=br.readLine();
		System.out.println("You are "+answer);
	}

}
