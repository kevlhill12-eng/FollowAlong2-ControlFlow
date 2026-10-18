package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4128s
//        if statements start at about 68:48 — stop at about 74:54
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 06 — if, else if, else
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called IfStatements.
//    Leave the "package part06;" line and the "public class IfStatements" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// Defines the public class named IfStatements
public class IfStatements {
    // Main method where program execution begins
    public static void main(String[] args) {
        // Declares an integer variable 'age' and assigns it the value 12

        int age = 12;
        // Checks if age is exactly 75
        if (age >= 18) { // Checks if age is greater than or equal to 18
            System.out.println("You are an adult!"); // Prints this message if the condition is true
        } else if (age == 75) {
            // Prints this message if the condition is true
            System.out.println("OK boomer");
            // Checks if age is greater than or equal to 13
        } else if (age >= 13) {
            // Prints this message if the condition is true
            System.out.println("You are a teenager!");
        } else {
            // Executes if none of the above conditions are true
            System.out.println("You are not an adult!");

        }
    }
}
