package activities;



import com.graphbuilder.math.func.RoundFunction;

import java.math.RoundingMode;

public class Activity3 {
        public static void main(String args[]){
            double Seconds = 1000000000;
            double Earth =31557600;
            double Mercury =  0.2408467;
            double Venus =  0.61519726;
            double Mars = 1.8808158;
            double Jupiter = 11.862615;
            double Saturn = 29.447498;
            double Uranus = 84.016846;
            double Neptune = 164.79132;

            System.out.format("Age of Earth is : "+ "%.2f",(Seconds/Earth));
            System.out.println();
            System.out.format("Age of Mercury is : "+ "%.2f",(Seconds/Earth/Mercury));
            System.out.println();
            System.out.format("Age of Venus is : "+ "%.2f",(Seconds/Earth/Venus));
            System.out.println();
            System.out.format("Age of Mars is : "+ "%.2f",(Seconds/Earth/Mars));
            System.out.println();
            System.out.format("Age of Jupiter is : "+ "%.2f",(Seconds/Earth/Jupiter));
            System.out.println();
            System.out.format("Age of Saturn is : "+ "%.2f",(Seconds/Earth/Saturn));
            System.out.println();
            System.out.format("Age of Uranus is : "+ "%.2f",(Seconds/Earth/Uranus));
            System.out.println();
            System.out.format("Age of Neptune is : "+ "%.2f",(Seconds/Earth/Neptune));
        }

    }
