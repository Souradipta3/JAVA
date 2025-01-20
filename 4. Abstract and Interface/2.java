// Assignment 4.2: Abstract Class Accounts and Subclasses
abstract class Accounts {
    protected double balance;
    protected int accountNo;
    protected String holdersName;

    public Accounts(int accountNo, String holdersName, double balance) {
        this.accountNo = accountNo;
        this.holdersName = holdersName;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    public void display() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Holder's Name: " + holdersName);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends Accounts {
    private double rateOfInterest;

    public SavingsAccount(int accountNo, String holdersName, double balance, double rateOfInterest) {
        super(accountNo, holdersName, balance);
        this.rateOfInterest = rateOfInterest;
    }

    public double calculateAmount() {
        return balance + (balance * rateOfInterest / 100);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
    }
}

class CurrentAccount extends Accounts {
    private double overDraftLimit;

    public CurrentAccount(int accountNo, String holdersName, double balance, double overDraftLimit) {
        super(accountNo, holdersName, balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > (balance + overDraftLimit)) {
            System.out.println("Exceeds overdraft limit.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Overdraft Limit: $" + overDraftLimit);
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(12345, "Alice", 5000.0, 3.5);
        CurrentAccount current = new CurrentAccount(67890, "Bob", 2000.0, 1000.0);

        System.out.println("--- Savings Account Details ---");
        savings.display();
        savings.deposit(500);
        savings.withdraw(200);
        System.out.println("Total Amount with Interest: $" + savings.calculateAmount());

        System.out.println("\n--- Current Account Details ---");
        current.display();
        current.withdraw(2500);
        current.deposit(1000);
    }
}
