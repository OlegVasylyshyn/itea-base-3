package week3.day2.date;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDate {

    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);

        Date dateFromTimestamp = new Date(currentDate.getTime());
        System.out.println(dateFromTimestamp);

        System.out.println(currentDate.getHours());


        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, Calendar.MAY, 24);
        System.out.println(calendar);


        LocalTime localTime = LocalTime.now();
        LocalTime minus = localTime.minus(Duration.ofDays(2));
        System.out.println(minus);

    }

}
