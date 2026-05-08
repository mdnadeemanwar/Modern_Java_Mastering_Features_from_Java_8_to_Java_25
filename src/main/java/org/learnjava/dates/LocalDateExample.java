package org.learnjava.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

    public static void main(String[] args) {

        //LocalDate Example

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2018, 07, 13);
        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2018, 12);
        System.out.println(localDate2);

        /*
        Get values from the localDate
        * */

        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getYear());
        System.out.println(localDate.getDayOfYear());


//        modifiying the localDate

        System.out.println(localDate.plusDays(2));
        System.out.println(localDate.minusDays(2));
        System.out.println(localDate.plusMonths(2));

        //change the year
        System.out.println("change the year ->"+localDate.withYear(2018));
        System.out.println("with the chronofield ->"+localDate.with(ChronoField.YEAR,2020));
        System.out.println("First days of next month ->"+localDate.with(TemporalAdjusters.firstDayOfMonth()));

        //minus year --> both way we can do that
        System.out.println(localDate.minusYears(1));
        System.out.println(localDate.minus(1, ChronoUnit.YEARS));

        /*
        * Additional leap year
        * */

        System.out.println(localDate.isLeapYear());
        System.out.println(localDate.ofYearDay(2020, 1).isLeapYear());


        //localDate - 6 may 2026
        //localDate1 = 17 july 2028

        System.out.println(localDate1.isEqual(LocalDate.now()));
        System.out.println(localDate1.isBefore(LocalDate.now()));

    }
}
