package activities;

public class Car {
    //Class Member Variables
    String colour;
    String transmission;
    int make;
    int tyres;
    int doors;

    //Constructor
    Car(){
        tyres = 4;
        doors = 4;
    }

    //Class Methods
    public void displayCharacteristics()
    {
        System.out.println("Colour of the car is " +colour);
        System.out.println("Transmission of the car is " +transmission);
        System.out.println("Make of the car is " +make);
        System.out.println("Number of Tyres on the Car is " +tyres);
        System.out.println("Number of doors on the car is " +doors);
    }
    public void accelerate()
    {
        System.out.println("Car is moving Forward");
    }
    public void brake()
    {
        System.out.println("Car has Stopped");
    }
}
