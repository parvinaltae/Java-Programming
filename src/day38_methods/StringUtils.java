package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty(""));
        String word = null;
        System.out.println(word.toUpperCase());
    }
    public static boolean isNullOrEmpty(String str){
        if(str == null || str.isEmpty() ){
            return true;
        } else {
            return false;
        }
    }
}
