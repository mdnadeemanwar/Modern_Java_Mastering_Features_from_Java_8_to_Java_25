package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamMapExample {

    public static void main(String[] args) {
        List<String> myDataList = StudentDataBase.getAllStudents().stream().map(Student::getName).collect(toList());

        Set<String> myDataSet = StudentDataBase.getAllStudents().stream().map(Student::getName).collect(toSet());

        System.out.println("List"+myDataList);

        //Give the name in the Sorted Order Like A..B..c..
        System.out.println("set"+myDataSet);

    }
}
