package org.learnjava.java25unnammedvariable;

import java.util.HashMap;
import java.util.Map;

public class UnnammedVariable {


    private static Integer getInteger(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception _) {
            System.out.println("Faild to parse" + s);
            return null;
        }
    }

    public static void unNammedVariableWithSwitch(Object i) {

        String result = switch (i) {
            case String _ -> "String value is used";
            case Integer _ -> "Interger value is used";
            default -> "Unknown value";
        };
        System.out.println("Result: " + result);
    }

    public static void unNammedVariableWithLambda(){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"java");
        map.put(2,"Spring");
        map.put(3,"kafka");

        map.forEach((_,v)->{
            System.out.println("Value: " + v);
        });
    }

    public static void main(String[] args) {

//        Object obj = "Nadeem";
//        if (obj instanceof String _) {
//            System.out.println("It is a String");
//        }

        /*
        un-nammed variable with enhanced switch
         */
        unNammedVariableWithSwitch(78);

        /*
        unNammed Variable to lambda , you will not receive any error
         */
        unNammedVariableWithLambda();


    }

}
