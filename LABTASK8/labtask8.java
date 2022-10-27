import java.util.Scanner;

class labtask8 {
  public static void main(String[] args) {

    char operator = 'h';
    double number1 = 0.0, number2 = 0.0, result = 0.0;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();

  }
}