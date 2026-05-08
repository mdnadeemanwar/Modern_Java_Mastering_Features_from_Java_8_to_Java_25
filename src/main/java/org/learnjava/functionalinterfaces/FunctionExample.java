package org.learnjava.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();

    static Function<String ,String> addsomestring = (name) -> name.toUpperCase().concat("java 17");

    public static void main(String[] args) {
        System.out.println("Result is ->" + function.apply("Java8"));
        System.out.println("Concat string is ->"+addsomestring.apply("Java11"));
    }
}
