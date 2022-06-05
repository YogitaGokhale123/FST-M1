package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("Z");
        hs.add("Y");
        hs.add("1");
        hs.add("2");

        System.out.println("Original Hash Set is : "+ hs);
        System.out.println("Hash set size is : " + hs.size());
        System.out.println("Removing 1 from Hash Set : "+ hs.remove("1") );
        if (hs.remove("Y")) {
            System.out.println("Y removed from the hash set");
        } else {
            System.out.println("Y removed is present in the hash set");
        }
        System.out.println("Checking if W is present: " + hs.contains("W"));
        System.out.println("Updated HashSet: " + hs);
    }
}