package streamTerminalOperation;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamMappingExample {


//    print all the name using the mapping

    public  static  List<String> getAllStudentName(){
        return StudentDataBase
                .getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, toList()));
    }

    public  static  List<String> getAllStudentNameByMapMethod(){
        return StudentDataBase
                .getAllStudents()
                .stream()
                .map(Student::getName).collect(toList());
    }


    //I want the name in the Alphabetcally order

    public  static Set<String> getAllStudentNameinOrder(){
        return StudentDataBase
                .getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, toSet()));
    }
    public static void main(String[] args) {
        System.out.println("AllStudentName is "+ getAllStudentName());
        System.out.println("AllStudentName is "+ getAllStudentNameByMapMethod());
        System.out.println("AllStudentNameinOrder is "+ getAllStudentNameinOrder());

    }
}
