package optional;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class OptionalExample {
    //create a method for getStudentName

    public static List<String> getOnlyStudentName(){
        List<String> names = StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.toList());
        return names;
    }
    public static String getStudentName(){
        Student student = StudentDataBase.getAllStudents().get(0);


        if(student != null){
            return student.getName();
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(getStudentName().length());
    }
}
