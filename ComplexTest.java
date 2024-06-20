package oopsdemo1;

public class ComplexTest {
    public static void main(String[] args) {

        // Create Objects of Complex  - Invokes Constructor
        Complex c1=new Complex(10.3,67.4);
        Complex c2=new Complex(0.7,3.6);
        Complex c3=new Complex(1.0,1.5);

        c1.add(c2);

        System.out.println("The Addition of 2 Complex Numbers is :");
        c1.display();

        c1=null; //destroy Object
        c1=new Complex(10.3,67.4); //Create new instanes of c1
        c1.add(c3);
        System.out.println("The Addition of 2 Complex Numbers is :");
        c1.display();
    }
}
