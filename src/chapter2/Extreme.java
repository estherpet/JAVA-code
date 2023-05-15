package chapter2;

import java.util.Scanner;

public class Extreme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many value the application should have :");
        int number = input.nextInt();
        int min = number;
        int max = number;
        for (int count = 0; count < number; count++) {
            System.out.println("Enter number:");
            int numbers = input.nextInt();

            if (numbers < min) {
                min = numbers;
            }
            if (numbers > max) {
                max = numbers;
            }


        }
        System.out.println("Minimum number is :" + min);
        System.out.println("Maximum number is :" + max);
        System.out.println("sum of the minimum and maximum is : "+ (min + max));

    }
}
