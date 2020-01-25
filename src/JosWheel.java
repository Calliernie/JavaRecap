/*code to allow user control over how many times he wants to
continue running a program by giving specific input in the console*/

import java.util.Scanner;

public class JosWheel {
    public static void main(String[] args) {
        re_run_keybd_input();
    }

    private static void re_run_keybd_input() {
        for (; ; ) {
            //initializations
            Scanner keywordInput = new Scanner(System.in);
            String keyboardInput_str = keywordInput.nextLine();

            String code_trigger_starter_str = "start";
            String code_trigger_ender_str = "end";

            int x = 0;
            int y = 5;

        /*setting an if condition that determines when to start or stop
            the program based on user input*/

            if (keyboardInput_str.equalsIgnoreCase(code_trigger_starter_str)) {
                //while loop used to print we are still in the while loop five times
                while (x < y) {
                    System.out.println("we are still in the while loop: " + Integer.toString(x));
                    x = x + 1;
                }
                //code to print we are out of while loop after the while loop ends
                System.out.println("We are out of the while loop");
                System.out.println();
            } else if (keyboardInput_str.equalsIgnoreCase(code_trigger_ender_str)) {
                //else if clause that executes when user enters end in the console
                System.out.println("GOODBYE!!!");
                break;
            } else {
                //code to run when user enters any other input aside start or end
                System.out.println("Please enter the correct code to run the program");
            }
        }
    }
}
