// Assignment 1.1: Java Program to Print Your Name
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);
    }
}

// Explanation: This program takes the user's name as input and prints it.
