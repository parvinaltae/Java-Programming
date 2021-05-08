package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(4,6,8,3,8,2);
        addNumbers(120,58,5987,563);
    }
    public static void addNumbers(int...nums){
        int sum = 0;
        for(int n : nums){
            sum += n;
        }
        System.out.println("sum = " + sum);
    }
}
