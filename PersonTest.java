package oopsdemo1;
/* Java program to demonstrate this keyword*/
public class PersonTest {
    public static void main(String[] args) {

        //Create Person Objects
        Person p1=new Person();
        Person p2=new Person();

        //Set details for persons
        p1.setDetail("Alice",25);
        p2.setDetail("Bob",30);

        System.out.println("Details of Person 1");
        p1.displayDetails();
        System.out.println("Details pf Person 2");
        p2.displayDetails();

        //Compare ages of Person1 And Person2
        //Passing Object p2 as parameters to instance methode. p1 object can be accessed
        //from instanes methode using this keyword
        p1.compareAge(p2);
    }
}
