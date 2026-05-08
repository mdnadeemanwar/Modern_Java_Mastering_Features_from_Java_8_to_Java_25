package org.learnjava.optional;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapAndFlatMapExample {


    //filter
    public static boolean optionalfilter(){
        Optional<Student>  studentOptional = Optional.ofNullable(StudentDataBase.getAllStudents().get(0));

        studentOptional.filter(s->s.getGpa()>=3.5).ifPresent(System.out::println);
        return false;
    }
    //flatmap
    //map

    public static void main(String[] args) {
        System.out.println(optionalfilter());
    }
}
