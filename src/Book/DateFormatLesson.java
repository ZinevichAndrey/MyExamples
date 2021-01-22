package Book;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateFormatLesson {


	public static void main(String[] args) throws ParseException, InterruptedException {

		Date date = new Date();
		System.out.println(date);
		TimeUnit.MILLISECONDS.sleep(1000);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println(calendar.getTime());
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(dateFormat.format(calendar.getTime()));
		String myDay = "10.09.1989";
		SimpleDateFormat simpleFormat = new SimpleDateFormat("dd.MM.yyyy");
		simpleFormat.format(date);
		Date newDate = simpleFormat.parse("07.12.1894");
		System.out.println(simpleFormat.format(newDate));
		System.out.println(simpleFormat.format(calendar.getTime()));
		Date dayWeek = null;
		dayWeek = simpleFormat.parse(myDay);	
		System.out.println(new SimpleDateFormat("EEEE").format(dayWeek));

	}


}
