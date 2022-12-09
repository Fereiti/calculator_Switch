import java.util.Scanner;

public class Switch {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    double num1 = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Enter the second number: ");
    double num2 = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Which operation are you applying?: ");
    String operation = scanner.nextLine();

    switch (operation) {
      case "sum":
        System.out.printf("The sum is: %f + %f = %f", num1, num2, num1 + num2);
        break;
      case "sub":
        System.out.printf("The difference is: %f - %f = %f", num1, num2, num1 - num2);
        break;
      case "mul":
        System.out.printf("The product is: %f * %f = %f", num1, num2, num1 * num2);
        break;
      case "div":
        if (num1 == 0) {
          System.out.println("The division is not defined.");
        } else if (num2 == 0) {
          System.out.println("Cannot divide by zero.");
        } else {
          System.out.printf("The division is: %f / %f = %f", num1, num2, num1 / num2);
        }
        break;
      default:
        System.out.printf("%s is not a supported operation.", operation);
    }
    scanner.close();

  }
}