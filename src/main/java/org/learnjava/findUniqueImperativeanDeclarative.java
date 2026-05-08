package org.learnjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findUniqueImperativeanDeclarative {
    public static void main(String[] args) {

        //Question find out the unique value


        //Imperative Approach
        List<Integer> intList = Arrays.asList(1,2,3,4,4,5,2,3,6,7,8,9,7,8,9,10);

        List<Integer> uniqueList = new ArrayList<>();

        for(Integer i : intList){
            if(!uniqueList.contains(i)){
                uniqueList.add(i);
            }
        }
        System.out.println("Remove duplicate is with imperative approach "+ uniqueList);


        //Declarative Approach

       List<Integer> response = intList.stream().distinct().collect(Collectors.toList());
        System.out.println("Remove duplicate is with declrative approach "+ response);

    }
}
