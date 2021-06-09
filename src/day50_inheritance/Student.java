package day50_inheritance;

import javafx.scene.Parent;

public class Student extends Person {
    String student;

    public void learn(String subject){
        System.out.println(student + " is learning " + subject);
    }
}
