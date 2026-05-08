package org.learnjava.streams;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDataBase;

import java.util.Optional;

public class StreamFindFirstAndFindAnyExample {

    public  static Optional<Student> findFirstStudent(){
       return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa()>3.9).findFirst();
    }

    public  static Optional<Student> findAnyStudent(){
       return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa()>2.9).findAny();
    }



    public static void main(String[] args) {

        Optional<Student> findFirstMatchStudent = findFirstStudent();
        if(findFirstMatchStudent.isPresent()){
            System.out.println(" Student is found -> "+findFirstMatchStudent.get());
        }

        Optional<Student> findAnyMatchStudent = findAnyStudent();
        if(findAnyMatchStudent.isPresent()){
            System.out.println(" Student with findAny ->"+findAnyMatchStudent.get());
        }

    }
}
