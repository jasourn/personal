import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean validAnswer = false;
        boolean playAgain = true;

        System.out.println("Welcome to Number Guesser!\nPlease choose an option:\n[P] Play\n[E] Exit");
        switch (scanner.next().toUpperCase()) {
            case "P":
                while (playAgain) {
                    int upperLimit = 0;
                    int lowerLimit = 1;
                    boolean validChoice = false;
                    while (!validChoice) {

                        System.out.println("Please choose an option: ");
                        System.out.println("[B] Beginner\n[M] Medium\n[H] Hard\n[C] Custom");
                        System.out.println("Enter your choice's letter in the brackets: ");

                        switch (scanner.next().toUpperCase()) {
                            case "B":
                                upperLimit = 50;
                                validChoice = true;
                                System.out.println("Your range is 1 to 50.");
                                break;

                            case "M":
                                upperLimit = 100;
                                validChoice = true;
                                System.out.println("Your range is 1 to 100.");
                                break;

                            case "H":
                                upperLimit = 250;
                                validChoice = true;
                                System.out.println("Your range is 1 to 250.");
                                break;

                            case "C":
                                boolean validRange = false;
                                while (!validRange) {
                                    System.out.println("Please enter your minimum number:");
                                    lowerLimit = scanner.nextInt();
                                    System.out.println("Please enter your maximum number:");
                                    upperLimit = scanner.nextInt();

                                    if (lowerLimit < 1 || upperLimit < 1) {
                                        System.out.println("Invalid range. Both numbers must be positive. Please try again.");
                                    } else if (lowerLimit >= upperLimit) {
                                        System.out.println("Invalid range. The minimum must be less than the maximum. Please try again.");
                                    } else {
                                        validRange = true;
                                        validChoice = true;
                                        System.out.println("Your range is " + lowerLimit + " to " + upperLimit + ".");
                                    }
                                }
                                break;

                            default:
                                System.out.println("Invalid choice! Enter 'B', 'M', 'H', or 'C' to continue.");
                                break;
                        }
                    }

                    int targetNumber = random.nextInt((upperLimit - lowerLimit) + 1) + lowerLimit;
                    System.out.println("Start guessing!");

                    int guess;

                    do {
                        guess = scanner.nextInt();
                        if (guess < lowerLimit || guess > upperLimit) {
                            System.out.println("Your guess must be between " + lowerLimit + " and " + upperLimit + ". Try again.");
                        } else if (guess < targetNumber) {
                            System.out.println("Too low! Try again.");
                        } else if (guess > targetNumber) {
                            System.out.println("Too high! Try again.");
                        } else {
                            System.out.println("You got it right!");
                        }
                    } while (guess != targetNumber);

                     do {
                        System.out.println("Do you want to continue playing?\n[Y] Yes\n[N] No\nEnter your choice:");
                        String again = scanner.next().toUpperCase();
                        scanner.nextLine();
                        if (again.equals("N")) {
                            playAgain = false;
                            validAnswer = true;
                            System.out.println("Bye! Thank you for playing.");
                            scanner.close();
                            System.exit(0);
                        } else if (again.equals("Y")) {
                            playAgain = true;
                            validAnswer = true;
                        } else {
                            System.out.println("Invalid choice! Enter 'Y' or 'N' to continue.");
                        }
                    } while (!validAnswer);
                }
        break;
            case "E":
                validAnswer = true;
                playAgain = false;
                System.out.println("Exiting... Bye!");
                System.exit(0);
                break;
        }
        while (playAgain) ;

        scanner.close();
    }
}