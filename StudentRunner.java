package com.trimindtech.training.day05;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter name");
        String name = input.next();
        System.out.println("enter age");
        int age;
        try{
            age = input.nextInt();
        }catch(Exception exception){
            System.out.println("please enter numeric value");
        }
        Student student1 = new Student("student01","01");
        Student student2 = new Student("student02","02");
        Student student3 = new Student("student03","03");
        Student student4 = new Student("student04","04");
        Student student5 = new Student("student05","05");

        Student[] students = {student1,student2,student3,student4};

        System.out.println(studentExists(students,student5));

    }

    public static boolean studentExists(Student[] existingStudent, Student newStudent){
        for(Student student : existingStudent){
            if(student.equals(newStudent)){
                return true;
            }
        }
        return false;
    }
}
