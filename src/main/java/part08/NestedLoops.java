package part08;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5836s
//        starts at 1:37:16 — stop at about 1:42:48, at "well ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 6–10
//
// Part 08 — nested loops (a loop inside another loop)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called NestedLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//    When you type Scanner, IntelliJ will want an import. See the README.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

import java.util.Scanner; // bring in scanner to read user input

public class NestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object

        int rows; // declare variable for row count
        int columns; // declare variable for column count
        String symbol = ""; // declare variable for the character/symbol to print

        System.out.println("Enter number of rows:"); // prompt for the number of rows
        rows = scanner.nextInt(); // read the row input from the user
        System.out.println("Enter number of columns:"); // prompt for the number of columns
        columns = scanner.nextInt(); // read the column input from the user
        System.out.println("Enter symbol to use:"); // prompt for the symbol
        symbol = scanner.next(); // read the symbol input

        for (int i = 1; i <= rows; i++) { // outer loop to handle each row
            System.out.println(); // move down to a new line for the row
            for (int j = 1; j <= columns; j++) { // inner loop to print columns across the row
                System.out.print(symbol); // print the symbol without breaking the line
            }
        }
    }
}