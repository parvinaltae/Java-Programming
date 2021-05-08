package PracticeProblems;

public class countJAva {
    public static void main(String[] args) {
        String str = "java is fun. java Class today, javascript";
        int count = 0;
        while(str.contains("java")){
            count++;
            str = str.replaceFirst("java","");
        }
        System.out.println("Java was found " + count + " times");
// Another way
        // for int i = 0; i < str.length()-3; i++{
       // String eachFourLetters = str.substring(i, i+4);
        // if (eachFourLetters.equals("java)) {
        count++;
    }
}
//