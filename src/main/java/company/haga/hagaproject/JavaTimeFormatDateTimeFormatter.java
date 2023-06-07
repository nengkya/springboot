import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class JavaTimeFormatDateTimeFormatter {

	public static void main(String[] arguments) {

		LocalDate localDate = LocalDate.now();

		String localDateString = localDate.format(DateTimeFormatter.ISO_DATE);

	}

}
