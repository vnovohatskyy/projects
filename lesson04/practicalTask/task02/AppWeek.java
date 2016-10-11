package lesson04.practicalTask.task02;

/*Enter the number of the day of the week. Display the name in three languages.
 */
public class AppWeek {

	public static void main(String[] args) {
		Week week = new Week();
		System.out.println("Please enter a day of week:");
		week.setDay(week.inputInt());
		System.out.println(week.inDay(week.getDay()));

	}

}
