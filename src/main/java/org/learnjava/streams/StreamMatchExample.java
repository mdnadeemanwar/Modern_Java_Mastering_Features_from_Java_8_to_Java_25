package org.learnjava.streams;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDataBase;

public class StreamMatchExample {


    //if all student gpa greater than 3.9 then return true

    public static Boolean allStudentGPA(){
       return StudentDataBase.getAllStudents().stream().allMatch(student ->student.getGpa()>=3.9);
    }
    public static Boolean anyStudentGPA(){
       return StudentDataBase.getAllStudents().stream().anyMatch(student ->student.getGpa()>=3.9);
    }
    public static Boolean noneStudentGPA(){
       return StudentDataBase.getAllStudents().stream().noneMatch(student ->student.getGpa()>=8.9);
    }
    public static void main(String[] args) {

        //it will give false bcz not all student have gpa 3.9
        System.out.println("Result is "+allStudentGPA());


        //it will give true bcz one of the student has gpa 3.9
        System.out.println("Result is "+anyStudentGPA());


        //it will give false bcz not all student have gpa 8.9
        System.out.println("Result is "+noneStudentGPA());





    }
}
