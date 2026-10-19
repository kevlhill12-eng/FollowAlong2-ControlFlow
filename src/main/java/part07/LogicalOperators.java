package part07;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        logical operators start at about 80:43 — stop at about 87:47
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 07 — the logical operators: && (and), || (or), ! (not)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called LogicalOperators.
//    Leave the "package part07;" line and the "public class LogicalOperators" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class LogicalOperators { // Defines the public class named LogicalOperators
    public static void main(String[] args) { // Main method where program execution begins

        int temp = 25; // Declares an integer variable 'temp' and assigns it the value 25
        if (temp > 30) { // Checks if temp is greater than 30
            System.out.println("It is hot outside!"); // Prints this message if the condition is true
        } else if (temp >= 20 && temp <= 30) { // Checks if temp is between 20 and 30 inclusive using the logical AND operator (&&)
            System.out.println("It is warm outside!"); // Prints this message if the condition is true
        } else { // Executes if none of the above conditions are true
            System.out.println("It is cold outside!"); // Prints this message as the fallback
        }
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object to read user input from the console
        System.out.println("You are playing a game! Press q or Q to quit"); // Prompts the user to press 'q' or 'Q' to quit
        String response = scanner.next(); // Reads the next token of input from the user and assigns it to 'response'

        if (response.equals("q") || response.equals("Q")) { // Checks if response equals "q" or "Q" using the logical OR operator (||)
            System.out.println("You quit the game"); // Prints this message if either condition is true
        } else { // Executes if the user did not enter 'q' or 'Q'
            System.out.println("You are still playing the game *pew pew*"); // Prints this message if the condition is false
        }

    }
}