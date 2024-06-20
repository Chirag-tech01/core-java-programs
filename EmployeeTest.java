package oopsdemo1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        Employee emp2=new Employee();

        emp1.inputEmployeeDetails();
        emp2.inputEmployeeDetails();

        emp1.calculateNetSalary();
        emp2.calculateNetSalary();

        emp1.displayEmployeeDetail();
        emp2.displayEmployeeDetail();

    }
}
