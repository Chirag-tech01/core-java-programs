package oopsdemo1;

//Program to demo this keyword
public class Person {

    private String name;
    private int age;

    public void setDetail(String name, int age){
        this.name=name; //this keyword refers to current Object, used to invoke the method
        this.age=age;
    }

    public void displayDetails(){
        System.out.println("Person Name         :"+this.name);
        System.out.println("Person Age          :"+this.age);
    }

    //Method to compare ages
    public void compareAge(Person otherPerson){
        if (this.age < otherPerson.age){ //this refers to p1 object

            System.out.println(this.name+" is Younger than "+otherPerson.name);
        } else if (this.age > otherPerson.age) {
            System.out.println(this.name+" is Older than "+otherPerson.name);

        }
        else {
            System.out.println(this.name+ " is same age as "+otherPerson.name);
        }

    }
}
