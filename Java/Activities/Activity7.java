package activities;


    interface BicycleParts {
        public int nGears=0;
        public int nSpeed=0;
    }

    interface BicycleOperations {
        public void nApplyBreak(int Decrement);
        public void nSpeedUp(int increment);
    }

    class Bicycle implements BicycleParts, BicycleOperations {
        public int nGears;
        public int nSpeed;

        public Bicycle(int nGears, int nSpeed) {
            this.nGears = nGears;
            this.nSpeed = nSpeed;
        }

        public void nApplyBreak(int Decrement) {
            nSpeed -= Decrement;
            System.out.println("Current Spee is : " + nSpeed);
        }

        public void nSpeedUp(int Increment) {
            nSpeed += Increment;
            System.out.println("Current Speed is : " + nSpeed);
        }

        public String sBicycleDesc() {
            return ("No of gears are " + nGears + "\nSpeed of Bicycle is : " + nSpeed);
        }
    }
    class MountainBike extends Bicycle {
        public int seatHeight;
        public MountainBike(int nGears, int nSpeed, int startHeight) {
            super(nGears, nSpeed);
            seatHeight = startHeight;
        }
        public void setHeight(int newValue) {
            seatHeight = newValue;
        }
        public String sBicycleDesc() {
            return (super.sBicycleDesc()+ "\nSeat height is " + seatHeight);
        }
    }

public class Activity7 {
        public static void main(String args[]){
            MountainBike mb = new MountainBike(5, 10, 15);
            System.out.println(mb.sBicycleDesc());
            mb.nSpeedUp(20);
            mb.nApplyBreak(5);
        }
}
