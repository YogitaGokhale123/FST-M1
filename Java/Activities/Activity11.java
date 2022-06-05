package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args){
        HashMap<Integer, String> Colours = new HashMap<Integer, String>();
        Colours.put(1,"Green");
        Colours.put(2,"Red");
        Colours.put(3,"Blue");
        Colours.put(4,"Yellow");
        Colours.put(5,"Pink");
        System.out.println("The Original map is : "+ Colours);
        Colours.remove(4);
        System.out.println("After removing Yellow : " + Colours);

        if(Colours.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }

        System.out.println("Number of pairs in the Map is: " + Colours.size());
    }
}