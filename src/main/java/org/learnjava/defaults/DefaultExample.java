package org.learnjava.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultExample {


    /*
    Sort the list of name in ascending order
     */

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Adam","sohan","Marun","Nadeem","varun","Bharat");

        /*
        * before java 8
        * */
//        Collections.sort(names);
//        System.out.println(names);


        //From java 8
        names.sort(Comparator.naturalOrder());
        System.out.println("with the help of java 8 -->"+names);

        names.sort(Comparator.reverseOrder());
        System.out.println("with the help of java 8 -->"+names); //reverse the list


    }
}
