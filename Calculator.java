import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String again;

        do {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /, %): ");
            char op = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            switch (op) {
                case '+':
                    System.out.println("Result: " + (a + b));
                    break;
                case '-':
                    System.out.println("Result: " + (a - b));
                    break;
                case '*':
                    System.out.println("Result: " + (a * b));
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Error: cannot divide by zero");
                    } else {
                        System.out.println("Result: " + (a / b));
                    }
                    break;
                case '%':
                    if (b == 0) {
                        System.out.println("Error: cannot divide by zero");
                    } else {
                        System.out.println("Result: " + (a % b));
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
            }

            System.out.print("Calculate again? (y/n): ");
            again = sc.next();
        } while (again.equalsIgnoreCase("y"));

        System.out.println("Bye!");
        sc.close();
    }
}
