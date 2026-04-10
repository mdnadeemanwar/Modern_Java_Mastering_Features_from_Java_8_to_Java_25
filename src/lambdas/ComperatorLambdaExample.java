package lambdas;

import java.util.*;

public class ComperatorLambdaExample {

    public static void main(String[] args) {


        //    Before java 8
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
                //above will give the ouput like this
                // o1==01 -> 0
                //01>02 -> 1
                //o1<o2 -> -1
            }
        };

        System.out.println("using comperator using the normal expression "+comparator.compare(3,3));



        //After java 8

        Comparator<Integer> comparator1 = (Integer a, Integer b)->a.compareTo(b);
        System.out.println("using comperator using the lambda expression1 ->"+comparator1.compare(3,2));


        Comparator<Integer> comparator2 = ( a,  b)->a.compareTo(b);
        System.out.println("using comperator using the lambda expression2 ->"+comparator2.compare(3,2));


    }



}
