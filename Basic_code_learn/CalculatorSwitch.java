// Create a program to create a simple calculator that uses a
// switch statement to perform basic arithmetic operations
// like addition, subtraction, multiplication, and division.

import java.util.Scanner;

public class CalculatorSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- simple calculator that uses a switch statement --- ");

        System.out.print("Enter number 1 : ");

        int num1 = input.nextInt();

        System.out.print("Enter number 2 : ");

        int num2 = input.nextInt();

        System.out.print("Enter operation( + | - | / | * ) you want to perform =  : ");

        char operator = input.next().charAt(0);

        double result = switch (operator) {

            case '+' ->
                num1 + num2;

            case '*' ->
                num1 * num2;
            case '-' ->
                num1 - num2;
            case '/' ->
                (double)num1 / num2;

            default -> 0;
            };


            System.out.print(num1 + " " + operator + " " + num2 + " = " + result);

    }
}
