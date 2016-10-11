package lesson05.homeWork.task04;

import java.io.IOException;


/* Organize entering integers until the first negative number. Count the product of all entered 
 * even numbers.
 */
public class AppIntNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		IntNumber intNumber=new IntNumber();
		intNumber.inputInt();   
      	System.out.println("The product of all entered integer even numbers is: " + IntNumber.sumEven);
	}
}