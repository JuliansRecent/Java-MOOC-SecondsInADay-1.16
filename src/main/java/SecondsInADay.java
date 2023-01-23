
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Prompt the user for the amount of days they would like to convert to0 seconds
        System.out.println("How many days would you like to convert to seconds?");
        // Store the amount of days the user inputted
        int numberOfDays = Integer.valueOf(scanner.nextLine());
        // Convert the amount of days inputted to seconds in the numberOfSeconds variable
        int numberOfSeconds = numberOfDays * 86400;
        // Output the numberOfSeconds variable
        System.out.println(numberOfSeconds);
    }
}
