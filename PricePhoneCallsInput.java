package lesson01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PricePhoneCallsInput {

	public double input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double var = 0;

		try {
			var = Double.parseDouble(br.readLine());
		} catch (Exception e) {
			System.out.println("Not valid data");
		} 
		return var;
	}

}
