import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateExample {

	public static void main(String[] arguments) {

		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow  = yesterday.plusDays(2);
		LocalDate theDayAfterTomorrow = date.plusDays(2);

		LocalDate date1 = LocalDate.of(2017, 1,  3);
		LocalDate date2 = LocalDate.of(2016, 9, 23);

		LocalDateTime datetime = date1.atTime(1, 50, 9);

		System.out.println("Today date     : " + date);
		System.out.println("Yesterday date : " + yesterday);
		System.out.println("Tomorrow date  : " + tomorrow);

		System.out.println(date1);
		System.out.println(date1.atTime(1, 50, 9));
		System.out.println(date1.isLeapYear());
		System.out.println(date2.isLeapYear());

	}

}
