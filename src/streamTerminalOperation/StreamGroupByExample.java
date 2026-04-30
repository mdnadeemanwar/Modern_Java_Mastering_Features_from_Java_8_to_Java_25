package streamTerminalOperation;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamGroupByExample {


    //Q1 Tell me how many men and women in the student database

    public static void countTheNoOfMenAndWomen(){
        Map<String, List<Student>> newStudent =  StudentDataBase.
                getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(newStudent);
    }
    public static void countTheNoOfStudentAverageAndOutstanding(){
        Map<String, List<Student>> newStudent =  StudentDataBase.
                getAllStudents()
                .stream()
                .collect(groupingBy(student->student.getGpa()>3.9?"Outstadning":"Average"));
        System.out.println(newStudent);
    }
    public static void main(String[] args) {
         countTheNoOfMenAndWomen();
        countTheNoOfStudentAverageAndOutstanding();
    }
}
