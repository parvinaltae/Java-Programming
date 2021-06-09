package day51_inheritance;

public class Employee extends Object {
        String jobTitle;

        public double calculateSalary (double hourlyRate){
            return (hourlyRate * 40 * 52 * 1.10);
        }

        // toString method is inhertited from Object class
    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
