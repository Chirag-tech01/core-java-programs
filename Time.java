package oopsdemo1;

/* Java program to perform addition of 2 Times
 * t1 --> 12 : 45 :55
 * t2 --> 10 : 30 :30
 *        23    16 :25
 *
 * t1 + t2
 *   if sec> 60 .. mins should be incremented & sec -60,,
 *   if min> 60  ... hrs should be incremented & min -60
 */

public class Time {

    private int hrs,min,sec;


    //Generate Constructors
    public Time(int hrs, int min, int sec) {
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
    }

    public void add(Time t){
        this.sec+=t.sec;
        if(sec>60){
            min+=sec/60;
            sec-=60;
            //System.out.println(this.sec);
        }
        this.min+=t.min;
        this.hrs+=t.hrs;
        if(min>60){
            hrs+=min/60;
            min-=60;
            //System.out.println(this.min);
            //System.out.println(this.hrs);
        }
    }
    public void display(){
        System.out.println(this.hrs+" : "+this.min+" : "+this.sec);
    }
}
