package org.learnjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {


    public static int getMaximumValue(List<Integer> numbers) {
       return numbers.stream().reduce(0, (a,b)->a>b?a:b);

    }
    public static int getManimumValue(List<Integer> numbers) {
       return numbers.stream().reduce(0, (a,b)->a>b?a:b);

    }
    public static Optional<Integer> getManimumWithOptionalValue(List<Integer> numbers) {
       return numbers.stream().reduce( (a,b)->a<b?a:b);

    }
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 33, 4, 5, 66, 7, 8, 9, 10);
        System.out.println(getMaximumValue(numbers));
        System.out.println(getManimumValue(numbers));

        Optional<Integer> manimum = getManimumWithOptionalValue(numbers);
        if(manimum.isPresent()) {
            System.out.println(manimum.get());
        }
    }
}
