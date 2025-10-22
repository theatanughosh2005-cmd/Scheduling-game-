// Teacher.java
public class Teacher {
    // Attributes
    String name;
    String department;
    String subject;
    private double salary;

    // Constructor
    public Teacher(String name, String department, String subject, double salary) {
        this.name = name;
        this.department = department;
        this.subject = subject;
        this.salary = salary;
    }

    // Method to change the department
    public void changeDepartment(String newDepartment) {
        this.department = newDepartment;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Method to display teacher information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: $" + getSalary());
    }
}
