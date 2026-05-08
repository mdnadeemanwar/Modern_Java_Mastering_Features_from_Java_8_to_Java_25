package streamTerminalOperation;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamGroupByExample {


    //Q1 Tell me how many men and women in the student database

    public static void countTheNoOfMenAndWomen() {
        Map<String, List<Student>> newStudent = StudentDataBase.
                getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(newStudent);
    }

    public static void countTheNoOfStudentAverageAndOutstanding() {
        Map<String, List<Student>> newStudent = StudentDataBase.
                getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa() > 3.9 ? "Outstadning" : "Average"));
        System.out.println(newStudent);
    }

    public static void twoLevelGrouping() {
        Map<Integer, Map<String, List<Student>>> newStudent = StudentDataBase
                .getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa() > 3.9 ? "Outstanding" : "Average")));

        System.out.println(newStudent);
    }



    public static void threeArgumentVersionGroupingBy() {
        LinkedHashMap<String, Set<Student>> modifiedData = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));

        System.out.println("modifiedData" + modifiedData);

    }


    //Q top GPA student and low gpa Student
    public static void topGPAandLowGPAStudent() {
        Map<Integer, Optional<Student>> modifiedStudentData = StudentDataBase
                .getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel
                        , maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println("modifiedStudentData   -> "+modifiedStudentData);
    }

    // Q least GPA student
    public static void leasstGPStudent() {
        Map<Integer, Optional<Student>> minGPaStudentData = StudentDataBase
                .getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel
                        , minBy(Comparator.comparing(Student::getGpa))));

        System.out.println("minGPaStudentData   -> "+minGPaStudentData);
    }


    public static void main(String[] args) {
        countTheNoOfMenAndWomen();
        countTheNoOfStudentAverageAndOutstanding();

        //2 lavel mapping
        twoLevelGrouping();

        //2 level mapping
        threeArgumentVersionGroupingBy();

        //top gpa student and low gpa studnet
        topGPAandLowGPAStudent();

        //least gpa student
        leasstGPStudent();
    }
}
