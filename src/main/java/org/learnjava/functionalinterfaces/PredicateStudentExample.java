package org.learnjava.functionalinterfaces;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;


public class PredicateStudentExample {

   static Predicate<Student> predicateStudent = (s)->s.getGradeLevel()>=3;
   static Predicate<Student> predicateStudent1 = (s)->s.getGpa()>=3.9;

    public static void filterStudentByGradeLevel(){
        List<Student> studentList = StudentDataBase.getAllStudents() ;

        studentList.forEach(s->{
            if(predicateStudent.test(s)){
                System.out.println("Students of Grade "+s);
            }
        });
    }
    public static void filterStudentByGpaLevel(){
        List<Student> studentList = StudentDataBase.getAllStudents() ;

        studentList.forEach(s->{
            if(predicateStudent1.test(s)){
                System.out.println("Students of GPA"+s);
            }
        });
    }

    public static void filterStudentByGradeAndGpaLevel(){
        List<Student> studentList = StudentDataBase.getAllStudents() ;

        studentList.forEach(s->{
            if(predicateStudent.and(predicateStudent1).test(s)){
                System.out.println("Students of GRDE And GPA ->"+s);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpaLevel();
        filterStudentByGradeAndGpaLevel();
    }
}
