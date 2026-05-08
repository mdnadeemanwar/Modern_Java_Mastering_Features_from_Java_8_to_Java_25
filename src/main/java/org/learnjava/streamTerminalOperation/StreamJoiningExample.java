package streamTerminalOperation;

import data.Student;
import data.StudentDataBase;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class StreamJoiningExample {

    //task concatinate all the name of student database class

    public static String concontateAllTheStudentName(){
       String mystudents=  StudentDataBase
               .getAllStudents()
               .stream()
               .map(Student::getName)
               .collect(joining("-"));
       return mystudents;
        //we don't need to write always Collector we can directly import this
    }

    public static void main(String[] args) {
        System.out.println(concontateAllTheStudentName());

    }
}
