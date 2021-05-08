package day35_method_with_parameters;

public class VoidMethods {
    public static void main(String[] args) {
        printAtoZ();
        printAtoZ();
        for (int i = 0; i < 10; i++) {
            printAtoZ();
        }
        flagUSA();
        displayUSFlag();
    }

    public static void printAtoZ() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
    }
        public static void displayUSFlag() {
            String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
            String p2 = "==============================================";
            for (int i = 0; i < 4; i++) {
                System.out.println(p1);
            }
            System.out.println("* * * * * * ==================================");
            for (int i = 0; i < 6; i++) {
                System.out.println(p2);
            }
        }
            public static void flagUSA() {
            System.out.println("======== Display USA Flag========");
        }
        }


