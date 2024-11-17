import java.util.Scanner;

public class Main {
    
    // Method to display a general greeting message
    public static void displayGreeting() {
        System.out.println("====================================");
        System.out.println("Welcome to the Java Greeting Program!");
        System.out.println("====================================\n");
    }

    // Method to get user's name and greet them personally
    public static void greetUser() {
        // Creating a scanner object to read input from the console
       

        
            System.out.println("Hello, DEVOPS ! It's great to meet you.");
        
        // Closing the scanner to avoid resource leaks
       
    }

    public static void main(String[] args) {
        // Display the general greeting message
        displayGreeting();
        
        // Greet the user with their name
        greetUser();
        
        // Display a farewell message
        System.out.println("\nThank you for using the Java Greeting Program. Have a great day!");
    }
}
