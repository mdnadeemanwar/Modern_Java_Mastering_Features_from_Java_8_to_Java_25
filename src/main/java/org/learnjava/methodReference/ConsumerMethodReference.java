package org.learnjava.methodReference;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {

    static Consumer<Student> c1 =  System.out::println;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
    }
}