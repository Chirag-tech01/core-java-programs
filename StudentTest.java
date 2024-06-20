package oopsdemo1;

//Java Main class to test Student class
public class StudentTest {
    public static void main(String[] args) {

        //Create Objects of Student Class
        Student s1=new Student();
        Student s2=new Student();

        //Invoke Methods of Student Class using dot(.) notation
        s1.input();
        s1.calculateMarks();
        float tot=s1.calculateMarks();
        s1.displayStudentDetail();
        System.out.println("Display Marks returned from Instance Method :"+tot);

        //s1.name="Raj"; // name is private cannot access

        s2.input();
        s2.calculateMarks();
        float tot1=s2.calculateMarks();
        s2.displayStudentDetail();
        System.out.println("Display Marks returned from Instance Method :"+tot1);
    }
}
