package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee();
        developer.jobTitle = "Java Developer";
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(60.0);
        System.out.println("Math.round(annualDevSalary) = " + Math.round(annualDevSalary));

        Contractor sdetContractor = new Contractor();
        sdetContractor.jobTitle = "SDET";
        sdetContractor.calculateSalary(45);
        System.out.println("sdetContractor = " + sdetContractor);

        System.out.println(developer.toString());
        System.out.println(sdetContractor); // typing toString is optional
    }
}