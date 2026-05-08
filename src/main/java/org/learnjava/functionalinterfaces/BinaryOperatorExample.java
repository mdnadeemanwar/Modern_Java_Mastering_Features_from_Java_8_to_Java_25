package org.learnjava.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

//    static void binaryOperator() {}
    static Comparator<Integer> comparator = (a,b)->a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println(binaryOperator.apply(10, 20));

        BinaryOperator<Integer> binaryOperator1 = (a, b) -> a * b;

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(10, 20));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(10, 20));

    }
}
