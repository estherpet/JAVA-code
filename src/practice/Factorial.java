package practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        int num,factorial = 1;

        for (num = 1;num <= number;num++){
            factorial = factorial * num;
            System.out.println("factorial of " + number + " is " + factorial);
        }

    }
}
