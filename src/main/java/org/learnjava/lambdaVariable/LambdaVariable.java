package org.learnjava.lambdaVariable;

import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaVariable {

    public static void main(String[] args) {
        int i = 1;
        Consumer<Integer> c1 = (a) -> {
            //it will give bcz i is reassigned
            // int i=2;
            System.out.println("value is " + a);
        };
        c1.accept(4);
    }
}
