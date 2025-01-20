// Assignment 3.2: Employee and ProductionWorker Classes
class Employee {
    private String name;
    private String employeeNumber;
    private String hireDate;

    public Employee(String name, String employeeNumber, String hireDate) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Hire Date: " + hireDate);
    }
}

class ProductionWorker extends Employee {
    private int shift;
    private double hourlyPayRate;

    public ProductionWorker(String name, String employeeNumber, String hireDate, int shift, double hourlyPayRate) {
        super(name, employeeNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public void displayWorkerDetails() {
        display();
        System.out.println("Shift: " + (shift == 1 ? "Day" : "Night"));
        System.out.println("Hourly Pay Rate: $" + hourlyPayRate);
    }

    public static void main(String[] args) {
        ProductionWorker worker = new ProductionWorker("John Doe", "123-A", "01/01/2023", 1, 25.50);
        worker.displayWorkerDetails();
    }
}

// Explanation: This program showcases inheritance by creating an Employee class and extending it with a ProductionWorker class.
