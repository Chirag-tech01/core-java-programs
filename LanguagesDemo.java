package oopsdemo1;

//Program to Demo Constructor in Java - Overload Constructor
class Languages {
    private String name;
    private float version;


    public Languages() {
        System.out.println("Im a Implicit Constructor");
        name="python";
        version=5.0f;
        System.out.println("Programming Languages : "+name+"."+version);
    }

    public Languages(String name) {
        this.name=name;
        System.out.println("Im a Parametrized Constructor with 1 Parameter ");
        System.out.println("Programming Languages : "+name+"."+version);
    }

    public Languages(String name, float version) {
        this.name = name;
        this.version = version;
        System.out.println("Im a Parametrized Constructor with 2 Parameter ");
        System.out.println("Programming Languages : "+name+"."+version);
    }
}

//Main Class
public class LanguagesDemo {
    public static void main(String[] args) {

        Languages lg1=new Languages(); //Invoke Implicit Constructor

        //Invoke Constructor with 1 args
        Languages lg2=new Languages("Ruby");
        Languages lg3=new Languages("Scala");

        Languages lg4=new Languages("Java",19.5f);
    }
}