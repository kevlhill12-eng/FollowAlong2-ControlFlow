package part07;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5302s
//        while loops start at about 88:22 — stop at about 91:54
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 07 — while loops and do-while loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WhileLoops.
//    Leave the "package part07;" line and the "public class WhileLoops" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
//
// If your program never stops: click the red square (Stop) in the Run window.

public class WhileLoops { // Defines the public class named WhileLoops
    public static void main(String[] args) { // Main method where program execution begins
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object to read user input from the console

        String name = ""; // Declares a String variable 'name' and initializes it as an empty string

        while (name.isBlank()) { // Starts a while loop that runs as long as 'name' is blank or empty
            System.out.print("Enter your name: "); // Prompts the user to enter their name without moving to a new line
            name = scanner.nextLine(); // Reads the text entered by the user and assigns it to 'name'
        } // Closes the while loop block
        System.out.println("Hello " + name); // Prints a greeting message combined with the user's name
        do { // Starts a do-while loop block that executes at least once before checking the condition
            System.out.print("Enter your name: "); // Prompts the user again to enter their name

            name = scanner.nextLine(); // Reads the new text entered by the user and assigns it to 'name'

        } while (name.isBlank()); // Checks the condition at the end of the loop, repeating if 'name' is still blank
    } // Closes the main method block
} // Closes the class block
