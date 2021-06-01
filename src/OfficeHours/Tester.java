package OfficeHours;

public class Tester {
    /* - create a class called Tester
                    Attributes:
                        name, employeeID, JobTitle, Salary

                    Constructor:
                        accepts and sets all instance variables

                    Actions:
                        getter/setters, smokeTesting(),  creatingTicket(), toString()

            -> Optional: static variable */

    private String name, jobTitle;
    private int employeeID;
    private double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
}

