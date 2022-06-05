package activities;



import java.util.ArrayList;

    public class Activity9 {
        public static void main(String[] args) {
            ArrayList<String> myList = new ArrayList<String>();
            myList.add("Apple");
            myList.add("Mango");
            myList.add("Papaya");
            myList.add("Orange");
            myList.add("Banana");
            myList.add("Grapes");
            System.out.println("Print all the names");
            for(String nNm : myList) {
                System.out.println(nNm);
            }
            System.out.println("3rd element in the list is: " + myList.get(2));
            System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
            System.out.println("Size of ArrayList: " + myList.size());
            myList.remove("Grapes");
            System.out.println("New Size of ArrayList: " + myList.size());
        }

}
