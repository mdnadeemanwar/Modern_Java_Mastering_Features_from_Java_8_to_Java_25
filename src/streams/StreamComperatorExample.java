package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComperatorExample {

//    public static List<Student> sortedStudents(){
//        List<Student> collect = StudentDataBase
//                .getAllStudents()
//                .stream()
//                .sorted(Comparator.comparing(Student::getName))
//                .collect(Collectors.toList());
//        return collect;
//
//    }

    public static void main(String[] args) {

        System.out.println("sorted using the name");
        List<Student> collect = StudentDataBase
                .getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        System.out.println(collect);


        System.out.println("sorted using the gpa");

        List<Student> collectGPA = StudentDataBase
                .getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
        System.out.println("collectGPA"+collectGPA);
    }
}
