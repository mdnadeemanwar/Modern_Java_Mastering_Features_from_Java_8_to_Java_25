package org.learnjava.functionalinterfaces;


import org.learnjava.data.Student;
import org.learnjava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;


public class BiConsumerExaple {

    public static void nameAndActivity() {


        //now create a bi-consumer here
        BiConsumer<String, List<String>> studentbiconsumer = (name, activities) -> {
            System.out.println(name + ":" + activities);
        };

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            studentbiconsumer.accept(student.getName(), student.getActivities());
        });
    }

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("The values are-> " + a + " " + b);
        };

        biConsumer.accept("raman", "sohan");

        //now performing for multiply task
        BiConsumer<Integer, Integer> mul = (a, b) -> {
            System.out.println("Multiplication is " + (a + b));
        };
        mul.accept(4, 8);

        //here i will call the bi-consumer
        nameAndActivity();
    }


}
