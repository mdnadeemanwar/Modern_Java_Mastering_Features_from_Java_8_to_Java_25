package org.learnjava.java17EnhancedSwitch;

import java.time.Month;
import java.time.Year;

public class EnhancedSwitchExample {


    /*
    Old way to impliment the switch
     */

    public static int getInDays(Month month, int year) {
        int noOfDays = 0;
        switch (month) {
            case SEPTEMBER:
            case APRIL:
            case JUNE:
            case NOVEMBER:
                noOfDays = 30;
                break;
            case FEBRUARY:
                System.out.println("checking is " + year + "is leap");
                noOfDays = Year.isLeap(year) ? 29 : 28;
                break;
            default:
                noOfDays = 31;
                break;
        }
        return noOfDays;
    }

    public static int withEnhancedSwitch(Month month, int year) {
        int noOfDays = 0;

        switch (month) {
            case SEPTEMBER, APRIL, JUNE, NOVEMBER -> noOfDays = 29;
            case FEBRUARY -> noOfDays = Year.isLeap(year) ? 29 : 28;
            default -> noOfDays = 31;
        }
        return noOfDays;

    }

    public static int withEnhancedSwitchWithYield(Month month, int year) {

        return switch (month) {
            case SEPTEMBER, APRIL, JUNE, NOVEMBER -> 29;
            case FEBRUARY -> {
                //you can write the multiple statement here
                System.out.println("checking is " + year + " is leap");
                yield Year.isLeap(year) ? 29 : 28;
            }
            default -> 31;
        };

    }

    public static int withEnhancedSwitchWithRemoveDefault(Month month, int year) {

        return switch (month) {
            case SEPTEMBER, APRIL, JUNE, NOVEMBER -> 29;
            case FEBRUARY -> {
                //you can write the multiple statement here
                System.out.println("checking is " + year + " is leap");
                yield Year.isLeap(year) ? 29 : 28;
            }
            /*
            if we cover all the scenerio like remaining month
            then we dont need to write the default
             */
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
        };
    }


    public static void main(String[] args) {
        System.out.println("With Normal Switch Example");
        System.out.println(getInDays(Month.FEBRUARY, 1900));

        System.out.println("EnhancedSwitch Example");
        System.out.println(withEnhancedSwitch(Month.FEBRUARY, 1900));

        System.out.println("EnhancedSwitchYield Example");
        System.out.println(withEnhancedSwitchWithYield(Month.FEBRUARY, 1900));

        System.out.println("EnhancedSwitchWithRemoveDefault Example");
        System.out.println(withEnhancedSwitchWithRemoveDefault(Month.FEBRUARY, 1900));
    }
}
