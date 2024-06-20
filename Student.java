package oopsdemo1;

import java.util.Scanner;

/*
Java Object-Oriented Program to enter student details, Calculate Total Marks And Display the same
 */
//Instance Class
//Implemented Encapsulation And Data Abstraction
public class Student {

    /* Define Properties/state/attributes of a student Object*/
    private int rollNumber;
    private String name,course;
    private float marks1,mark2,mark3, total;

    Scanner scanner=new Scanner(System.in);

    //Define Methods/behaviour/Functions of Student Object
    public void input(){
        System.out.println("Enter Roll Number, Name, Course of a Student :");
        rollNumber=scanner.nextInt();
        name= scanner.next();
        course= scanner.next();
        System.out.println("enter Marks of 3 Subjects :");
        marks1=scanner.nextFloat();
        mark2=scanner.nextFloat();
        mark3= scanner.nextFloat();
    }

    public float calculateMarks(){
        total=marks1+mark2+mark3;
        return total;
    }

    public void displayStudentDetail(){
        System.out.println("********* Student Detail ************");
        System.out.println("Roll Number         : "+rollNumber);
        System.out.println("Name         : "+name);
        System.out.println("Course        : "+course);
        System.out.println("Total Marks         : "+total);
        System.out.println("****************************");
    }
}
