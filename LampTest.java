package oopsdemo1;
/* Java OOP to create Instance class & main Class in a Single File */
//Instance Class
 class Lamp {


    private boolean isOn; // Stores Value for light

    //Method to turn On the light
    public void turnOn(){
        isOn=true;
        System.out.println("Light On ? :"+isOn);
    }

    //Method to turn Off the Light
    private void turnOff(){
        isOn=false;
        System.out.println("Light On ? :"+isOn);
    }
}

//Main Class
public class LampTest{

    //Create Object led & Halogen
    Lamp led=new Lamp();
    Lamp halogen=new Lamp();

    //Switch on the light

}
