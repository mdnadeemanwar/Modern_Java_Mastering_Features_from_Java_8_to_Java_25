package org.learnjava.functionalinterfaces;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {


    static Function<List<Student>, Map<String, Double>> studentFunction = (student -> {
        Map<String, Double> studentGradeMark = new HashMap<>();
        student.forEach((studentName -> {
            studentGradeMark.put(studentName.getName(), studentName.getGpa());
        }));
        return studentGradeMark;
    });

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }

}
