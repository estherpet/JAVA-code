package chapter2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
    Scanner scannerObject = new Scanner(System.in);

    System.out.println("Enter a number");

    int number1 = scannerObject.nextInt();

    System.out.println("Enter a number");

    int number2 = scannerObject.nextInt();

    System.out.println("Square is :" + (number1 * number1) );

    System.out.println("Square is : " + (number2 * number2));

    int sumOfSquare = (number1 * number1) + (number2 * number2);

    System.out.println("Sum of square is :" + sumOfSquare);
    int differenceOfSquare = (number1 * number1) - (number2 * number2);

    System.out.println("Difference of square is :" + differenceOfSquare);

  }

}
