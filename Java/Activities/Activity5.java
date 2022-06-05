package activities;


public class Activity5 {
    public static void main(String args[]) {
        String StrTitle = "Hover Car Racer";
        Book newNovel = new MyBook();
        newNovel.setStrTitle(StrTitle);
        System.out.println("The title is : " + newNovel.getStrTitle());
    }
}
abstract class Book{
    String StrTitle;
    abstract void setStrTitle(String s);
    String getStrTitle(){
        return StrTitle;
    }
}


class MyBook extends Book{
    public void setStrTitle(String s){
        StrTitle=s;
    }
}


