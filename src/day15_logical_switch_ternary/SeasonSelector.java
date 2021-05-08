package day15_logical_switch_ternary;

public class SeasonSelector {
    public static void main(String[] args) {
        char grade = 'A';
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("Passed with grade " + grade);
        }else if(grade=='D'){
            System.out.println("qualify for retake" + grade);
        }else if (grade=='E'){
            System.out.println("fail with this " + grade);
        }else{
            System.out.println("invalid" + grade);
        }
    }
}
