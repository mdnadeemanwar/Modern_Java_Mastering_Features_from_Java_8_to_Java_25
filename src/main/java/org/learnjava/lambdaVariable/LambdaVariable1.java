package org.learnjava.lambdaVariable;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {
        int value = 4;

        Consumer<Integer> c2 = (a) -> {

            //here we will inc the value by one why bcz you are trying to increase a value
            //value++;
            System.out.println("Value is " + a);
        };

        c2.accept(8);
    }
}
