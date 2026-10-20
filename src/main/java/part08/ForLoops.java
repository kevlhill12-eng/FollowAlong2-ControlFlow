package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5557s
//        starts at 1:32:37 — stop at about 1:36:20, before "if you would like a copy"
// Guide: GUIDE.md in this folder, steps 1–5
//
// Part 08 — for loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ForLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){ // count up from 0 to 10
            System.out.println(i); // print the current number
        }

        for (int i = 10; i >= 0; i--){ // count down from 10 to 0 by ones
            System.out.println(i); // print the countdown number
        }
        System.out.println("Happy New Year!"); // print the celebration message

        for (int i = 10; i >= 0; i-= 2){ // count down from 10 to 0 by twos
            System.out.println(i); // print the current number
        }
        System.out.println("Happy New Year!"); // print the celebration message again

        for (int i = 10; i >= 0;) { // count down starting at 10 with no update in the header
            System.out.println(i); // print the number
            i -= 2; // manually decrement by 2 inside the loop body
        }
        System.out.println("Happy New Year!"); // print the final celebration message
    }
}
