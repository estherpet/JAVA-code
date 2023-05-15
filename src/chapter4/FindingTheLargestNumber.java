package chapter4;

import java.util.Scanner;

public class FindingTheLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        for (int counter = 0;counter < 10;counter++){
            System.out.println("Enter a number :");
            int number = input.nextInt();

            if (number > largest){
                largest = number;

            }
            System.out.println("largest number is :" + largest);

        }


    }
}

