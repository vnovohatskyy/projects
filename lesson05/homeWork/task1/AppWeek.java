package lesson05.homeWork.task1;


import java.io.IOException;


/* Ask user to enter the number of month. Read the value and write the amount of days in this 
 * month (create array with amount days of each month).
 */
public class AppWeek {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Week week = new Week();
		week.setNumberMonth(week.inputInt());
		week.switchDays();
}
}
