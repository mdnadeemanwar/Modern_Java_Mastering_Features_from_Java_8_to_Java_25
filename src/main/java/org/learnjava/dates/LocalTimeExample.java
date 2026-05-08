package dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(12,2);
        System.out.println(localTime1);

        LocalTime localTime2 = LocalTime.of(12,2,56,67);
        System.out.println(localTime2);


        /*
        * Getting the value of the localTime
        * */

        localTime.getHour();
        localTime.getMinute();
        localTime.getSecond();
        localTime.getNano();
        System.out.println("Hour is "+localTime.getHour());
        System.out.println("Minute is "+localTime.getMinute());
        System.out.println("Second is "+localTime.getSecond());


        /**
         *Now look into the temporal value
         */

        System.out.println(localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(localTime.toSecondOfDay());

        /*
        Modify value of localTime
         */

        System.out.println(localTime.minusHours(1));
        System.out.println(localTime.minusMinutes(1));
        System.out.println(localTime.minusSeconds(1));
        System.out.println(localTime.minusNanos(1));
        System.out.println(localTime.plusHours(1));
        System.out.println(localTime.plusNanos(3));

        System.out.println(localTime.plusMinutes(1));
        System.out.println(localTime.plusSeconds(1));

        System.out.println("Midnight"+localTime.with(LocalTime.MIDNIGHT));
        System.out.println("Hour of day"+localTime.with(ChronoField.HOUR_OF_DAY,12));
    }
}
