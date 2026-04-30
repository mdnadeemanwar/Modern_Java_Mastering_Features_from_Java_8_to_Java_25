package numericStream;

import java.util.stream.IntStream;

public class NumericStreamAggegirateFunction {


    public static void main(String[] args) {
       int sum =  IntStream.rangeClosed(1, 10).sum();
        System.out.println("sum is "+sum);

        int max =  IntStream.rangeClosed(1, 10).max().getAsInt();
        System.out.println("Max is "+max);

    }
}
