package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class streamExample {

    static Predicate<Student> studentFilterGradeLevel = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> studentFilterGpaLevel = student -> student.getGpa() >= 3.9;

    public static void main(String[] args) {

        Map<String, List<String>> studentDetails = StudentDataBase.getAllStudents()
                .stream()
                .filter(studentFilterGradeLevel)
                .filter(studentFilterGpaLevel)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));


        System.out.println("Details are->" + studentDetails);
    }

}
