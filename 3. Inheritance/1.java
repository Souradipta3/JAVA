// Assignment 3.1: College, DepartmentFaculty, and Department Classes
class College {
    protected String collegeName;
    protected String address;

    public College(String collegeName, String address) {
        this.collegeName = collegeName;
        this.address = address;
    }

    public void showDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Address: " + address);
    }
}

class DepartmentFaculty extends College {
    private String name;
    private int experience;

    public DepartmentFaculty(String collegeName, String address, String name, int experience) {
        super(collegeName, address);
        this.name = name;
        this.experience = experience;
    }

    public void showFacultyDetails() {
        showDetails();
        System.out.println("Faculty Name: " + name);
        System.out.println("Experience: " + experience + " years");
    }
}

class Department extends College {
    private String deptName;
    private String hodName;

    public Department(String collegeName, String address, String deptName, String hodName) {
        super(collegeName, address);
        this.deptName = deptName;
        this.hodName = hodName;
    }

    public void showDeptDetails() {
        showDetails();
        System.out.println("Department Name: " + deptName);
        System.out.println("HOD Name: " + hodName);
    }
}

public class CollegeHierarchy {
    public static void main(String[] args) {
        DepartmentFaculty faculty = new DepartmentFaculty("RCC Institute", "Kolkata", "Dr. Sen", 15);
        Department department = new Department("RCC Institute", "Kolkata", "CSE", "Dr. Das");

        System.out.println("--- Faculty Details ---");
        faculty.showFacultyDetails();

        System.out.println("\n--- Department Details ---");
        department.showDeptDetails();
    }
}

// Explanation: This implementation demonstrates inheritance with a College class and its subclasses.
