package org.learnjava.java17PatternMatching;

public class PatternMatchingExample {


    public static String pattern(Object o) {
        if (o instanceof String) {
            var i = (String) o;
            return "String of length";

        }
        if (o instanceof Integer) {
            var i = (Integer) o;
            return "Integer";
        }
        return "Not a integer and not a String";
    }

    public static String patternMatchingUsingEnhancedSwitch(Object o) {
        return switch (o) {
            case String s -> "String of length";
            case Integer i -> "Integer" + i;
            case Number n -> "Number" + n;
            case Boolean b -> "Not a integer and not a String";
            case null, default -> "Not a integer and not a String";
        };
    }


}
