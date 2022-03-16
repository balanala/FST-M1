package activities;

public class Activity1 {
    public static void main(String[] args) {

        Car hyundai = new Car();
       hyundai.colour = "Biege";
       hyundai.make = 2009;
       hyundai.transmission = "Manual";

//Using Car class method
       hyundai.displayCharacteristics();
       hyundai.accelerate();
       hyundai.brake();
    }
}
