package org.learnjava.streamTerminalOperation;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDataBase;

import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamCountingExample {

    //count how many students are there

    public static Long countTotalNoOfStudent() {
        return StudentDataBase
                .getAllStudents()
                .stream()
                .collect(Collectors.counting());
    }
    //Count the student those have whose gpa more than 3.9
    public static Long countTotalNoOfStudentGPA() {
        return StudentDataBase
                .getAllStudents()
                .stream()
                .filter(student -> student.getGpa() > 3.9)
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println("Total no of student " + countTotalNoOfStudent());
        System.out.println("Total no of student as per GPA Condition " + countTotalNoOfStudentGPA());
    }
}
