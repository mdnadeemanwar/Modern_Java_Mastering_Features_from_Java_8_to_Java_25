package org.learnjava.numericStream;

import java.util.Optional;
import java.util.stream.IntStream;

public class NumericStreamAggegirateFunction {


    public static void main(String[] args) {
       int sum =  IntStream.rangeClosed(1, 10).sum();
        System.out.println("sum is "+sum);

        int max =  IntStream.rangeClosed(1, 10).max().getAsInt();
        System.out.println("Max is "+max);

        int min =  IntStream.rangeClosed(3, 10).min().getAsInt();
        System.out.println("Min is "+min);

        Double averagevalue =  IntStream.rangeClosed(3, 10).average().getAsDouble();

        System.out.println("Maveragevaluein is "+averagevalue);
    }
}
