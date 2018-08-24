package week4.lesson8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExmple {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Date d = new Date();
		Calendar c = new GregorianCalendar();
		Calendar c2 = new GregorianCalendar(2014, 12, 20);// календарь на 20 01
															// 2014
		System.out.println("Date: " + d);
		System.out.println("GregorianCalendar: " + d);
		System.out.println("GregorianCalendar: " + c2);

		SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm");
		SimpleDateFormat format2 = new SimpleDateFormat(
				"День dd Месяц MM Год yyyy Время hh:mm");
		SimpleDateFormat format3 = new SimpleDateFormat("dd MM yyyy");
		//
		System.out.println(" SimpleDateFormat  format1 format2 format3 ");
		System.out.println("1: " + format1.format(c2.getTime()));
		System.out.println("2: " + format2.format(c2.getTime()));
		System.out.println("3: " + format3.format(c2.getTime()));
		//
		System.out.println();

		//
		System.out.println("FirstDayOfWeek = " + c.getFirstDayOfWeek());
		System.out.println("TimeZone = " + c.getTimeZone());
		System.out.println("DAY_OF_WEEK = " + Calendar.DAY_OF_WEEK);
		System.out.println("DAY_OF_MONTH = " + Calendar.DAY_OF_MONTH);
		System.out.println("DECEMBER = " + c2.DECEMBER);
		//
		c2.add(Calendar.DAY_OF_YEAR, 1); // увеличиваем дату на 1 день
		System.out.println(c2.getTime());// Fri Feb 21 00:00:00 EET 2014
		c2.add(Calendar.DAY_OF_YEAR, -1); // уменьшаем дату на 1 день
		//
		System.out.println(format3.format(c2.getTime()));// 20 02 2014
	}
}
