// Assignment 6.1: Package Structure with Student and Employee Classes
package collegeMgt.per1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// ---- Stored in package collegeMgt.stu ----
package collegeMgt.stu;
import collegeMgt.per1.Person;

public class Student extends Person {
    private int rollNo;
    private String branch;

    public Student(String name, int age, int rollNo, String branch) {
        super(name, age);
        this.rollNo = rollNo;
        this.branch = branch;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
    }
}

// ---- Stored in package collegeMgt.emp ----
package collegeMgt.emp;
import collegeMgt.per1.Person;

public class Employee extends Person {
    private int empId;
    private String doj;

    public Employee(String name, int age, int empId, String doj) {
        super(name, age);
        this.empId = empId;
        this.doj = doj;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + empId);
        System.out.println("Date of Joining: " + doj);
    }
}

public class Staff extends Employee {
    private String designation;

    public Staff(String name, int age, int empId, String doj, String designation) {
        super(name, age, empId, doj);
        this.designation = designation;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Designation: " + designation);
    }
}

public class Faculty extends Employee {
    private String designation;

    public Faculty(String name, int age, int empId, String doj, String designation) {
        super(name, age, empId, doj);
        this.designation = designation;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Designation: " + designation);
    }
}

// ---- Stored in package collegeMgt.mainpkg1 ----
package collegeMgt.mainpkg1;
import collegeMgt.per1.Person;
import collegeMgt.stu.Student;
import collegeMgt.emp.Staff;
import collegeMgt.emp.Faculty;

public class MainDemoClass {
    public static void main(String[] args) {
        Person person = new Person("John", 40);
        Student student = new Student("Alice", 20, 123, "CSE");
        Staff staff = new Staff("Bob", 35, 456, "2015-06-01", "Technical");
        Faculty faculty = new Faculty("Dr. Smith", 50, 789, "2010-08-15", "Professor");

        System.out.println("--- Person Details ---");
        person.display();

        System.out.println("\n--- Student Details ---");
        student.display();

        System.out.println("\n--- Staff Details ---");
        staff.display();

        System.out.println("\n--- Faculty Details ---");
        faculty.display();
    }
}

// Explanation: This program demonstrates a package structure with a base Person class and derived classes for Student, Staff, and Faculty.
