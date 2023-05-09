package chapter4;

import java.util.Scanner;

public class FindingTheLargestNumber {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        for (int counter = 0;counter < 10;counter++){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number");
            int number = input.nextInt();
            int largest = number;
            if (number > largest) {
                largest = number;
            }
            System.out.println("The largest number is :" + largest);
        }

    }
}
