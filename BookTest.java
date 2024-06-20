package oopsdemo1;

public class BookTest {
    public static void main(String[] args) {

        Book b1=new Book();

        //Invoke Setter methods - Input
        b1.setBookId(1001);
        b1.setBookName("Programming in c");
        b1.setPrice(500);
        b1.setPublisher("Prime Books");

        b1.display();
        System.out.println("------------ Book Details ---------------");
        //Invoke Getter methods - output
        System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
        System.out.println("Discount price of the Book :"+b1.discountPrice());

        Book b2=new Book();

        //Invoke Setter methods - Input
        b2.setBookId(1002);
        b2.setBookName("Python Programming");
        b2.setPrice(600);
        b2.setPublisher("BPB Publication");

        //b2.display();
        //System.out.println("------------ Book Details ---------------");
        //Invoke Getter methods - output
        System.out.println(b2.getBookId()+" "+b2.getBookName()+" "+b2.getPrice()+" "+b2.getPublisher());
        System.out.println("Discount price of the Book :"+b2.discountPrice());

        System.out.println("-----------Display Book Objects ---------------");
        System.out.println(b1); //Invoke toString() Method of Book class to convert object to String
        System.out.println(b2);

    }
}
