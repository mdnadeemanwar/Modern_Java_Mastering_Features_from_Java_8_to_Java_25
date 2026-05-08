package org.learnjava.defaults;

import java.util.List;

public class MultplierImpl implements Multiplier {

    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream().reduce(1, (a, b) -> a * b);

    }

    @Override
    public int size(List<Integer> integerList) {
        System.out.println("Inside the Multiplierimpl class");
        return integerList.size()+1;
    }



}
