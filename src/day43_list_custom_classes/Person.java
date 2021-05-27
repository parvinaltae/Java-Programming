package day43_list_custom_classes;

public class Person {
    char gender;
    // data -> variables
    String firstName;
    int age;
    // behavior
    public void speak() { // behavior of the class
        System.out.println("Person: + " + firstName + " is speaking");

    }
}

class People{ // class for running main method
    public static void main(String[] args) {
        Person person1 = new Person(); // creating object
        person1.firstName = "Bob";
        person1.age = 33;
        person1.gender = 'M';
        person1.speak();

        Person person2 = new Person(); // anothe object
        person2.firstName = "Mike";
        person2.age = 12;
        person2.speak();

    }
}
