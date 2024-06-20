package oopsdemo1;

public class Complex {

    private double real;
    private double imaginary;

    //Generate Constructor using all fields
    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
 //Method to add 2 Complex numbers
    public void add(Complex obj){
        this.real+= obj.real; //c1.real = c1.
        this.imaginary+=obj.imaginary;
    }

    public void display(){
        System.out.println("r"+this.real+" + i"+this.imaginary);
    }
}

