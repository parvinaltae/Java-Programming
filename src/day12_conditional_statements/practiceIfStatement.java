package day12_conditional_statements;
import java.util.Scanner;
public class practiceIfStatement {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        if (name.equals("Chen")) {
            System.out.print("teacher");
        }else{
            System.out.print("student");
        }
    }
}
