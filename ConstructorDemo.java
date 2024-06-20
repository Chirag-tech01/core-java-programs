package oopsdemo1;

public class ConstructorDemo {

    String name;
    int age;

    //NoArgs/Implicit Constructor
    ConstructorDemo(){
        System.out.println("Im a Constructor. Object initialised");
    }

    void display(){
        System.out.println(age+" "+name);
    }
    public static void main(String[] args) {
        ConstructorDemo cd1=new ConstructorDemo();
        ConstructorDemo cd2=new ConstructorDemo();
        ConstructorDemo cd3=new ConstructorDemo();
        ConstructorDemo cd4=new ConstructorDemo();

        cd1.display();
        cd2.display();
    }
}
