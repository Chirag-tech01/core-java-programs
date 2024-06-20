package oopsdemo1;

public class TimeTest {
    public static void main(String[] args) {

        Time t1=new Time(14,23,23);
        Time t2=new Time(12,34,54);

        t1.add(t2);

        System.out.println("The Addition of 2 Times is :");
        t1.display();
    }
}
