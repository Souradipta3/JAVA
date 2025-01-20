// ---- Part 1: Person Class Stored in the `per2` Package ----
package geometry.per2;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;

    // Constructor
    public Person(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Mutator and Accessor Methods
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Display method to show Person details
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }
}

// ---- Part 2: Customer Class Stored in the `cust` Package ----
package geometry.cust;
import geometry.per2.Person;

public class Customer extends Person {
    private int customerNumber;
    private boolean mailingList;

    // Constructor
    public Customer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    // Mutator and Accessor Methods
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    // Display method to show Customer details
    public void displayCustomerInfo() {
        displayPersonInfo();
        System.out.println("Customer Number: " + customerNumber);
        System.out.println("Wants to be on Mailing List: " + mailingList);
    }
}

// ---- Part 3: Main Class Stored in the `mainpkg3` Package ----
package geometry.mainpkg3;
import geometry.cust.Customer;

public class MainClass {
    public static void main(String[] args) {
        // Create Customer object and input data
        Customer customer = new Customer("Alice", "123 Main St", "555-1234", 101, true);

        // Display Customer Information
        customer.displayCustomerInfo();
    }
}
