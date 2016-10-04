package lesson01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PersonInput {

	public String inputString() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inString = null;
		try {
			inString = br.readLine();
		} catch (Exception e) {
			System.out.println("Not valid data. Please, input string data.");
		}
		return inString;
	}

	public int inputInt() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inInt = 0;
		try {
			inInt = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Not valid data. Please, input integer number.");
		}
		return inInt;
	}
}
