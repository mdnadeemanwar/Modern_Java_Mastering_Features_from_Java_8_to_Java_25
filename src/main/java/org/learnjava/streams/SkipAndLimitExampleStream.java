package org.learnjava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipAndLimitExampleStream {

    //Q1 i want first top 3 nums

    public  static List<Integer> getTopThreeNumbers(List<Integer> numbers) {
        return numbers.stream().sorted((a, b) -> b - a).limit(3).toList();
    }
    public  static List<Integer> getTopThreewihtskipNumbers(List<Integer> numbers) {
        return numbers.stream().sorted((a, b) -> b - a).limit(3).skip(1).toList();
    }

    public static void main(String[] args) {

//        List<Integer> nums = new ArrayList<>(5,6,7,3,4,8,9);

        List<Integer> numbers = Arrays.asList(5,6,7,8,4,3,9);

        //Take first 3 with limit(3)
        System.out.println(getTopThreeNumbers(numbers));

        //skip the first one with skip
        System.out.println(getTopThreewihtskipNumbers(numbers));
    }
}
