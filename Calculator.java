package lesson01;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Calculator {
	/*
	 * Create Console Application project in Java.
	In method main() write code for solving next tasks:
	Define integer variables a and b. Read values a and b from Console and calculate: 
	a + b, a - b, a * b, a / b. 
	Output obtained results.
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an integer variable a");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Enter an integer variable b");
		int b=Integer.parseInt(br.readLine());
						
				int pl=plus(a,b);
				System.out.println("The sum of the numbers "+a+" and "+b+" is "+pl);
				
				int min=minus(a,b);
				System.out.println("the result of subtraction between the numbers "+a+" and "+b+" is "+min);
				
				int mult=multiplication(a,b);
				System.out.println("the result of multiplying the numbers "+a+" and "+b+" is "+mult);
				
				String div=division(a,b);
				System.out.println(div);
				
				
			}
		public static  int plus(int p1, int p2){
			int s;
			s=p1+p2;
			return s;
		}
		public static int minus(int p1, int p2){
			int s;
			s=p1-p2;
			return s;
		}
		public static int multiplication(int p1, int p2){
			int s;
			s=p1*p2;
			return s;
		}
		public static String division(int p1, int p2){
			if (p2!=0){	
			String s="the ratio of the numbers "+p1+" and "+p2+" is "+p1/p2;
			return s;}
			else{String s2="Not divide by zero!";
			return s2;}
			}

}
