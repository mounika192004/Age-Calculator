import java.time.Year;
import java.util.Scanner;

public class AgeCalculator {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Age Calculator!");
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Get the current year
        int currentYear = Year.now().getValue();

        // Calculate the age
        if (birthYear > currentYear) {
            System.out.println("Error: Birth year cannot be in the future.");
        } else {
            int age = currentYear - birthYear;
            System.out.println("Your age is: " + age + " years.");
        }

        scanner.close();
    }
}
