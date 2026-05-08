package org.learnjava.streamTerminalOperation;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMinMaxByExample {


    public static Optional<Student> getMinimumGPAStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> getMaximumGPAStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }


    public static void main(String[] args) {

        System.out.println(getMinimumGPAStudent());

        System.out.println(getMaximumGPAStudent());
    }
}
