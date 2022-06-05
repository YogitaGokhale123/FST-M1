package activities;

import example.Car;

public class Activity1 {

        public static void main(String[] args){
            Car Toyota = new Car();
            Toyota.make= 2020;
            Toyota.color= "White";
            Toyota.transmission = "Manual";

            Toyota.displayCharacteristics();
            Toyota.accelarate();
            Toyota.brake();
        }


}
