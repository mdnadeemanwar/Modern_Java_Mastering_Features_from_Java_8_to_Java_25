package java17EnhancedSwitch;

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

    public static void main(String[] args) {
        System.out.println("With Normal Switch Example");
        System.out.println(getInDays(Month.FEBRUARY, 1900));

        System.out.println("EnhancedSwitch Example");
        System.out.println(withEnhancedSwitch(Month.FEBRUARY, 1900));
    }
}
