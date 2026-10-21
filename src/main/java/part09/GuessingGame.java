package part09;

import java.util.Random;
import java.util.Scanner;

// Part 09 — CHECKPOINT. No video in this part.
// Video (only if you need a reminder): https://www.youtube.com/watch?v=xk4_1vDrzzo
//   user input (Scanner) — part 03 · random numbers — part 05
//   if statements — part 06 · while loops — part 07
//
// SECTION A — BUILD: write a number guessing game in this class, starting from nothing.
//    The README has the full list of rules and a sample run.
//    Leave the "package part09;" line and the class line alone. Type everything else,
//    including main and the import lines.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.


public class GuessingGame { // define the class
    public static void main(String[] args) { // main method entry point

        Scanner scanner = new Scanner(System.in); // create a scanner object to read user input
        Random random = new Random(); // create a random object to generate numbers

        int secretNumber = random.nextInt(100) + 1; // generate a random secret number from 1 to 100
        int guess = 0; // initialize the user guess variable to 0
        int guessesCount = 0; // initialize the guess counter to 0

        System.out.println("I'm thinking of a number between 1 and 100."); // print the game intro message

        while (guess != secretNumber) { // loop as long as the guess is wrong
            System.out.print("Your guess: "); // prompt the user to enter a guess
            guess = scanner.nextInt(); // read the user's integer guess
            guessesCount++; // add one to the total guess count

            if (guess > secretNumber) { // check if the guess is higher than the secret number
                System.out.println("Too high!"); // print that the guess was too high
            } else if (guess < secretNumber) { // check if the guess is lower than the secret number
                System.out.println("Too low!"); // print that the guess was too low
            } else { // if it's not high or low, it must be right
                System.out.println("Correct! You got it in " + guessesCount + " guesses."); // print win message with count
            } // end of if-else block
        } // end of while loop
    } // end of main method
} // end of class


