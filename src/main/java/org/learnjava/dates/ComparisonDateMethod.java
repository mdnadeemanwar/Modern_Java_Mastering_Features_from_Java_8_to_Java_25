package org.learnjava.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class ComparisonDateMethod {

    public static void main(String[] args) {

        LocalDate today = LocalDate.of(1970, 1, 1);
        LocalDate yesterday = LocalDate.of(2025, 02, 20);

        Period period = Period.between(today, yesterday);

        System.out.println("period  -> " + period);
        System.out.println("Periodyear -> " + period.getYears());
        System.out.println("Periodyear -> " + period.getMonths());
        System.out.println("Periodyear -> " + period.getDays());


        LocalTime time1 = LocalTime.of(11, 00);
        LocalTime time2 = LocalTime.of(12, 00);

        Duration duration = Duration.between(time1, time2);
        System.out.println("duration  -> " + duration.toMinutes());

    }
}


