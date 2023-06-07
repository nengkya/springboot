import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class JavaTimeFormatDateTimeFormatter {

	public static void main(String[] arguments) {

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);		

		/*
		ISO_OFFSET_DATE 	ISO Date with offset 			'2011-12-03+01:00'
		ISO_DATE 			ISO Date with or without offset '2011-12-03+01:00'; '2011-12-03'
		*/
		String localDateString = localDate.format(DateTimeFormatter.ISO_DATE);
		System.out.println(localDateString);

	}

}
