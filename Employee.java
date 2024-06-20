package oopsdemo1;

import java.util.Scanner;

/*
Java OOP to enter employee details m calculate his Net Salary & display details
*/
public class Employee {

    private int empId;
    private String firstName,lastName,designation;
    private double basic,hre,da,grossSal,netSal;
    private static final double TAX=1000; //Constant declaration

    Scanner scanner=new Scanner(System.in);

    public void inputEmployeeDetails(){
        System.out.println("Enter Employee ID,FirstName,LastName & Designation :");
        empId= scanner.nextInt();
        firstName= scanner.next();
        lastName= scanner.next();
        scanner.nextLine();
        designation= scanner.nextLine();
        System.out.println("Enter Employee basic salary :");
        basic=scanner.nextDouble();
    }

    public void calculateNetSalary(){
        hre=basic*0.15;
        da=basic*0.10;
        grossSal=basic+hre+da;
        netSal=grossSal-TAX;
    }

    public void displayEmployeeDetail(){
        System.out.println("********************* Employeee Salary Slip *****************");
        System.out.println("Employee Id         : "+empId);
        System.out.println("Employee Name       : "+firstName);
        System.out.println("Basic Salary        : "+basic);
        System.out.println("HRA                 : "+hre);
        System.out.println("DA                  : "+da);
        System.out.println("Gross Salary        : "+grossSal);
        System.out.println("TAX                 : "+TAX);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Net Salary          : "+netSal);
        System.out.println("***************************************************************");

    }
}
