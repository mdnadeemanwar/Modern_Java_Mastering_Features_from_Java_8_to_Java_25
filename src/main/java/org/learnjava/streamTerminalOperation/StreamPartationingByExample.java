package org.learnjava.streamTerminalOperation;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class StreamPartationingByExample {


    public static void partationByOne() {
        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

        Map<Boolean, List<Student>> partationMap = StudentDataBase
                .getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate));
        System.out.println("partationMap  ->" + partationMap);

    }



    public static void partationByTwo() {
        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

        Map<Boolean, Set<Student>> partationMap = StudentDataBase
                .getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate,
                        toSet()));
        System.out.println("partationByTwo  -> " + gpaPredicate);


    }

    public static void main(String[] args) {

        partationByOne();
        partationByTwo();

    }
}
