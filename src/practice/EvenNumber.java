package practice;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scannerObject.nextInt();
        if (number % 2 == 0)
                System.out.println("Even number");
            else
                System.out.println("odd number");

            }
        }

