package day43_list_custom_classes;

public class Employee {
    String name;
    String jobTitle;
    int age;
    public void work() {
            System.out.println(name + " works as " + jobTitle);
        }
    }

     class company {
        public static void main(String[] args) {
            Employee employee1 = new Employee();
            employee1.name = "Murodil";
            employee1.age = 34;
            employee1.jobTitle = "Java Instructor";
            employee1.work(); // to print

            Employee employee2 = new Employee();
            employee2.name = "Nadir";
            employee2.age = 37;
            employee2.jobTitle = "Soft Skill Instructor";
            employee2.work(); // to print


        }
    }
