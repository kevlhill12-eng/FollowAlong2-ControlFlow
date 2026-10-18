package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4525s
//        switches start at about 75:25 — stop at about 80:18
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 06 — switch, case, break, default
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Switches.
//    Leave the "package part06;" line and the "public class Switches" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class Switches { // Defines the public class named Switches
    public static void main(String[] args) { // Main method where program execution begins
        String day = "Monday"; // Declares a String variable 'day' and assigns it the value "Monday"
        switch(day) { // Evaluates the value of the 'day' variable to match against cases
            case "Sunday": // Checks if day equals "Sunday"
                System.out.println("It is Sunday"); // Prints this message if the match is true
                break; // Exits the switch block
            case "Monday": // Checks if day equals "Monday"
                System.out.println("It is Monday"); // Prints this message if the match is true
                break; // Exits the switch block
            case "Tuesday": // Checks if day equals "Tuesday"
                System.out.println("It is Tuesday"); // Prints this message if the match is true
                break; // Exits the switch block
            case "Wednesday": // Checks if day equals "Wednesday"
                System.out.println("It is Wednesday"); // Prints this message if the match is true
                break; // Exits the switch block
            case "Thursday": // Checks if day equals "Thursday"
                System.out.println("It is Thursday"); // Prints this message if the match is true
                break; // Exits the switch block
            case "Friday": // Checks if day equals "Friday"
                System.out.println("It is Friday"); // Prints this message if the match is true
                break; // Exits the switch block
            case "Saturday": // Checks if day equals "Saturday"
                System.out.println("It is Saturday"); // Prints this message if the match is true
                break; // Exits the switch block
            default:
                // Executes if none of the above case matches are met
                System.out.println(day+ " is not a day");
                // Prints this message as the fallback

        }
    }
}
