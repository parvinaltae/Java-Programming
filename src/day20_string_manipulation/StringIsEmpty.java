package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "SDET";
        System.out.println(jobTitle.equals(""));
        System.out.println(!jobTitle.isEmpty());
        System.out.println(jobTitle==(""));
        System.out.println(jobTitle.length());

        String veggie = "carrots";
        if (!veggie.isEmpty()) {
            System.out.println("We have carrots");

            String word2 = "Work";
            // error System.out.println(word2.isEmpty());

            System.out.println(word2.contains("w"));

            String firstName = "Aziza";
            if (firstName.contains ("A") && firstName.contains("a")){
                System.out.println("name contains two a's, oh no! HELP my friend!");
            }else{
                System.out.println("name does not have two a's");
            }
            String email = "parvin.altae@gmail.com";
            if (email.contains("@") && email.endsWith(".com")) {
                System.out.println("valid email");
            } else {
                System.out.println("Not valid email");
            }
            if (email.toLowerCase().contains("p")) {
                System.out.println("Valid");
            }

            String word = "Aziza";
            word.replace("a","");

            System.out.println("Problem fixed= " + word );

            String palindrome = "mom";
           if(palindrome.charAt(0) == palindrome.charAt(1)) {
               System.out.println("It's the same");
           } else {
               System.out.println("Not the same");
           }
           String anotherWord = "Aziza";
           char firstLetter = anotherWord.charAt(0);
           char lastLetter = anotherWord.charAt(4);
            System.out.println(anotherWord.charAt(anotherWord.length() -1));



        }
    }
}
