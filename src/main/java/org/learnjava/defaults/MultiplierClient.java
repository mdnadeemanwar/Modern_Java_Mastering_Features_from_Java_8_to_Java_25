package org.learnjava.defaults;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;


public class MultiplierClient {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 5, 6, 7, 8, 9);
        MultplierImpl multplier = new MultplierImpl();
        System.out.println("Result is "+multplier.multiply(numbers));

//        System.out.println("The default method is "+multplier.size(numbers));

        //Note - > you can only access the static method with the name of the Interface
        System.out.println("The static method is "+ Multiplier.checkListEmpthy(numbers));

        //default method can be overridden but satic method not
        System.out.println("After override the size method "+multplier.size(numbers)); //simply we have added +1 into the size
    }
}
