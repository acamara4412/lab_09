import java.util.Scanner;

public class SafeInput {
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); // clear buffer
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("Error: Number must be between " + low + " and " + high + ". You said: " + retVal);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Error: You must enter a valid integer. You said: " + trash);
            }
        } while (!done);

        return retVal;
    }
}