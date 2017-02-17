package java8.time;

import org.junit.Test;

import java.time.Instant;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class DateUtilTest {

    @Test
    public void testSecondsAgo() {
        Instant now = Instant.now();
        System.out.printf("%d secs gone until %s%n", DateUtil.secondsAgo(now), now);
    }

    @Test
    public void lastYearLogicalDate() {
        // Current date: 2017-03-31 (Friday)
        // Last year date: 2016-04-01 (Friday)

        LocalDate date = null;
        LocalDate expected = null;

        assertEquals(expected, DateUtil.lastYearSameDay(date));
    }
}
