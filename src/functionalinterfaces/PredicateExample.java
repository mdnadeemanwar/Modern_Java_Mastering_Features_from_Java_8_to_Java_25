package functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p2 = i ->  i % 2 == 0;
    static Predicate<Integer> p5 =i ->  i % 5 == 0;


    public static void predicateAnd(){
        System.out.println(p2.and(p5).test(11));
    }
    public static void predicateOR(){
        System.out.println(p2.or(p5).test(10));
    }

    public static void main(String[] args) {


        System.out.println(p2.test(4));
        predicateAnd();
        predicateOR();
    }
}
