package PracticeProblems;

public class BookValue {
    public static void main(String[] args) {
        String book = "Java textbook By Murodil. Chapter 1 datatypes and variables. Chapter 2\n" +
                "conditional statements. chapter 3 String manipulation. Chapter 4\n" +
                "Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList.\n" +
                "chapter 8 instance and static. Chapter 9 Constructors. Chapter 10\n" +
                "Encapsulation and Inheritance. Chapter 11 Abstraction and\n" +
                "Polymorphism. Chapter 12 Exceptions. Chapter 13 Collections. Chapter\n" +
                "14 Learn more.";

        String word = "chapter";
        int value = 0;
        book = book.toLowerCase();

        for (int i = 0; i <= book.length(); i++) {
            if (book.contains(word)) {
                value++;
                book = book.replaceFirst(word, "");
                }
            }
            System.out.println("The value of the book is $" + (value * 10));
        }
    }

