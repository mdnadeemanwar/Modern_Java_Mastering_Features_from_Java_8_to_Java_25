package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalorElseExample {


    //orElse
    //orElseGet
    //orElseThrow

    public static String ofElseExample() {
//        return Optional.of("Hello").orElse("Value is null");

        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.getAllStudents().get(0));
        String studentName = studentOptional.map(Student::getName).orElse("Default");
        return studentName;
    }

    public static String ofElseGetExample() {
//        return Optional.of("Hello").orElse("Value is null");

        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.getAllStudents().get(0));
        String studentName = studentOptional.map(Student::getName).orElseGet(() -> "Default");
        return studentName;
    }

    public static String ofElseThrowExample() {
//        return Optional.of("Hello").orElse("Value is null");

//        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.getAllStudents().get(0));
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String studentName = studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("Value is not present"));
        return studentName;
    }


    public static void main(String[] args) {


        //orElse Example
        System.out.println(ofElseExample());

        //orElseGet Example
        System.out.println(ofElseGetExample());

        //orElseThrow
        System.out.println(ofElseThrowExample());

    }
}
