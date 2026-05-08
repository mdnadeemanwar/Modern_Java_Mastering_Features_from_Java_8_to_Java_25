package org.learnjava.streams;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ExampleDistnictCountSorted {

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
        System.out.println("List"+printStudentActivities());

        //Result
//        List[swimming, basketball, volleyball, swimming, gymnastics, soccer,
//        swimming, gymnastics, aerobics, swimming, gymnastics, soccer, swimming,
//        dancing, football, swimming, basketball, baseball, football]

        //Now you can see upside how many times swimming
        // is repeated so lets remove the duplicate and i want unique activities


        //1. Distinct
        List<String> getAllStudentStudentunique = StudentDataBase
                .getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(toList());

        System.out.println("List with unique activities"+getAllStudentStudentunique);

        //now this result is getting
        //swimming, basketball, volleyball, gymnastics, soccer, aerobics, dancing, football, basebal

        //2. Sorted
        List<String> getAllStudentStudentSorted = StudentDataBase
                .getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());

        System.out.println("List with unique and Sorted activities"+getAllStudentStudentSorted);

        //Result start with a then starting b , c, d, e, f...... Fuck
        //aerobics, baseball, basketball, basketball, dancing,
        // football, football, gymnastics, gymnastics, gymnastics,
        // soccer, soccer, swimming, swimming, swimming, swimming,
        // swimming, swimming, volleyball


        //3. Counting
        Map<String,Long> getAllStudentStudentCount = StudentDataBase
                .getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));

        System.out.println("List with No of Count "+getAllStudentStudentCount);

        //dancing=1, soccer=2, swimming=6, aerobics=1, basketball=2,
        // gymnastics=3, baseball=1, volleyball=1, football=2}

    }



}
