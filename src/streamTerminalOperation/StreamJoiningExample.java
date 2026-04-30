package streamTerminalOperation;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamJoiningExample {

    //task concatinate all the name of student database class

    public static String concontateAllTheStudentName(){
       String mystudents=  StudentDataBase
               .getAllStudents()
               .stream()
               .map(Student::getName)
               .collect(Collectors.joining("-"));
       return mystudents;
    }

    public static void main(String[] args) {
        System.out.println(concontateAllTheStudentName());

    }
}
