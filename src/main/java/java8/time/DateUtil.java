package java8.time;

import java.time.*;
import java.util.Locale;

public class DateUtil {

    public static long secondsAgo(Instant end) {
        return Duration.between(Instant.EPOCH, end).getSeconds();
    }

    public static int daysAgo(LocalDate pastDate) {
        //TODO help!
        return 0;
    }

    public static String formatDate(Instant date, Locale locale) {
        //TODO help!
        return null;
    }

    public static LocalDate lastYearSameDay(LocalDate currentDate) {
        //TODO help!
        return null;
    }
}
