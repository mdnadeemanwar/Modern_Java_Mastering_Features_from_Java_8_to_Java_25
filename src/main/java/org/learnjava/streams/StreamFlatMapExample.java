package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

import static data.StudentDataBase.getAllStudents;
import static java.util.stream.Collectors.toList;

public class StreamFlatMapExample {

    public static List<String> printStudentActivities() {
        List<String> getAllStudentStudent = StudentDataBase
                .getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)// Stream<List<String>>
                .collect(toList());
        return getAllStudentStudent;
    }

    public static void main(String[] args) {
        System.out.println("Print students with activities  -> "+printStudentActivities());
    }
}
