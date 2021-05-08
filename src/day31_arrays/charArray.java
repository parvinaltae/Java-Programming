package day31_arrays;

import javax.xml.bind.SchemaOutputResolver;

public class charArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        for (char eachLetter : letters) {
            System.out.print(eachLetter + " ");
        }
        String sentence = new String(letters);
        System.out.println("\n" + sentence + " ");

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("item.length() = " + itemArray.length);
        System.out.println(item.length());

        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
        String fruitStr = "";
        for (String eachFruit : fruits) {
            fruitStr += eachFruit + "-";
        }
        System.out.println(fruitStr);

        String[] languages = {"java", "python", "c++", "swl", "ruby", "javascript"};

        System.out.println(String.join("|",languages));

    }
}

