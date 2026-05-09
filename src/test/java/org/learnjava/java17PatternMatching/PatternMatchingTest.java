package org.learnjava.java17PatternMatching;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.Arguments;

import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PatternMatchingTest {

    @Test
    public void test() {
        System.out.println("test");
    }

    PatternMatchingExample example = new PatternMatchingExample();

//    @ParameterizedTest
//    @MethodSource("input")
//    public void pattern(Object value, String expectedResult) {
//        System.out.println("testExample");
//        var output = example.pattern(value);
//        Assertions.assertEquals(expectedResult, output);
//    }

    @ParameterizedTest
    @MethodSource("input")
    public void patternusingSwitch(Object value, String expectedResult) {
        System.out.println("testExample");
        var output = example.patternMatchingUsingEnhancedSwitch(value);
        Assertions.assertEquals(expectedResult, output);
    }

    private static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of("nadeem", "String of length"),
                Arguments.of("nadeem", "String of length"),
                Arguments.of(true, "Not a integer and not a String"),
                Arguments.of(null, "Not a integer and not a String")
        );
    }
}
