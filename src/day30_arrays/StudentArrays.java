package day30_arrays;

public class StudentArrays {
    public static void main(String[] args) {
        String[] student1 = {"3681", "Parvin", "Altae", "22", "911"};
        System.out.println("Student1 id: " + student1[0]);
        System.out.println("First Name: " + student1[1]);
        System.out.println("Last Name: " + student1[2]);
        System.out.println("Batch number: " + student1[3]);
        System.out.println("Phone number " + student1[4]);

        String[] student2 = {"4526", "Parvin", "Mohiby", "22", "20245887"};
        System.out.println("Student1 id: " + student2[0]);
        System.out.println("First Name: " + student2[1]);
        System.out.println("Last Name: " + student2[2]);
        System.out.println("Batch number: " + student2[3]);
        System.out.println("Phone number " + student2[4]);

        System.out.println("Student data length: " + student1.length);

        if (student1.length == 5) {
            System.out.println("Pass: data array has correct length");
        } else {
            System.out.println("False: data array has incorrect length");
        }
        if (student1.length == student2.length) {
            System.out.println("Length matches");
        } else {
            System.out.println("Length does not match");
        }
        System.out.print(student1[1].toUpperCase() + " " + student1[2].toUpperCase());
        String mobileNum = student1[4];
        System.out.println((student1[1] + " " + student1[2]).toUpperCase());
    }
}
