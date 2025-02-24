package example;

public class Car {
    //Class Member Variables
    public String color;
    public int make;
    public String transmission;
    int tyres;
    int doors;

    //Constructor
    public Car() {
        tyres = 4;
        doors = 4;
    }

    //Class Methods
    public void displayCharacteristics(){
        System.out.println("Color of the Car: " + color);
        System.out.println("Make of the Car: " + make);
        System.out.println("Transmission of the Car: " + transmission);
        System.out.println("Number of doors on the car: " + doors);
        System.out.println("Number of tyres on the car: " + tyres);
    }

    public void accelarate() {
        System.out.println("Car is moving forward.");
    }

    public void brake() {
        System.out.println("Car has stopped.");
    }
}