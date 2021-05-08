package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "598";
        int num = Integer.parseInt(total);

        String strPrice = "458,63";
        if (Double.parseDouble(strPrice) > 100) {
            System.out.println(true);

            String sentence = " I wrote 100 lines of code";
            String[] sentenceArr = sentence.split(" "); // split converts string to array, inserts
            int lineOfCode = Integer.parseInt(sentenceArr[2]);
            System.out.println(lineOfCode);
        }
    }
}
