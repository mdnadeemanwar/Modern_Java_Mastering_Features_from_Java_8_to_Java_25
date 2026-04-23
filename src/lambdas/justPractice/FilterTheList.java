package lambdas.justPractice;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class FilterTheList {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 4, 7, 8, 4, 5, 6,5,7,2);
//        System.out.println(
//                list.stream()
//                        .filter(p->p<13)
//                        .collect(Collectors.toList()
//                        );

//        System.out.println(
//                list.stream()
//                        .filter(p -> p < 13)
//                        .collect(Collectors.toList())
//        );


//        List<Integer> filtered = list.stream().filter(x -> x < 30).toList();
//        System.out.println("The result is " + filtered);

        //second largest

//        System.out.println("Second largest" + list
//                .stream()
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst()
//                .orElse(null)
//        );


//        List<Integer> list = List.of(2, 3, 4, 7, 8, 4, 5, 6,2,3,5);
        //find Duplicate

        //dummy map collection match we can put it there
        Set<Integer> myset = new HashSet<>();
//        list.stream().filter()

//        Set<Integer> duplicates=list.stream().filter(x-> Collections.frequency(list,x)==1).collect(Collectors.toSet());
//        System.out.println("the output is "+duplicates);

//        List<Integer> duplicates = list.stream().filter(x->Collections.frequency(list, x)>1).collect(Collectors.toList());
//        System.out.println(duplicates);

//        to find unique

        List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);

        //find no of frequency

        //Map<Integer, long> freq= list.stream().Collect(Collectors.groupingBy(x->x,Collectors.counting()));

        Map<Integer,Long> freq = list
                .stream()
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println("Freq"+freq);

    }
}
