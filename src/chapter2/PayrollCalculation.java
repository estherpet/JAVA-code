package chapter2;

import java.util.Scanner;

public class PayrollCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int number1 = input.nextInt();
        System.out.print("Enter an integer:");
        int number2 = input.nextInt();
        int a = number1 * number2;
        System.out.println("product is " + a);
// this is a simple payroll calculation

    }
}
