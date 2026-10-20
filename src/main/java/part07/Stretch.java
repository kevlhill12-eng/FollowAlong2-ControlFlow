package part07;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4895s
//        rewatch 81:35–87:47 for && || !, 89:29–91:54 for while
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// If your program never stops: click the red square (Stop) in the Run window.
/*
true
false
true
false
count is 3
count is 2
count is 1
done
 */
public class Stretch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = 7;
        System.out.println(x > 5 && x < 10);
        System.out.println(x > 5 && x > 10);
        System.out.println(x < 5 || x == 7);
        System.out.println(!(x == 7));
        int count = 3;
        while (count > 0) {
            System.out.println("count is " + count);
            count = count - 1;
        }
        System.out.println("done");

        int i = 5;
        while (i > 0){
            System.out.println(i);
            i = i - 1;
        }
        System.out.println("Liftoff!");


        String password = "";

        while (!password.equals("java123")){
            System.out.print("Password: ");
             password = scanner.nextLine();
        }
        System.out.println("Access granted");

        int i2 = 0;

        while (1 <= i2 || 10 >= i2){
            System.out.println("Pick a number from 1 to 10: " );
            i2 = scanner.nextInt();
        }
        System.out.println("You picked "+ i2);
    }

}

