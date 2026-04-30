package numericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {


    public static int sumOfAllNo(List<Integer> intergerList) {
        return intergerList.stream().reduce(0, (a,b)->a+b);
    }

    public static int sumOfIntStream() {
       return IntStream.rangeClosed(1,6).sum();
    }

    public static void main(String[] args) {


        List<Integer> intergerList = Arrays.asList(1, 2, 3, 4, 6, 7, 3, 4, 5, 1);
        System.out.println(sumOfAllNo(intergerList));

        System.out.println("Sum of list stream ->"+sumOfIntStream());

    }
}
