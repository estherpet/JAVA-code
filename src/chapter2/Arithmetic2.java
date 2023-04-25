package chapter2;

import java.util.Scanner;

public class Arithmetic2 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter first number");

        int number1 = scannerObject.nextInt();

        System.out.println("Enter second number ");

        int number2 = scannerObject.nextInt();

        System.out.println("Enter third number");

        int number3 = scannerObject.nextInt();

        System.out.println("sum is :" + (number1 + number2 + number3));

        System.out.println("Average is: " + (number1 + number2 + number3) / (3));

        System.out.println("Product is :" + (number1 * number2 * number3));
        int smallestNumber = number1;
        if (number2 < number1) {
            smallestNumber = number2;
        } if (number3 < number1) {
            smallestNumber = number3;
        }
        System.out.println("The smallest number is " + smallestNumber);

        int largestNumber = number1;
        if (number2 > number1){
            largestNumber = number2;
            if (number3 > number1){
                largestNumber = number3;
            }
            System.out.println("The largest number is " + largestNumber);
        }
    }
}
