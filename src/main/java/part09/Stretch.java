package part09;
import java.util.Scanner;
import java.util.Random;
// Part 09 — CHECKPOINT. No video in this part.
// Reminders: while loops — part 07 · Scanner — part 03 · Random — part 05
// Video (only if you need it): https://www.youtube.com/watch?v=xk4_1vDrzzo
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
/*
35 5
7 is odd
4 is even
1 is odd
 */
public class Stretch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = 0;
        int n = 1;
        while (n < 20) {
            n = n * 2;
            count++;
        }
        System.out.println(n + " " + count);

        int x = 7;
        while (x > 0) {
            if (x % 2 == 0) {
                System.out.println(x + " is even");
            } else {
                System.out.println(x + " is odd");
            }
            x -= 3;

            int sum = 0;
            int i = 1;
            while (i <= 10) {
                sum += i;
                i++;
            }
            System.out.println("Sum: " + sum);
            int pick = 0;

            while (pick < 1 || pick > 10) {
                System.out.print("Pick a number from 1 to 10: ");
                pick = scanner.nextInt();
            }

            System.out.println("Thanks! You picked " + pick + ".");
        }
        int roll = 0;
        int rollsCount = 0;

        while (roll != 6) {

            roll = random.nextInt(6) + 1;
            rollsCount++;
            System.out.println("Rolled a " + roll);
        }

        System.out.println("It took " + rollsCount + " rolls to get a 6.");

    }

}
