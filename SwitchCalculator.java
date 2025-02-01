import java.util.Scanner;
public class SwitchCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator");
        Scanner scanner = new Scanner(System.in);
        String response;

        do {
            System.out.println("Please enter your choice of operation by typing it's corresponding letter.");
            System.out.println("[A] Addition");
            System.out.println("[S] Subtraction");
            System.out.println("[M] Multiplication");
            System.out.println("[D] Divison");
            System.out.println("[E] Exit");
            System.out.println("Enter your choice: ");
            response = scanner.next().toUpperCase();

            switch (response) {
                case "A":
                    System.out.println("Enter the first number: ");
                    double firstNumber = scanner.nextDouble();
                    System.out.println("Enter the second number: ");
                    double secondNumber = scanner.nextDouble();
                    System.out.println("The result is: " + (firstNumber + secondNumber));
                    break;

                case "S":
                    System.out.println("Enter the first number: ");
                    double firstNumber1 = scanner.nextDouble();
                    System.out.println("Enter the second number: ");
                    double secondNumber1 = scanner.nextDouble();
                    System.out.println("The result is: " + (firstNumber1 - secondNumber1));
                    break;

                case "M":
                    System.out.println("Enter the first number: ");
                    double firstNumber2 = scanner.nextDouble();
                    System.out.println("Enter the second number: ");
                    double secondNumber2 = scanner.nextDouble();
                    System.out.println("The result is: " + (firstNumber2 * secondNumber2));
                    break;

                case "D":
                    System.out.println("Enter the first number: ");
                    double firstNumber3 = scanner.nextDouble();
                    System.out.println("Enter the second number: ");
                    double secondNumber3 = scanner.nextDouble();
                    if (secondNumber3 == 0) {
                        System.out.println("Division by zero is not allowed.");
                    } else {
                        System.out.println("The result is: " + (firstNumber3 / secondNumber3));
                    }
                    System.out.println("The result is: " + (firstNumber3 / secondNumber3));
                    break;

                case "E":
                    System.out.println("Exiting calculator.");
                    break;

                default:
                    System.out.println("Invalid choice buddy.");
                    break;
            }
        } while (!response.equals("E"));
    }
}