package streamParallel;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParallelStreamExample1 {


    //creating a method for sequential stream using studentdatabase method

    public static List<String> sequentialPrintStudentActivities() {

        long start = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());

        long end = System.currentTimeMillis();
        System.out.println("Sequential stream-->"+(end-start));
        return studentActivities;
    }

    //parallel method
    public static List<String> parallelPrintStudentActivities() {
        long start = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
        long end = System.currentTimeMillis();
        System.out.println("Parallel stream-->"+(end-start));
        return studentActivities;
    }

    public static void main(String[] args) {
        System.out.println("Sequential stream-->"+sequentialPrintStudentActivities());
        System.out.println("Parallel stream-->"+parallelPrintStudentActivities());
    }
}
