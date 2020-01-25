import java.util.Scanner;

public class JosWheel {
    static Scanner keywordInput = new Scanner(System.in);

    public static void main(String[] args) {
        startProgram();
    }

    //method to start the whole program
    public static void startProgram() {
        for (; ; ) {
            //initializations
            String code_trigger_starter_str = "start";
            String code_trigger_ender_str = "end";
            String prompt = "Enter start to run the program";

            System.out.println(prompt);
            String keyboardInput_str = keywordInput.nextLine();

            if (keyboardInput_str.equalsIgnoreCase(code_trigger_starter_str)) {
                keepTyping();
                break;
            } else if (keyboardInput_str.equalsIgnoreCase(code_trigger_ender_str)) {
                System.out.println("Program has ended");
                break;
            } else {
                //System.out.println(prompt);
            }
        }
    }

    //method that keeps printing what users types and ends when he types end
    public static void keepTyping() {
        for (; ; ) {
            String code_trigger_ender_str = "end";
            String userInput = keywordInput.nextLine();

            if (userInput.equalsIgnoreCase(null) || userInput.length() == 0) {
                userInput = "Invalid input, enter a string to continue";
                System.out.println(userInput);
            } else if (!userInput.equalsIgnoreCase(code_trigger_ender_str)) {
                System.out.println(userInput);
            } else {
                System.out.println("Program has ended");
                break;
            }
        }
    }
}