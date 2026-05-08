package org.learnjava.java9compactmainfunction;

import java.util.List;
import java.util.Map;

public class CompactFunctionExample1 {


    static String transformToUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println("Hello World");


        var data = List.of("Nadeem", "sohan", "mohan");
        System.out.println("Hello World" + data);
        System.out.println(transformToUpperCase(data.get(0)));

        /*
        Var can alos used into the for loop
         */

        for(var name : data){
            System.out.println(transformToUpperCase(name));
        }

        /*
        Let's take another example of var
         */
        var map = Map.ofEntries(Map.entry("a", List.of("Nadeem", "sohan", "mohan")));

        System.out.println("Var with map example ->" + map);


        /*
        Lets take the var for store the value
         */

        var transformname = transformToUpperCase(data.get(0));
        System.out.println("transform name ->"+transformname);
    }
}
