// Assignment 6: Payroll Class
import java.util.Scanner;

class Payroll {
    private String name;
    private int idNumber;
    private double hourlyPayRate;
    private double hoursWorked;

    public Payroll(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public void setPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getGrossPay() {
        return hourlyPayRate * hoursWorked;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Gross Pay: $" + getGrossPay());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee ID number: ");
        int id = scanner.nextInt();

        Payroll payroll = new Payroll(name, id);
        System.out.print("Enter hourly pay rate: ");
        payroll.setPayRate(scanner.nextDouble());
        System.out.print("Enter hours worked: ");
        payroll.setHoursWorked(scanner.nextDouble());

        payroll.display();
    }
}
