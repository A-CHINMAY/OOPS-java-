package lab;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        if (percent < 0) {
            System.out.println("Percentage must be positive.");
            return;
        }
        double raise = salary * percent / 100;
        salary += raise;
    }

    public void displayInfo() {
        System.out.printf("ID: %d, Name: %s, Salary: %.2f%n", id, name, salary);
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee(1, "John Doe", 50000.00);

        System.out.println("Employee details before raise:");
        emp.displayInfo();

        emp.raiseSalary(10);

        System.out.println("Employee details after 10% raise:");
        emp.displayInfo();
    }
}
