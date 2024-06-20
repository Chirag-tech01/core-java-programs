package oopsdemo1;

public class WiproEmployeeTest {
    public static void main(String[] args) {

        Employee wiproEmp1=new Employee();
        Employee wiproEmp2=new Employee();

        wiproEmp1.inputEmployeeDetails();
        wiproEmp2.inputEmployeeDetails();

        wiproEmp1.calculateNetSalary();
        wiproEmp2.calculateNetSalary();

        System.out.println("**********************************");
        System.out.println("\t\t\tWopro Technologies\t\t\t");
        System.out.println("-----------------------------------");

        wiproEmp1.displayEmployeeDetail();
        wiproEmp2.displayEmployeeDetail();
    }
}
