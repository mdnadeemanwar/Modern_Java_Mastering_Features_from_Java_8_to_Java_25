package org.learnjava.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UniaryOperatorExample {

    static UnaryOperator<String> uniaryOperator = (s) -> s.concat("Default String");


    public static void main(String[] args) {
        System.out.println(uniaryOperator.apply("Nadeem Anwar "));
    }
}
