package day50_inheritance;

public class AudioBook extends Book{
    int length;
    String narrator;

    public void listen(){
        System.out.println("Listening to AudioBook");
        System.out.println("title = " + title);
        System.out.println("Type = " + type);
        System.out.println("Author is " + author);
        System.out.println("Book price = " + price);
    }
}
